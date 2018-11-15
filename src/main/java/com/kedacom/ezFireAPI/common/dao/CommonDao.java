package com.kedacom.ezFireAPI.common.dao;

import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import com.kedacom.ezFireAPI.outfire.model.TempDxlb;

import java.util.List;
import java.util.Map;

/**
 * @ClassName CommonDao
 * @Date 2018/6/5 15:37
 * @Author zhaomeng
 */
public interface CommonDao {

    List<InnerXzqh> getAllXzqh();

    List<TempDxlb> getAllDxlb();

    List<Map> getXtpz(Map param);
}