package com.example.action_manage.service;

import com.example.action_manage.bo.SaleActionBo;
import com.example.action_manage.dao.SaleActionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleActionService {
    @Autowired
    private SaleActionDao saleActionDao;
    public List<SaleActionBo> queryAllSaleAction(){
        return saleActionDao.queryAllSaleActionInfo();
    }
}
