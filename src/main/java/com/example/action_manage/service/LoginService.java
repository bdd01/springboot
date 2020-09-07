package com.example.action_manage.service;

import com.example.action_manage.bo.LoginBo;
import com.example.action_manage.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    public LoginBo queryLoginInfo(LoginBo loginBo){
        return loginDao.queryLoginInfo(loginBo);
    }
}
