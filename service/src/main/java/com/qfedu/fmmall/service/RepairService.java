package com.qfedu.fmmall.service;

import com.qfedu.fmmall.entity.Repair;
import com.qfedu.fmmall.vo.ResultVO;

public interface RepairService {
    //维修设备信息查询
    public ResultVO selectRepairByName(String name, int startPage, int count);

    //上报需要维修设备
    public ResultVO addRepair(String name, String context);


    //维修完毕时间
    public ResultVO finishRepair(int repairId);
}
