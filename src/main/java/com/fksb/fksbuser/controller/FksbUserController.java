package com.fksb.fksbuser.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbuser.model.FksbUserVO;
import com.fksb.fksbuser.service.FksbUserService;
import com.fksb.supportmothord.model.WtWaterpriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller
@RequestMapping("fksbUserController")
public class FksbUserController {

    @Autowired
    private FksbUserService fksbUserService;



    @RequestMapping("index")
    public ModelAndView index(){
     ModelAndView view=new ModelAndView("/user/user");
     return view;
    }

   /*用水户信息提交*/
    @PostMapping("userData")
    @ResponseBody
    public synchronized JSONObject  userData(FksbUserVO fksbUserVO){
        Map<String, Object> map =new HashMap<String, Object>();


        int boole = fksbUserService.inserMprZncb(fksbUserVO);

        map.put("boole",boole);
        return (JSONObject) JSONObject.toJSON(map);
    }


     /*加载用水类型*/
    @ResponseBody
    @PostMapping("waterTypes")
    public JSONObject  waterTypes(){

        Map<String, Object> map =new HashMap<String, Object>();

        List<WtWaterpriceVO> wtWaterpriceVOS = fksbUserService.waterType();

        map.put("list",wtWaterpriceVOS);

        return (JSONObject) JSONObject.toJSON(map);
    }






   




    





    
}
