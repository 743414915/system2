package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.entity.Lostandfound;
import com.qfedu.fmmall.service.LostAndFoundService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/lostandfound")
@Api(value = "失物招领相关接口", tags = "失物招领")
public class LostAndFoundController {

    @Resource
    private LostAndFoundService lostAndFoundService;

    @ApiOperation("失物招领发布信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "name", value = "发布人姓名", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "string", name = "context", value = "发布内容", required = true),
            @ApiImplicitParam(dataType = "string", name = "phone", value = "联系电话", required = true)
    })//参数说明
    @GetMapping("/release")
    public ResultVO releaseInfo(String name, String context, String phone) {
        return lostAndFoundService.addReleaseInfo(name, context, phone);
    }


    @ApiOperation("查询失物招领信息接口")
    @GetMapping("/selectAll")
    public ResultVO selectAll() {
        return lostAndFoundService.selectAllInfo();
    }

    @ApiOperation("根据关键字查询失物招领信息接口")
    @ApiImplicitParam(dataType = "string", name = "keyword", value = "查询关键字")
    @GetMapping("/selectLike")
    public ResultVO selectLike(String keyword) {
        return lostAndFoundService.SelectLike(keyword);
    }

}
