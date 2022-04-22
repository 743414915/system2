package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

public class Users {
    @Id
    @Column(name = "userId")
    private Integer userid;

    private String name;

    private String password;

    private Date resqitdate;

    private String logo;

    /**
     * 院系班级
     */
    private String department;

    /**
     * 宿舍号
     */
    @Column(name = "hostelNum")
    private String hostelnum;

    /**
     * 用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录
     */
    private Integer frozen;

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return resqitdate
     */
    public Date getResqitdate() {
        return resqitdate;
    }

    /**
     * @param resqitdate
     */
    public void setResqitdate(Date resqitdate) {
        this.resqitdate = resqitdate;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取院系班级
     *
     * @return department - 院系班级
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置院系班级
     *
     * @param department 院系班级
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取宿舍号
     *
     * @return hostelNum - 宿舍号
     */
    public String getHostelnum() {
        return hostelnum;
    }

    /**
     * 设置宿舍号
     *
     * @param hostelnum 宿舍号
     */
    public void setHostelnum(String hostelnum) {
        this.hostelnum = hostelnum;
    }

    /**
     * 获取用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录
     *
     * @return frozen - 用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录
     */
    public Integer getFrozen() {
        return frozen;
    }

    /**
     * 设置用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录
     *
     * @param frozen 用来判断账号是否封禁，为0时正常，为1时表示被冻结。该账号异常，无法登录
     */
    public void setFrozen(Integer frozen) {
        this.frozen = frozen;
    }
}