package com.fqedu.examsys.service.impl;



import com.fqedu.examsys.dao.TPaperMapper;
import com.fqedu.examsys.entity.TPaper;
import com.fqedu.examsys.service.TPaperService;
import com.fqedu.examsys.utils.TPaper2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class TPaperServiceImpl implements TPaperService {

    @Autowired(required = false)
    private TPaperMapper tPaperMapper;

    @Override
    public List<TPaper2> findAllTPaper() {
        //设置页码和每一页显示的记录数，该语句后边紧跟数据库查询相关的语句
//      PageHelper.startPage(page,limit);
        List<TPaper2> list = tPaperMapper.findAllTPaper();
        //获取总记录数
        //((Page)list).getTotal();
        return list;
    }

    @Override
    public void addTPaper(TPaper tPaper) {

        tPaperMapper.addTPaper(tPaper);
    }


    @Override
    public void delete(Integer id) {
            tPaperMapper.deleteById(id);
    }

    @Override
    public TPaper2 findOneById(Integer id) {
        TPaper2 tPaper2 = tPaperMapper.findOneById(id);
        return tPaper2;
    }

    @Override
    public void updateInfo(TPaper tPaper) {
        tPaperMapper.updateInfo(tPaper);
    }
}

