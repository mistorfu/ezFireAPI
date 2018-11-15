package com.kedacom.ezFireAPI.detection.dao;

import com.kedacom.ezFireAPI.detection.bean.BFireJygz;

import java.util.List;
import java.util.Map;

public interface BFireJygzDao {

    List<BFireJygz> selectByMap(Map params);

    int delete(String gzbh);

    int insert(BFireJygz record);

    int insertSelective(BFireJygz record);

    BFireJygz select(String gzbh);

    int updateSelective(BFireJygz record);

    int update(BFireJygz record);
}