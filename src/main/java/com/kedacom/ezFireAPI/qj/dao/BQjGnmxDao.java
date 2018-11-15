package com.kedacom.ezFireAPI.qj.dao;

import com.kedacom.ezFireAPI.qj.bean.BQjGnmx;

import java.util.List;
import java.util.Map;

public interface BQjGnmxDao {

    List<BQjGnmx> selectByMap(Map params);

    int deleteByPrimaryKey(String gnbh);

    int insert(BQjGnmx record);

    int insertSelective(BQjGnmx record);

    BQjGnmx selectByPrimaryKey(String gnbh);

    int updateByPrimaryKeySelective(BQjGnmx record);

    int updateByPrimaryKey(BQjGnmx record);
}