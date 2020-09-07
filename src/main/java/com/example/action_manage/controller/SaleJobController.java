package com.example.action_manage.controller;

import com.example.action_manage.bo.SaleJobBo;
import com.example.action_manage.service.SaleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class SaleJobController {
    @Autowired
    private SaleJobService saleJobService;
    @RequestMapping("/showSaleJobList")
    public String showSaleJobList(){
        return "showSaleJobList";
    }
    @RequestMapping("/showSaleJob")
    public String showSaleJob(Integer school,Map<String,Object> map){
        List<SaleJobBo> list = saleJobService.querySchoolSaleJobInfo(school);
        map.put("saleJobs",list);
        return "saleJobsInfoList";
    }
}
