package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.LogindateMapper;
import com.qfedu.fmmall.dao.UsersMapper;
import com.qfedu.fmmall.entity.Logindate;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.service.AccountInfoService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Resource
    private LogindateMapper logindateMapper;

    @Resource
    private UsersMapper usersMapper;

    @Override
    public ResultVO selectRecord(String username, int startPage, int endPage) {
        List<Logindate> logindates = logindateMapper.selectRecord(username, startPage, endPage);

        if (logindates.size() > 0) {
            return new ResultVO(ResStatus.OK, "success", logindates);
        } else {
            return new ResultVO(ResStatus.OK, "error", null);
        }
    }

    @Override
    public ResultVO selectSize(String username) {
        Example example = new Example(Logindate.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", username);
        List<Logindate> logindates = logindateMapper.selectByExample(example);
        if (logindates.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", logindates.size());
        } else {
            return new ResultVO(ResStatus.NO, "查询失败", null);
        }
    }

    @Override
    public ResultVO freezeOrNot(int userId, int freeze) {
        Users users = new Users();
        users.setUserid(userId);
        users.setFrozen(freeze);

        int i = usersMapper.updateByPrimaryKeySelective(users);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "修改状态成功", null);
        } else {
            return new ResultVO(ResStatus.NO, "修改状态失败", null);
        }
    }
}
