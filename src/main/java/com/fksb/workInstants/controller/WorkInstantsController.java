package com.fksb.workInstants.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.workInstants.service.WorkInstantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller()
@RequestMapping("workInstantsController")
public class WorkInstantsController {


    @Autowired
    private WorkInstantsService workInstantsServiceImpl;

    /*
    * 访问安装数量
    * */
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("/myInstalls/myInstalls");

       return view;
    }

    /*
     * 查找安装的水表
     * */
    @RequestMapping("instantsNumber")
    @ResponseBody
    public JSONObject instantsNumber(){
        Map<String, Object> map = workInstantsServiceImpl.instantsNumber();
        return (JSONObject) JSONObject.toJSON(map);
    }


}
