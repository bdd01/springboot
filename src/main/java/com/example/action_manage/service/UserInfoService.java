package com.example.action_manage.service;

import com.example.action_manage.bo.UserInfoBo;
import com.example.action_manage.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    public UserInfoBo queryUserInfoByName(String name){
        return userInfoDao.queryUserInfoByName(name);
    }
    public void insertUserInfo(UserInfoBo userInfoBo){
        userInfoDao.insertUserInfo(userInfoBo);
    }
}
