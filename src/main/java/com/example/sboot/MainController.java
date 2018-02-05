package com.example.sboot;

import com.example.sboot.linked.common.myUtil.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String sayHello(){
        Hello s ;
        return "hello";
    }

}
