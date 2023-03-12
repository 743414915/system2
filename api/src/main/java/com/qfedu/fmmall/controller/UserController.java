package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "提供用户登录或注册的接口", tags = "用户管理")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "userName", value = "用户登录账号", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "string", name = "password", value = "用户登录密码", required = true)
    })//参数说明
    @GetMapping("/login")
    public ResultVO login(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
        return userService.queryUserByName(userName, password);
    }

    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string", name = "userName", value = "用户注册账号", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "string", name = "password", value = "用户注册密码", required = true),
            @ApiImplicitParam(dataType = "string", name = "aginPassword", value = "用户密码验证", required = true)
    })//参数说明
    @PostMapping("/resqit")
    public ResultVO resqit(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password, @RequestParam(value = "aginPassword") String aginPassword) {
        return userService.userResqit(userName, password, aginPassword);
    }

    @ApiOperation("用户完善信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "userId", value = "学生ID", required = true),
            @ApiImplicitParam(dataType = "string", name = "department", value = "学生所在院系", required = true),//required--是否必须
            @ApiImplicitParam(dataType = "string", name = "hostelNum", value = "学生宿舍楼号", required = true),
    })//参数说明
    @GetMapping("/perfectInfo")
    public ResultVO perfectInfo(int userId, String department, String hostelNum) {
        return userService.perfectInfo(userId, department, hostelNum);
    }

    @ApiOperation("用户修改密码接口")
    @ApiImplicitParams(
            {@ApiImplicitParam(dataType = "Integer", name = "userId", value = "学生ID", required = true),
                    @ApiImplicitParam(dataType = "String", name = "username", value = "学生账号", required = true),//required--是否必须
                    @ApiImplicitParam(dataType = "String", name = "newPassword", value = "学生新密码", required = true),
            })//参数说明
    @PostMapping("/modifyPassword")
    public ResultVO modifyPassword(int userId, String username, String newPassword) {
        return userService.modifyPassword(userId, username, newPassword);
    }

    @ApiOperation("查询用户信息接口")
    @ApiImplicitParams(
            @ApiImplicitParam(dataType = "String", name = "username", value = "学生账号", required = true)//required--是否必须
    )//参数说明
    @GetMapping("/selectUser")
    public ResultVO selectUser(String username) {
        return userService.selectUser(username);
    }

    @ApiOperation("上传用户头像接口")
    @ApiImplicitParams(
            @ApiImplicitParam(dataType = "Integer", name = "userId", value = "用户id", required = true)//required--是否必须
    )//参数说明
    @PostMapping("/uploadAvatar")
    public ResultVO uploadAvatar(Integer userId, @RequestParam("file") MultipartFile file) {
        return userService.uploadAvatar(userId, file);
    }

    @GetMapping("/selectAllNotBy")
    @ApiOperation("查询所有用户接口")
    public ResultVO selectAllNotBy() {
        return userService.selectAllNotBy();
    }


    @GetMapping("/manageUser")
    @ApiOperation("管理所有用户信息接口")
    public ResultVO manageUser() {
        return userService.manageUser();
    }
}
