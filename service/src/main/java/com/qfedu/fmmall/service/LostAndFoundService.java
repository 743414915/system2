package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.Lostandfound;
import com.qfedu.fmmall.vo.ResultVO;

public interface LostAndFoundService {

    //添加发布信息
    public ResultVO addReleaseInfo(String name, String context, String phone);

    //查询所有发布信息
    public ResultVO selectAllInfo();

    //根据关键字进行模糊查询
    public ResultVO SelectLike(String keyword);
}
