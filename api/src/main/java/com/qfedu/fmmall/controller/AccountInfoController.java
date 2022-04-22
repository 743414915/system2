package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.AccountInfoService;
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

@RestController
@RequestMapping("/logindate")
@CrossOrigin
@Api(value = "用户账号管理相关接口", tags = "用户账号管理（管理员用）")
public class AccountInfoController {

    @Resource
    private AccountInfoService accountInfoService;

    @ApiOperation("分页查询用户登陆时间接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "账号姓名", required = true),
            @ApiImplicitParam(dataType = "integer", name = "startPage", value = "起始页码", required = true),
            @ApiImplicitParam(dataType = "integer", name = "endPage", value = "结束页码", required = true)
    })
    @GetMapping("/selectRecode")
    public ResultVO selectRecord(String username, int startPage, int endPage) {
        return accountInfoService.selectRecord(username, startPage, endPage);
    }

    @ApiOperation("查询账户登陆时间总长度接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "username", value = "账号姓名", required = true),
    })
    @GetMapping("/selectSize")
    public ResultVO selectSize(String username) {
        return accountInfoService.selectSize(username);
    }

    @ApiOperation("修改账户状态接口")
    @GetMapping("/freezeOrNot")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "userId", value = "账号id", required = true),
            @ApiImplicitParam(dataType = "Integer", name = "freeze", value = "冻结与否，1为冻结，0为正常", required = true),
    })
    public ResultVO freezeOrNot(int userId, int freeze) {
        return accountInfoService.freezeOrNot(userId, freeze);
    }
}
