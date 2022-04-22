package com.qfedu.fmmall.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageHelper<T> {

    //总记录
    private int count;

    //总页数
    private int pageCount;

    //分页查询
    private List<T> list;
}
