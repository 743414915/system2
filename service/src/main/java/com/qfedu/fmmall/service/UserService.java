package com.qfedu.fmmall.service;

import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    //    用户登录
    public ResultVO queryUserByName(String userNAme, String password);

    //用户注册
    public ResultVO userResqit(String userName, String password, String aginPassword);

    //完善用户信息
    public ResultVO perfectInfo(int userId, String department, String hostelNum);

    //修改密码
    public ResultVO modifyPassword(int userId, String username, String newPassword);

    //查询用户信息接口
    public ResultVO selectUser(String username);

    public ResultVO uploadAvatar(Integer userId, MultipartFile file);

    public ResultVO selectAllNotBy();

    public ResultVO manageUser();
}
