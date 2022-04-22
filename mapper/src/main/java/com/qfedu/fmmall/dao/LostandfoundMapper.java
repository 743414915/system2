package com.qfedu.fmmall.dao;

import com.qfedu.fmmall.entity.Lostandfound;
import com.qfedu.fmmall.generator.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LostandfoundMapper extends GeneralDAO<Lostandfound> {
    public List<Lostandfound> SelectLike(String keyword);
}