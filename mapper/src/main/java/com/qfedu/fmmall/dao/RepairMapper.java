package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.Repair;
import com.qfedu.fmmall.entity.RepairVO;
import com.qfedu.fmmall.generator.GeneralDAO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairMapper extends GeneralDAO<Repair> {

    /**
     * 根据姓名查询上报过的内容
     *
     * @param name 姓名
     * @return repairVO
     */
    public List<RepairVO> selectRepairByName(
            @Param("name") String name,
            @Param("startPage") int startPage,
            @Param("count") int count);
}