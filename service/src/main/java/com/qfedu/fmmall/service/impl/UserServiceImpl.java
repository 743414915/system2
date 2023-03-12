package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.LogindateMapper;
import com.qfedu.fmmall.dao.UsersMapper;
import com.qfedu.fmmall.entity.Logindate;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.entity.ManageUserVO;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.utils.MD5Utils;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private LogindateMapper logindateMapper;

    //    登录
    @Override
    public ResultVO queryUserByName(String userName, String password) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", userName);
        List<Users> users = usersMapper.selectByExample(example);

        if (users.size() == 0) {
            return new ResultVO(ResStatus.LOGIN_FAIL_NOT, "账号不存在", null);
        } else {
            String pas = MD5Utils.md5(password);
            if (pas.equals(users.get(0).getPassword())) {

//        如果此次登陆验证成功，则需要生成令牌token（token就是按照特定规则生成的字符串）
//                使用jwt规则生成token字符串
                JwtBuilder builder = Jwts.builder();

                HashMap<String, Object> map = new HashMap<>();
                map.put("key1", "value1");
                map.put("key2", "value2");

                String token = builder.setSubject(userName)//主题，就是token中携带的数据
                        .setIssuedAt(new Date())//设置token的生成时间，为了日期校验
                        .setId(users.get(0).getUserid() + "")//设置用户id为token的id
                        .setClaims(map)//map中可以存放用户的权限信息
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))//设置woken过期时间
                        .signWith(SignatureAlgorithm.HS256, "Chong000605")//设置加密方式和加密密码
                        .compact();

                Logindate logindate = new Logindate();
                logindate.setName(userName);
                logindate.setDate(new Date());
                logindateMapper.insertUseGeneratedKeys(logindate);

                return new ResultVO(ResStatus.LOGIN_SUCCESS, token, users.get(0));
            } else {
                return new ResultVO(ResStatus.LOGIN_FAIL_NOT, "密码错误", null);
            }
        }
    }

    @Override
    public ResultVO userResqit(String userName, String password, String aginPassword) {
        synchronized (this) {

//            查询用户是否被注册
            Example example = new Example(Users.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("name", userName);
            List<Users> users = usersMapper.selectByExample(example);

            if (users.size() == 0) {

                if (password.equals(aginPassword)) {
                    Users user = new Users();
                    user.setName(userName);
                    user.setPassword(MD5Utils.md5(password));

                    user.setResqitdate(new Date());

                    int insert = usersMapper.insertUseGeneratedKeys(user);
                    if (insert > 0) {
                        return new ResultVO(ResStatus.OK, "注册成功", user);
                    } else {
                        return new ResultVO(ResStatus.NO, "注册失败", null);
                    }
                } else {
                    return new ResultVO(ResStatus.NO, "两次输入密码不一致", null);
                }
            } else {
                return new ResultVO(ResStatus.NO, "该账号已被注册", null);
            }
        }
    }

    @Override
    public ResultVO perfectInfo(int userId, String department, String hostelNum) {
        Users users = new Users();
        users.setUserid(userId);
        users.setDepartment(department);
        users.setHostelnum(hostelNum);

        int i = usersMapper.updateByPrimaryKeySelective(users);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "完善信息成功", null);
        } else {
            return new ResultVO(ResStatus.NO, "完善信息失败", null);
        }
    }

    @Override
    public ResultVO modifyPassword(int userId, String username, String newPassword) {

        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", username);
        List<Users> users1 = usersMapper.selectByExample(example);
        if (users1.get(0).getPassword().equals(MD5Utils.md5(newPassword))) {
            return new ResultVO(ResStatus.NO, "新密码与原密码相同", null);
        } else {
            Users users = new Users();
            users.setUserid(userId);
            users.setPassword(MD5Utils.md5(newPassword));

            int i = usersMapper.updateByPrimaryKeySelective(users);
            if (i > 0) {
                return new ResultVO(ResStatus.OK, "修改密码成功", null);
            } else {
                return new ResultVO(ResStatus.NO, "修改密码失败", null);
            }
        }

    }

    @Override
    public ResultVO selectUser(String username) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", username);
        List<Users> users = usersMapper.selectByExample(example);
        if (users.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", users.get(0));
        } else {
            return new ResultVO(ResStatus.NO, "查询失败", null);
        }
    }

    @Override
    public ResultVO uploadAvatar(Integer userId, MultipartFile file) {
//        图片上传的位置
        String basePath = "E:\\apache-tomcat-8.5.24\\webapps\\upload";
        String serverPath = "http://localhost:8081/upload/";

//        保证文件名称的唯一性
        String uuid = UUID.randomUUID().toString().replace("-", " ");
        String filename = uuid + file.getOriginalFilename();

//        创建文件实例对象
        File image = new File(basePath, filename);

        try {
            file.transferTo(image);

//            将图片逻辑地址保存到数据库中
            Users user = new Users();
            user.setUserid(userId);
            user.setLogo(serverPath + filename);
            int i = usersMapper.updateByPrimaryKeySelective(user);
            if (i > 0) {
                return new ResultVO(ResStatus.OK, "上传成功", serverPath + filename);
            } else {
                return new ResultVO(ResStatus.NO, "上传失败", null);
            }
        } catch (IOException e) {
            return new ResultVO(ResStatus.NO, "上传失败", null);
        }
    }

    @Override
    public ResultVO selectAllNotBy() {
        List<Users> users = usersMapper.selectAll();
        if (users.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", users);
        } else {
            return new ResultVO(ResStatus.NO, "查询失败", null);
        }
    }

    @Override
    public ResultVO manageUser() {
        List<ManageUserVO> manageUserVO = usersMapper.selectManageUser();
        if (manageUserVO.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", manageUserVO);
        } else {
            return new ResultVO(ResStatus.NO, "查询失败", null);
        }
    }

}
