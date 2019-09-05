package com.fqedu.examsys.controller;

import com.fqedu.examsys.common.JsonResult;
import com.fqedu.examsys.entity.TSort;
import com.fqedu.examsys.service.TSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tSort")
public class TSortController {
    @Autowired
    private TSortService tSortService;
    @RequestMapping("/list.do")
    @ResponseBody
    public JsonResult findAll(){
        List<TSort> tSorts = tSortService.findAllTSort();
        JsonResult result = new JsonResult(1,tSorts);
        return  result;
    }
}
