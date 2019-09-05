package com.fqedu.examsys.controller;

import com.fqedu.examsys.common.JsonResult;
import com.fqedu.examsys.entity.TPaper;
import com.fqedu.examsys.service.TPaperService;
import com.fqedu.examsys.utils.TPaper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tPaper")
public class TPaperController {
    @Autowired
    public TPaperService tPaperService;


    @RequestMapping("/findAll.do")
    @ResponseBody
    public Map<String,Object> findAllTPaper(){
        List<TPaper2> list = tPaperService.findAllTPaper();

//        long total = ((Page)list).getTotal();

        Map<String,Object> map = new HashMap<>();


        map.put("code",0);//结合layui的表格组件，0表示成功
        map.put("msg","");
//        map.put("count",total);//表中总记录数
        map.put("data",list);
        return map;
    }



    @RequestMapping("/add.do")
    @ResponseBody
    public JsonResult add(TPaper tPaper){
        try {
            tPaperService.addTPaper(tPaper);
            return new JsonResult(1, "添加成功");
        } catch (Exception e) {
            return new JsonResult(0, "添加失败");
        }
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public JsonResult delete(Integer id){
        tPaperService.delete(id);
        return  new JsonResult(1,null);
    }


    @RequestMapping("/query.do")
    @ResponseBody
    public JsonResult findOneById(Integer id){
        TPaper2 tPaper2 = tPaperService.findOneById(id);

        return new JsonResult(1,tPaper2);
    }

    @RequestMapping("/updateInfo.do")
    @ResponseBody
    public JsonResult update(TPaper tPaper){

        tPaperService.updateInfo(tPaper);

        return  new JsonResult(1,null);
    }




}
