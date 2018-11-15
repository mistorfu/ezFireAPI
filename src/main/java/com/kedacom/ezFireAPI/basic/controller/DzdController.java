package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.dao.DzdDao;
import com.kedacom.ezFireAPI.basic.model.Dzd;
import com.kedacom.ezFireAPI.basic.model.DzdOrcl;
import com.kedacom.ezFireAPI.basic.service.DzdService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: 地震带
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "地震带操作接口")
@RestController
@RequestMapping("/dzd")
public class DzdController {
    private static final Logger logger = LoggerFactory.getLogger(DzdController.class);

    @Autowired
    private DzdService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取地震带信息", notes = "根据url参数来获取地震带信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Dzd> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Dzd params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增地震带信息", notes = "根据JSON字符串新增地震带信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Dzd dzd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        dzd.setRksj(timeS);
        dzd.setGxsj(timeS);

        dzd.setSzdxfjg(commonService.FillXfjg(dzd.getSzdxfjg()));
        dzd.setSzdxzqh(commonService.FillXzqh(dzd.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(dzd.getDzdmc());
        //jsnr.addAll(Utils.pinyinList(dzd.getDzwhdj().toString()));
        dzd.setJsnr(jsnr);

        return service.insert(dzd);
    }

    @ApiOperation(value = "修改地震带信息", notes = "根据JSON字符串修改地震带信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Dzd dzd) throws Exception {
        dzd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        dzd.setSzdxfjg(commonService.FillXfjg(dzd.getSzdxfjg()));
        dzd.setSzdxzqh(commonService.FillXzqh(dzd.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(dzd.getDzdmc());
        jsnr.addAll(Utils.pinyinList(dzd.getDzwhdj().toString()));
        dzd.setJsnr(jsnr);

        return service.update(dzd);
    }

    @ApiOperation(value = "删除地震带信息", notes = "根据JSON字符串删除地震带信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Dzd dzd) throws Exception {
        return service.delete(dzd);
    }
}
