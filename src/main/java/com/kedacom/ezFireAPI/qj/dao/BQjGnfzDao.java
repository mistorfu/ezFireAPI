package com.kedacom.ezFireAPI.qj.dao;

import com.kedacom.ezFireAPI.qj.bean.BQjGnfz;

import java.util.List;
import java.util.Map;

public interface BQjGnfzDao {

    List<BQjGnfz> selectByMap(Map params);

    int deleteByPrimaryKey(String fzbh);

    int insert(BQjGnfz record);

    int insertSelective(BQjGnfz record);

    BQjGnfz selectByPrimaryKey(String fzbh);

    int updateByPrimaryKeySelective(BQjGnfz record);

    int updateByPrimaryKey(BQjGnfz record);
}