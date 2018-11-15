package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.dao.DzdDao;
import com.kedacom.ezFireAPI.basic.model.Dzd;
import com.kedacom.ezFireAPI.basic.model.DzdOrcl;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: 地震带
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class DzdService extends EsBaseService<Dzd>{
    public DzdService() {
        this.config = EsServiceConfigEnum.DZD;
    }

    @Autowired
    private DzdDao dao;

    public List<DzdOrcl> getDzdFromOracle(){
        //从oracle中获取所有的地震带
        List<DzdOrcl> dzds = dao.getAllDzds();

        return dzds;
    }
}
