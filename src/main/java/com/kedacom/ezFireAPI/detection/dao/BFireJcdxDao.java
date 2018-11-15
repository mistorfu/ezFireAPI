package com.kedacom.ezFireAPI.detection.dao;

import com.kedacom.ezFireAPI.detection.bean.BFireJcdx;

import java.util.List;
import java.util.Map;

public interface BFireJcdxDao {

    List<BFireJcdx> selectByMap(Map params);

    int deleteByPrimaryKey(String dxbh);

    int insertByPrimaryKey(BFireJcdx record);

    int insertSelective(BFireJcdx record);

    BFireJcdx selectByPrimaryKey(String dxbh);

    int updateSelective(BFireJcdx record);

    int updateByPrimaryKey(BFireJcdx record);
}