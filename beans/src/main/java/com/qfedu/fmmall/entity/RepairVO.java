package com.qfedu.fmmall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairVO {
    /**
     * id
     */
    private Integer userId;
    /*
    上报人姓名
     */
    private String name;
    /*
    上报人所在院系
     */
    private String department;
    /*
    上报人所在宿舍楼号
     */
    private String hostelNum;
    /*
    维修信息id
     */
    private Integer repairId;
    /*
    维修上报时间
     */
    @DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private Date reportDate;
    /*
    维修上报内容
     */
    private String repairContext;
    /*
    维修完成时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private Date finishDate;
}
