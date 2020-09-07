package com.example.action_manage.dao;

import com.example.action_manage.bo.UserInfoBo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoDao {
    @Insert("insert into userinfo (id,name,oaname,msisdn,provcode,citycode,passwd) values (#{id},#{name},#{oaname},#{msisdn},#{provcode},#{citycode},#{passwd})")
    void insertUserInfo(UserInfoBo userInfoBo);
    @Select("select * from userinfo where name=#{name}")
    UserInfoBo queryUserInfoByName(String name);
}
