package com.example.action_manage.controller;

import com.example.action_manage.bo.UserInfoBo;
import com.example.action_manage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/cretaProvUser")
    public String createProvUser(){
        return "createProvUser";
    }
    @PostMapping("/createProv")
    @ResponseBody
    public Map<String,Integer> createProv(UserInfoBo userInfoBo){
        Map<String,Integer> map = new HashMap<String, Integer>();
        UserInfoBo bo = userInfoService.queryUserInfoByName(userInfoBo.getName());
        if(bo != null){
            System.out.println("用户已存在 无法创建");
            map.put("result",0);
            return map;
        }else{
            userInfoService.insertUserInfo(userInfoBo);
            map.put("result",1);
        }
        return map;
    }
    @PostMapping("/checkProvLogin")
    @ResponseBody
    public Map<String,Integer> checkProvLogin(UserInfoBo userInfoBo){
        Map<String,Integer> map = new HashMap<String, Integer>();
        if(userInfoBo.getName()==null || "".equals(userInfoBo.getName())){
            map.put("result",0);
            return map;
        }
        if(userInfoBo.getPasswd()==null || "".equals(userInfoBo.getPasswd())){
            map.put("result",0);
            return map;
        }
        UserInfoBo bo = userInfoService.queryUserInfoByNamePasswd(userInfoBo);
        if(bo == null){
            map.put("result",1);
            return map;
        }else{
            map.put("result",2);
            return map;
        }
    }
}
