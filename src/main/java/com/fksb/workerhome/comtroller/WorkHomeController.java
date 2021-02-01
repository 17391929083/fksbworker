package com.fksb.workerhome.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller
@RequestMapping("workHomeController")
public class WorkHomeController {



    /*首页页面跳转*/
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("/home/home");
      return view;
    }
}
