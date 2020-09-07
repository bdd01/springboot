package com.example.action_manage.controller;

import com.example.action_manage.bo.SaleJobBo;
import com.example.action_manage.service.SaleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    @RequestMapping("/addsalejob")
    public String addsalejob(){
        return "saleJobInfo";
    }
    @RequestMapping("/addsalejobinfo")
    public String addsalejobinfo(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String jobname = request.getParameter("jobname");
        String begin = request.getParameter("begin");
        String end = request.getParameter("end");
        String school = request.getParameter("school");//1-10
        String numflag = request.getParameter("numflag");
        String actionname = request.getParameter("actionname");
        SaleJobBo saleJobBo = new SaleJobBo();
        saleJobBo.setId(id);
        saleJobBo.setBegin(begin);
        saleJobBo.setEnd(end);
        saleJobBo.setSchool(school);
        saleJobBo.setNumflag(numflag);
        saleJobBo.setActionname(actionname);
        saleJobService.insertSaleJobInfo(saleJobBo);
        return "redirect:/showSaleJobList";
    }
}
