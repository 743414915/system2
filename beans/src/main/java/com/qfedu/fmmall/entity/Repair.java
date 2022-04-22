package com.qfedu.fmmall.entity;

import java.util.Date;
import javax.persistence.*;

public class Repair {
    /**
     * 维修id
     */
    @Id
    @Column(name = "repairId")
    private Integer repairid;

    /**
     * 上报人
     */
    @Column(name = "reportPerson")
    private String reportperson;

    /**
     * 维修上报日期
     */
    @Column(name = "reportDate")
    private Date reportdate;

    /**
     * 维修内容(最大255个文字描述)
     */
    @Column(name = "repairContext")
    private String repaircontext;

    /**
     * 维修完成日期
     */
    @Column(name = "finishDate")
    private Date finishdate;

    /**
     * 获取维修id
     *
     * @return repairId - 维修id
     */
    public Integer getRepairid() {
        return repairid;
    }

    /**
     * 设置维修id
     *
     * @param repairid 维修id
     */
    public void setRepairid(Integer repairid) {
        this.repairid = repairid;
    }

    /**
     * 获取上报人
     *
     * @return reportPerson - 上报人
     */
    public String getReportperson() {
        return reportperson;
    }

    /**
     * 设置上报人
     *
     * @param reportperson 上报人
     */
    public void setReportperson(String reportperson) {
        this.reportperson = reportperson;
    }

    /**
     * 获取维修上报日期
     *
     * @return reportDate - 维修上报日期
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * 设置维修上报日期
     *
     * @param reportdate 维修上报日期
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
     * 获取维修内容(最大255个文字描述)
     *
     * @return repairContext - 维修内容(最大255个文字描述)
     */
    public String getRepaircontext() {
        return repaircontext;
    }

    /**
     * 设置维修内容(最大255个文字描述)
     *
     * @param repaircontext 维修内容(最大255个文字描述)
     */
    public void setRepaircontext(String repaircontext) {
        this.repaircontext = repaircontext;
    }

    /**
     * 获取维修完成日期
     *
     * @return finishDate - 维修完成日期
     */
    public Date getFinishdate() {
        return finishdate;
    }

    /**
     * 设置维修完成日期
     *
     * @param finishdate 维修完成日期
     */
    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
}