package com.zhiyong.wechat.bean;

import java.math.BigDecimal;

/**
 * @program: wechat
 * @description: 教师成绩？学生成绩？
 * @author: zjxu
 * @create: 2018/4/9 17:37
 **/
public class Transcript {
    private Long id;
    private BigDecimal course1;
    private BigDecimal course2;
    private BigDecimal course3;
    private BigDecimal course4;
    private Long teacherid;

    public Transcript() {
    }

    public Transcript(Long id, BigDecimal course1, BigDecimal course2, BigDecimal course3, BigDecimal course4, Long teacherid) {
        this.id = id;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.teacherid = teacherid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCourse1() {
        return course1;
    }

    public void setCourse1(BigDecimal course1) {
        this.course1 = course1;
    }

    public BigDecimal getCourse2() {
        return course2;
    }

    public void setCourse2(BigDecimal course2) {
        this.course2 = course2;
    }

    public BigDecimal getCourse3() {
        return course3;
    }

    public void setCourse3(BigDecimal course3) {
        this.course3 = course3;
    }

    public BigDecimal getCourse4() {
        return course4;
    }

    public void setCourse4(BigDecimal course4) {
        this.course4 = course4;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "id=" + id +
                ", course1=" + course1 +
                ", course2=" + course2 +
                ", course3=" + course3 +
                ", course4=" + course4 +
                ", teacherid=" + teacherid +
                '}';
    }
}
