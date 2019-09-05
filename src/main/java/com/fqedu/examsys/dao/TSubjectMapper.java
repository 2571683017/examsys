package com.fqedu.examsys.dao;


import com.fqedu.examsys.entity.TSort;
import com.fqedu.examsys.entity.TSubject;

import java.util.List;

public interface TSubjectMapper {
    public List<TSubject> findAllTSubject();
}