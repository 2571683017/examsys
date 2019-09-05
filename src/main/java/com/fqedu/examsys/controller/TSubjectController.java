package com.fqedu.examsys.controller;

import com.fqedu.examsys.common.JsonResult;

import com.fqedu.examsys.entity.TSubject;

import com.fqedu.examsys.service.TSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tSubject")
public class TSubjectController {
    @Autowired
    private TSubjectService tSubjectService;
    @RequestMapping("/list.do")
    @ResponseBody
    public JsonResult findAll(){
        List<TSubject> tSubject = tSubjectService.findAllTSubject();
        JsonResult result = new JsonResult(1,tSubject);
        return  result;
    }
}
