package com.fqedu.examsys.service.impl;


import com.fqedu.examsys.dao.TSubjectMapper;

import com.fqedu.examsys.entity.TSubject;

import com.fqedu.examsys.service.TSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSubjectServiceImpl implements TSubjectService {
    @Autowired(required = false)
    private TSubjectMapper tSubjectMapper;
    @Override
    public List<TSubject> findAllTSubject() {
        return tSubjectMapper.findAllTSubject();
    }
}

