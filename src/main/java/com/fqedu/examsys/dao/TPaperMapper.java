package com.fqedu.examsys.dao;


import com.fqedu.examsys.entity.TPaper;
import com.fqedu.examsys.utils.TPaper2;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TPaperMapper {

    public List<TPaper2> findAllTPaper();

    public void addTPaper(TPaper tPaper);

    public void deleteById(Integer id);

    public  TPaper2 findOneById(Integer id);

    public void updateInfo(TPaper tPaper);






}