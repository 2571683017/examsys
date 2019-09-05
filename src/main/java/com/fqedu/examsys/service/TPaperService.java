package com.fqedu.examsys.service;


import com.fqedu.examsys.entity.TPaper;
import com.fqedu.examsys.utils.TPaper2;

import java.util.List;

public interface TPaperService {
    public List<TPaper2> findAllTPaper();

    public void addTPaper(TPaper tPaper);

    public void delete(Integer id);

    public TPaper2 findOneById(Integer id);

    public void updateInfo(TPaper tPaper);

}
