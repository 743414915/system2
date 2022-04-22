package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.Logindate;
import com.qfedu.fmmall.generator.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogindateMapper extends GeneralDAO<Logindate> {

    public List<Logindate> selectRecord(String username, int startPage, int endPage);
}