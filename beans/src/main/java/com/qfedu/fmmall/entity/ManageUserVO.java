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
public class ManageUserVO {
    /*
    用户注册时间
     */
    @DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private Date resqitdate;
    /*
    用户姓名
     */
    private String realname;
    /*
    用户账号
     */
    private String name;
    /*
    是否冻结
     */
    private Integer frozen;
    /*
    账号权限是否管理员
     */
    private String permissions;
}
