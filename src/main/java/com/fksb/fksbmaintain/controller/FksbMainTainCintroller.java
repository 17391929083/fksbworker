package com.fksb.fksbmaintain.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbmaintain.model.FksbMainTainVO;
import com.fksb.fksbmaintain.service.FksbMainTainService;
import com.fksb.utill.HttpUtil;
import com.fksb.utill.WeiXinInfoUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller
@RequestMapping("fksbMainTainCintroller")
public class FksbMainTainCintroller {


    @Autowired
    private FksbMainTainService fksbMainTainService;


    /**
     * 维护页面跳转
     * */
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("/maintain/maintain");

     return view;
    }




    /*返回提示成功页面*/
    @RequestMapping("successresult")
    public ModelAndView successresult(Model model){
        ModelAndView view=new ModelAndView();
        model.addAttribute("exception","恭喜你!更换成功");
        model.addAttribute("tishi","无异常");
        model.addAttribute("returnsys","/fksbworker/fksbMainTainCintroller/index");
        model.addAttribute("returnhome","/fksbworker/workHomeController/index");
        view.setViewName("/error/exception");
      return view;
    }

    /*返回提示失败页面*/
    @RequestMapping("errorresult")
    public ModelAndView errorresult(Model model){
        ModelAndView view=new ModelAndView();
        model.addAttribute("exception","注册失败");
        model.addAttribute("tishi","异常");
        model.addAttribute("returnsys","/fksbworker/fksbMainTainCintroller/index");
        model.addAttribute("returnhome","/fksbworker/workHomeController/index");
        view.setViewName("/error/exception");
        return view;
    }



    //更换水表
    @ResponseBody
    @PostMapping("/changEquiid")
    public  JSONObject  changEquiid(FksbMainTainVO fksbMainTainVO){
        Map<String,Object> map=new HashMap<String,Object>();
        int changesign = fksbMainTainService.changEquiid(fksbMainTainVO);
        map.put("changesign",changesign);
        return (JSONObject) JSONObject.toJSON(map);
    }



    /**
     *  多文件多线程上传
     * */
    @ResponseBody
    @PostMapping("/picuPload")
    public JSONObject picuPload(MultipartFile file) throws InterruptedException {
        Map<String,Object> map=new HashMap<String,Object>();
        if(file!=null){
          String fileName=  file.getOriginalFilename();
            int  indexdot =  fileName.indexOf(".");
           String  suffix =  fileName.substring(indexdot);

          String   fName = fileName.substring(0,fileName.lastIndexOf("."));
            Date now = new Date();
            fName =now.getTime()+"";
            fName =  fName  + suffix;

            System.out.println(file.getOriginalFilename());
        String path = "/usr/local/tomcat8/webapps/uploadpic/" +fName ;
        File files = new File(path);

        try {
            file.transferTo(files);
            map.put("code",0);
            map.put("imgName",fName);
            map.put("imgs1","/uploadpic/"+fName );
        } catch (IOException e) {
            map.put("code",1);
        }
        }else{
            map.put("code",1);
      }
      return (JSONObject) JSONObject.toJSON(map);
    }

    /**
     *  从微信服务器端获取图片和处理图片
     * */
    @ResponseBody
    @PostMapping("/getwxpic")
    public JSONObject getwxpic(String serverId){
        //获取tooken
        String srcName = WeiXinInfoUtill.saveImageToDisk(serverId);

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("src","/uploadpic/"+srcName);
        return (JSONObject) JSONObject.toJSON(map);
        


    }







    
}
