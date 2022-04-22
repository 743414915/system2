package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

public class Lostandfound {
    @Id
    private Integer id;

    /**
     * 发布姓名
     */
    private String name;

    /**
     * 发布内容
     */
    private String context;

    /**
     * 发布时间
     */
    @Column(name = "releaseDate")
    private Date releasedate;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取发布姓名
     *
     * @return name - 发布姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置发布姓名
     *
     * @param name 发布姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取发布内容
     *
     * @return context - 发布内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置发布内容
     *
     * @param context 发布内容
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取发布时间
     *
     * @return releaseDate - 发布时间
     */
    public Date getReleasedate() {
        return releasedate;
    }

    /**
     * 设置发布时间
     *
     * @param releasedate 发布时间
     */
    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}