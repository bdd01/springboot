package com.example.action_manage.dao;


import com.example.action_manage.bo.SaleActionBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SaleActionDao {
    @Select("select * from saleAction")
    List<SaleActionBo> queryAllSaleActionInfo();
}
