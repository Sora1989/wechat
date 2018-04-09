package com.zhiyong.wechat.bean.entity;

/**
 * @program: wechat
 * @description: 目标大学
 * @author: zjxu
 * @create: 2018/4/2 13:29
 **/
public class University {
    private Long UniversityId;

    private String name;

    private String is211;//"2"是，"0"不是

    private String is985;//"9"是，"0"不是

    public University(Long universityId, String name, String is211, String is985) {
        UniversityId = universityId;
        this.name = name;
        this.is211 = is211;
        this.is985 = is985;
    }

    public Long getUniversityId() {
        return UniversityId;
    }

    public void setUniversityId(Long universityId) {
        UniversityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs211() {
        return is211;
    }

    public void setIs211(String is211) {
        this.is211 = is211;
    }

    public String getIs985() {
        return is985;
    }

    public void setIs985(String is985) {
        this.is985 = is985;
    }
}