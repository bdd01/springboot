package com.example.action_manage.dao;

import com.example.action_manage.bo.SaleJobBo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SaleJobDao {
    @Insert("insert into saleJob (id,jobame,begin,end,school,numflag,actionname) values (#{id},#{jobname},#{begin},#{end},#{school},#{numflag},#{actionname})")
    void insertSaleJob(SaleJobBo saleJobBo);
    @Select("select * from saleJob where school=#{school}")
    List<SaleJobBo> querySchoolSaleJobInfo(Integer school);
}
