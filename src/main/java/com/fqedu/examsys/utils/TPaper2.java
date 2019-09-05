package com.fqedu.examsys.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fqedu.examsys.entity.TSort;
import com.fqedu.examsys.entity.TSubject;
import lombok.Data;

import java.util.Date;
@Data
public class TPaper2 {
    private Integer id;

    private Integer sortId;

    private Integer subId;

//    private Integer sortName;
//
//    private Integer course;

//    private String radioId;
//
//    private Integer radioScore;
//
//    private String selectionId;
//
//    private Integer selectionScore;
//
//    private String decideId;
//
//    private Integer decideScore;

    private Date starTime;

    private Date endTime;

    private TSort sortName;

    private TSubject course;

//    private TSort tSort;

//    private TSubject tSubject;



}
