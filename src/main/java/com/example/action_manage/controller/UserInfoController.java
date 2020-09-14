package com.example.action_manage.controller;

import com.example.action_manage.bo.UserInfoBo;
import com.example.action_manage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/createProvUser")
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
    @RequestMapping("/querUserInfoForUpdatePass")
    public String querUserInfoForUpdatePass(String name,Map<String ,Object> map){
        UserInfoBo user = userInfoService.queryUserInfoByName(name);
        map.put("user",user);
        return "userinfo";
    }
    @RequestMapping("/updatePass")
    public String  updatePass(HttpServletRequest request){
        String name = request.getParameter("name");
        String passwd =  request.getParameter("passwd");
        UserInfoBo userinfo = new UserInfoBo();
        userinfo.setName(name);
        userinfo.setPasswd(passwd);
        userInfoService.updatePasswd(userinfo);
        return "login";
    }

}
