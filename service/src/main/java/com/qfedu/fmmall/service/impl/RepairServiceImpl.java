package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.RepairMapper;
import com.qfedu.fmmall.entity.Repair;
import com.qfedu.fmmall.entity.RepairVO;
import com.qfedu.fmmall.service.RepairService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RepairServiceImpl implements RepairService {

    @Resource
    private RepairMapper repairMapper;

    @Override
    public ResultVO selectRepairByName(String name, int startPage, int count) {
        List<Repair> repairs = repairMapper.selectAll();

        List<RepairVO> repairVOS = repairMapper.selectRepairByName(name, startPage, count);
        if (repairVOS.size() == 0) {
            return new ResultVO(ResStatus.NO, "您还未上报过任何信息", null);
        } else {
            return new ResultVO(ResStatus.OK, repairs.size() + "", repairVOS);
        }
    }

    @Override
    public ResultVO addRepair(String name, String context) {
        Repair repair = new Repair();
        repair.setReportperson(name);
        repair.setRepaircontext(context);
        repair.setReportdate(new Date());

        int i = repairMapper.insertUseGeneratedKeys(repair);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "上报信息成功", null);
        } else {
            return new ResultVO(ResStatus.NO, "上报信息失败", null);
        }
    }

    @Override
    public ResultVO finishRepair(int repairId) {

        Repair repair = new Repair();
        repair.setRepairid(repairId);
        repair.setFinishdate(new Date());

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String date = sdf1.format(repair.getFinishdate());

        int i = repairMapper.updateByPrimaryKeySelective(repair);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "上报信息成功", date);
        } else {
            return new ResultVO(ResStatus.NO, "上报信息失败", null);
        }
    }
}
