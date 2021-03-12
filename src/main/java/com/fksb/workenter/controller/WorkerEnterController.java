package com.fksb.workenter.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.workenter.model.SysAccountVO;
import com.fksb.workenter.model.SysUserVO;
import com.fksb.workenter.service.WorkerEnterService;
import com.fksb.worker.model.WxBdWaterVO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Validated
@Controller
@RequestMapping("workerEnterController")
public class WorkerEnterController {

    @Autowired
    private WorkerEnterService workerEnterService;


    @Autowired
    private  HttpSession session;

    
    @RequestMapping("index")
    public ModelAndView  index(String fromUserName){
        ModelAndView view=new ModelAndView();
        //数据库查询是否实名认证
        List<WxBdWaterVO> wxBdWaterVOS = workerEnterService.checkBdWater(fromUserName);

        //如果用户没有认证跳转认证页面
        if(wxBdWaterVOS.size()>0){
            session.setAttribute("fromUserName",fromUserName);
            session.setAttribute("userinfo",wxBdWaterVOS.get(0));
             view.setViewName("/enter/enter");
        }else{

            view.setViewName("/login/login");

        }

        return view;


     }



    @PostMapping("entering")
    @ResponseBody
    public JSONObject entering(@Valid SysAccountVO sysAccountVO, BindingResult result){
        Map<String,Object> map=new HashMap<>();
        //处理数据格式错误
        if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError error:fieldErrors) {
                map.put(error.getField(),error.getDefaultMessage());
            }
            map.put("result","1");
            return (JSONObject) JSONObject.toJSON(map);

        }
        SysUserVO sysUserVO = workerEnterService.selectByExample(sysAccountVO);
        if(sysUserVO==null){
            map.put("result","1");
        }else{
            //正确
            session.setAttribute("orgCd",sysUserVO.getOrgCd());
            map.put("result","0");
        }
        return (JSONObject) JSONObject.toJSON(map);
    }


}
