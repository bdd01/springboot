package com.example.action_manage.controller;

import com.example.action_manage.bo.LoginBo;
import com.example.action_manage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/syslogin")
    public String syslogin(){
        return "syslogin";
    }
    @PostMapping("/checkSysLogin")
    @ResponseBody
    public Map<String,Integer> checkSysLogin(LoginBo loginBo){
        Map<String,Integer> map = new HashMap<String, Integer>();
        if(!"system".equals(loginBo.getName())){
            map.put("result",9);
            return map;
        }
        if(loginBo.getName()==null || "".equals(loginBo.getName())){
            map.put("result",0);
            return map;
        }
        if(loginBo.getPassWd()==null || "".equals(loginBo.getPassWd())){
            map.put("result",0);
            return map;
        }
        LoginBo bo = loginService.queryLoginInfo(loginBo);
        if(bo == null){
            map.put("result",1);
            return map;
        }else{
            map.put("result",2);
            return map;
        }
    }
}
