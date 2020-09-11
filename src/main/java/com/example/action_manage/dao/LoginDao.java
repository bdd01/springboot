package com.example.action_manage.dao;

import com.example.action_manage.bo.LoginBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginDao {
    @Select("select * from login where name=#{name} and pass_wd=#{passWd}")
    LoginBo queryLoginInfo(LoginBo loginBo);
}
