package com.fqedu.examsys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TPaper {

    private Integer id;
    private String paperName;

    private Integer sortId;

    private Integer subId;

    private String radioId;

    private Integer radioScore;

    private String selectionId;

    private Integer selectionScore;

    private String decideId;

    private Integer decideScore;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date starTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date endTime;


}