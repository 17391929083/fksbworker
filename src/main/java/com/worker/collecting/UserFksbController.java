package com.worker.collecting;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserFksbController {

    @RequestMapping("index")
    public  String  index(){
        System.out.println("4444444444");
        return "/index";


    }
}
