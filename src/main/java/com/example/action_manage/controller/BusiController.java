package com.example.action_manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusiController {
    @RequestMapping("/dobusi")
    public String dobusi(){
        return "busi";
    }
}
