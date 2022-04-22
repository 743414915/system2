package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.entity.Repair;
import com.qfedu.fmmall.service.RepairService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/repair")
@Api(value = "用来学生上报需要维修设备", tags = "设备维修上报")
public class RepairController {

    @Resource
    private RepairService repairService;

    @ApiOperation("查询维护信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "name", value = "维护人姓名", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "int", name = "startPage", value = "查询信息个数的起始数", required = true),
            @ApiImplicitParam(dataType = "int", name = "count", value = "查询信息个数", required = true)
    })//参数说明
    @GetMapping("/allRepair")
    public ResultVO selectRepair(String name, int startPage, int count) {
        return repairService.selectRepairByName(name, startPage, count);
    }

    @ApiOperation("上报维护信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "name", value = "上报人姓名", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "string", name = "context", value = "维护信息说明", required = true)
    })//参数说明
    @GetMapping("/addRepair")
    public ResultVO addRepair(String name, String context) {
        return repairService.addRepair(name, context);
    }

    @ApiOperation("维护信息完成时间接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "int", name = "repairId", value = "维修信息的id", required = true)
    })//参数说明
    @GetMapping("/finishRepair")
    public ResultVO finishRepair(int repairId) {
        return repairService.finishRepair(repairId);
    }

}
