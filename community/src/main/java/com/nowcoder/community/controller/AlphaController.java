package com.nowcoder.community.controller;

import com.nowcoder.community.service.AlphaService;
import com.nowcoder.community.service.ImpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @Autowired
    private ImpService demoService;

    @RequestMapping("/testDI")
    @ResponseBody
    public String useService(){
        demoService.useDao();
        return  "Hello DI";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String satHello(){
        return  "Hello SpringBoot.";
    }
}
