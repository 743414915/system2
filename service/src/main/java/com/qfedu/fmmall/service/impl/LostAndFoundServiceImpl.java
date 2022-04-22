package com.qfedu.fmmall.service.impl;

import com.qfedu.fmmall.dao.LostandfoundMapper;
import com.qfedu.fmmall.entity.Lostandfound;
import com.qfedu.fmmall.service.LostAndFoundService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LostAndFoundServiceImpl implements LostAndFoundService {

    @Resource
    private LostandfoundMapper lostandfoundMapper;

    @Override
    public ResultVO addReleaseInfo(String name, String context, String phone) {

        Lostandfound lostandfound = new Lostandfound();
        lostandfound.setName(name);
        lostandfound.setContext(context);
        lostandfound.setPhone(phone);
        lostandfound.setReleasedate(new Date());

        int i = lostandfoundMapper.insertUseGeneratedKeys(lostandfound);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "发布成功", null);
        } else {
            return new ResultVO(ResStatus.NO, "发布失败", null);
        }
    }

    @Override
    public ResultVO selectAllInfo() {
        List<Lostandfound> list = lostandfoundMapper.selectAll();

        if (list.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", list);
        } else {
            return new ResultVO(ResStatus.OK, "查询失败", null);
        }
    }

    @Override
    public ResultVO SelectLike(String keyword) {
        List<Lostandfound> lostandfounds = null;
        if (keyword.equals("")) {
            lostandfounds = lostandfoundMapper.selectAll();
        } else {
            lostandfounds = lostandfoundMapper.SelectLike(keyword);
        }
        if (lostandfounds.size() > 0) {
            return new ResultVO(ResStatus.OK, "查询成功", lostandfounds);
        } else {
            return new ResultVO(ResStatus.NO, "没有查询到相关信息", null);
        }
    }


}
