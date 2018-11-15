package com.kedacom.ezFireAPI.basic.dao;

import com.kedacom.ezFireAPI.basic.bean.AFireDandg;

import java.util.List;
import java.util.Map;

public interface AFireDandgDao {


    List<AFireDandg> selectByMap(Map params);

    int insert(AFireDandg record);

    int insertSelective(AFireDandg record);

    int update(AFireDandg record);

    int delete(AFireDandg record);
}