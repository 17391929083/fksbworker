package com.fksb.fksbselect.controller;

import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbselect.model.FksbDataMprRtrVO;
import com.fksb.fksbselect.model.FksbInfoZncbVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbselect.service.FksbSelectService;
import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Validated
@Controller
@RequestMapping("fksbSelectController")
public class FksbSelectController {

    @Autowired
    private FksbSelectService fksbSelectService;


    @RequestMapping("index")
    public ModelAndView index(Model model, @Valid FksbInfoZncbVO equiidVO,BindingResult bindingResult ){
        ModelAndView view=new ModelAndView();
        if(bindingResult.hasErrors()){
            model.addAttribute("exception","设备编号不能为空");
            model.addAttribute("tishi","空指针异常");
            model.addAttribute("returnsys","/fksbworker/fksbSelectController/scanningCode");
            model.addAttribute("returnhome","/fksbworker/workHomeController/index");
            view.setViewName("/error/exception");

            return  view;
        }
            String   equiid=equiidVO.getEquiId();//"1201100809";
        try{
            //查询数据信息
            FksbDataMprRtrVO fksbDataMprRtrVO = fksbSelectService.selectMprFksbRtr(model, equiid);
            model.addAttribute("fksbDataMprRtrVO",fksbDataMprRtrVO);
//            FksbInfoZncbVO fksbInfoZncbVO = fksbSelectService.selectFksbInfo(fksbDataMprRtrVO.getMpcd(), equiid);
//            model.addAttribute("fksbInfoZncbVO",fksbInfoZncbVO);
            view.setViewName("/select/select");
         }catch (NullPointerException ex){
            model.addAttribute("exception","数据不全,请联系运维人员");
            model.addAttribute("tishi","空指针异常");
            model.addAttribute("returnsys","/fksbworker/fksbSelectController/scanningCode");
            model.addAttribute("returnhome","/fksbworker/workHomeController/index");
            //空异常
            view.setViewName("/error/exception");
       }
    //查询水表信息
     return  view;
    }


    @RequestMapping("scanningCode")
    public ModelAndView scanningCode(){
       ModelAndView view=new ModelAndView();
       view.setViewName("/select/scanning");
    return view;
    }


    @ResponseBody
    @RequestMapping("update")
    public JSONObject update(Model model, WtEquiMpZncdVO wtEquiMpZncdVO){
        int updateSign = fksbSelectService.updateZncb(wtEquiMpZncdVO);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("updateSign",updateSign);
        return (JSONObject) JSONObject.toJSON(map);
    }



}
