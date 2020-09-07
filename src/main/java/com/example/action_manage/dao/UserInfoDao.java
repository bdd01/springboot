package com.example.action_manage.dao;

import com.example.action_manage.bo.UserInfoBo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoDao {
    @Insert("insert into userinfo (id,name,oaname,msisdn,provcode,citycode,passwd) values (#{id},#{name},#{oaname},#{msisdn},#{provcode},#{citycode},#{passwd})")
    void insertUserInfo(UserInfoBo userInfoBo);
    @Select("select * from userinfo where name=#{name}")
    UserInfoBo queryUserInfoByName(String name);
    @Select("select * from userinfo where name=#{name} and passwd=#{passwd}")
    UserInfoBo queryUserInfoByNamePasswd(UserInfoBo userInfoBo);
    @Update("update userinfo set passwd=#{passwd} where name=#{name}")
    void updatePasswd(UserInfoBo userInfoBo);
}
