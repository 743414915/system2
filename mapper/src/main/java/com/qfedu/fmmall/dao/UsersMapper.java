package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.entity.ManageUserVO;
import com.qfedu.fmmall.generator.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper extends GeneralDAO<Users> {

    // 查询所有用户信息
    public List<ManageUserVO> selectManageUser();
}