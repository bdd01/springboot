package com.example.action_manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class uploadController {
    @RequestMapping("/upload")
    public String upload(){
        return "upload";
    }
    @PostMapping("/uploadAction")
    @ResponseBody
    public String uploadAction(@RequestParam("myfile")MultipartFile multipartFile){
        if(multipartFile.isEmpty()){
            return "上传失败 请选择文件";
        }
        String filename = multipartFile.getOriginalFilename();
        String filepath = "C:/Users/BDD/Desktop";
        File file = new File(filepath,filename);
        try {
            multipartFile.transferTo(file);
            File f = new File(filepath+"/"+filename);
            if(f.isFile() && f.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(f), "UTF-8");
                StringBuilder filestr = new StringBuilder();
                int temp = 0;
                while ((temp = read.read()) != -1) {
                    filestr.append((char) temp);
                }
                System.out.println(filestr);
                String str = new String(filestr);
                String[] strs = str.split("\\r\\n|\\n|\\r");
                for (String data : strs) {
                    System.out.println("data:" + data);
                }
            }
            return "上传成功";

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
}
