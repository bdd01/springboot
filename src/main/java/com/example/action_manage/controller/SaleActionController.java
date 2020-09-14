package com.example.action_manage.controller;

import com.example.action_manage.bo.SaleActionBo;
import com.example.action_manage.service.SaleActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SaleActionController {
    @Autowired
    private SaleActionService saleActionService;
    @RequestMapping("/saleacitonlist")
    @ResponseBody
    public Map<String,Object> saleacitonlist(){
        List<SaleActionBo> list = saleActionService.queryAllSaleAction();
        for(SaleActionBo bo : list){
            bo.setTest1("test1");
            bo.setTest2("test2");
        }
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("data",list);
        map.put("count",list.size());
        map.put("code",0);
        map.put("msg","ok");
        return map;

    }
    @RequestMapping("/showaction")
    public String showaction(){
        return "saleacitonlist";
    }
}
