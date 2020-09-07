package com.example.action_manage.controller;

import com.example.action_manage.bo.SaleActionBo;
import com.example.action_manage.service.SaleActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class SaleActionController {
    @Autowired
    private SaleActionService saleActionService;
    @RequestMapping("/showaction")
    public String showaction(Map<String,Object> map){
        List<SaleActionBo> list = saleActionService.queryAllSaleAction();
        map.put("saleactions",list);
        return "saleacitonlist";
    }
}
