package com.Control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class myController {

    @RequestMapping("/Interceptor")
    public String testInterceptor()
    {
        System.out.println("Controller执行了...");
        return "success";
    }
}
