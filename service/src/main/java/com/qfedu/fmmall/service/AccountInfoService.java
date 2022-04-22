package com.qfedu.fmmall.service;

import com.qfedu.fmmall.vo.ResultVO;


public interface AccountInfoService {
    public ResultVO selectRecord(String username, int startPage, int endPage);

    //查询该用户登录记录总数量，用于计算分页
    public ResultVO selectSize(String username);

    //用来修改账号状态，即是否冻结或解冻
    public ResultVO freezeOrNot(int UserId, int freeze);
}
