package com.fqedu.examsys.service.impl;

import com.fqedu.examsys.dao.TSortMapper;
import com.fqedu.examsys.entity.TSort;
import com.fqedu.examsys.service.TSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TSortServiceImpl implements TSortService {
    @Autowired(required = false)
    private TSortMapper tSortMapper;
    @Override
    public List<TSort> findAllTSort() {
        return tSortMapper.findAllTSort();
    }
}

