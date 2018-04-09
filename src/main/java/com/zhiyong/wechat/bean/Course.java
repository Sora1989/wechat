package com.zhiyong.wechat.bean;

import java.math.BigDecimal;

/**
 * @program: wechat
 * @description: 专业课
 * @author: zjxu
 * @create: 2018/4/9 17:17
 **/
public class Course {
    private Long id;
    private String name;
    //type:1=专业课；2=业务课
    private String type;
    //满分
    private BigDecimal fullMark;
    //国家线
    private BigDecimal nationalLine;




}
