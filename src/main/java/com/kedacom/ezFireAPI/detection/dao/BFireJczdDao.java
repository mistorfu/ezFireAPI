package com.kedacom.ezFireAPI.detection.dao;

import com.kedacom.ezFireAPI.detection.bean.BFireJczd;
import com.kedacom.ezFireAPI.detection.bean.BFireJczdKey;

import java.util.List;
import java.util.Map;

public interface BFireJczdDao {

    List<BFireJczd> selectByMap(Map params);

    int deleteByPrimaryKey(BFireJczdKey key);

    int insert(BFireJczd record);

    int insertSelective(BFireJczd record);

    BFireJczd selectByPrimaryKey(BFireJczdKey key);

    int updateByPrimaryKeySelective(BFireJczd record);

    int updateByPrimaryKey(BFireJczd record);
}