package com.example.action_manage.service;

import com.example.action_manage.bo.SaleJobBo;
import com.example.action_manage.dao.SaleJobDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleJobService {
    @Autowired
    private SaleJobDao saleJobDao;
    public List<SaleJobBo> querySchoolSaleJobInfo(Integer school){
        return saleJobDao.querySchoolSaleJobInfo(school);
    }
}
