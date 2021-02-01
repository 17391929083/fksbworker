package com.fksb.worker.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.worker.model.WxBdWaterVO;
import com.fksb.worker.service.WxBdWaterService;
import com.fksb.worker.utill.RandUtil;
import com.sun.istack.internal.logging.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller
@RequestMapping("wxbdController")
public class WxBdWaterController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private WxBdWaterService wxBdWaterService;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    @Autowired
    private HttpSession session;

    @RequestMapping("index")
    public ModelAndView index(String fromUserName){
        ModelAndView view=new ModelAndView();
        session.setAttribute("fromUserName",fromUserName);

        view.setViewName("/login/login");
        return view;
    }

    /*
    * 短信验证码生成
    * */
    @RequestMapping("getMessages")
    @ResponseBody
    public JSONObject  getMessages(String fromUserName,String phone){
        Map<String,Object> map=new HashMap<>();
        String randNum= RandUtil.getRandNum();
        session.setAttribute("fromUserName",fromUserName);
        session.setAttribute(fromUserName,randNum);
        session.setAttribute(fromUserName+randNum, LocalTime.now());
        logger.info(randNum+"已经生成");
        map.put("code",randNum);
        //通过rabbitmq发送短信验证码
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.convertAndSend(RandUtil.PHONE_MESSAGE,RandUtil.sendMessages(phone,randNum));
      return (JSONObject) JSONObject.toJSON(map);
    }

    /*
     * 短信验证码验证
     * */
    @PostMapping("checkMessages")
    @ResponseBody
    public JSONObject  checkMessages(String fromUserName,String newCode) throws InterruptedException {
        Map<String,Object> map=new HashMap<>();
        Object codeTime = session.getAttribute(fromUserName+newCode);
        if (codeTime==null){
            logger.info("验证码错误");
            map.put("info","-1");

        }else{
                LocalTime oldTime = LocalTime.parse(codeTime.toString(),DateTimeFormatter.ISO_TIME);
                Duration per = Duration.between(oldTime, LocalTime.now());
                logger.info("相差时间"+per.getSeconds());
                if (per.getSeconds()<60){
                    Object oldcode = session.getAttribute(fromUserName);
                    if (oldcode.equals(newCode)){
                        logger.info("验证码正确");
                        map.put("info","0");
                    }
                }else{
                    logger.info("验证码超时");
                    map.put("info","1");
                }
        }
        return (JSONObject) JSONObject.toJSON(map);
    }



    /*提交工人信息*/
    @RequestMapping("insertWorks")
    @ResponseBody
    public JSONObject  insertWorks(WxBdWaterVO record){
        Map<String,Object> map=new HashMap<>();
        try{
       int  signInsert=wxBdWaterService.insertSelective(record);
        map.put("signInsert",signInsert);
        }catch (Exception e){
            e.printStackTrace();

        }
        return (JSONObject) JSONObject.toJSON(map);
    }


    /*登录超时*/
    @RequestMapping("sessionout")
    public ModelAndView sessionout(){
        ModelAndView view=new ModelAndView();
        view.setViewName("/error/sessionout");
        return view;
    }


}
