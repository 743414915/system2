package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.ApiApplication;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.vo.ResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserDaoTest {

    @Resource
    private UserService userService;

    @Test
    public void queryByUserName() {
        ResultVO resultVO = userService.queryUserByName("chong", "123456");
        System.out.println(resultVO);
    }
}