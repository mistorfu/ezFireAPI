package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Hdz;
import com.kedacom.ezFireAPI.basic.service.HdzService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: 核电站
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "核电站操作接口")
@RestController
@RequestMapping("/hdz")
public class HdzController {
    private static final Logger logger = LoggerFactory.getLogger(HdzController.class);

    @Autowired
    private HdzService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取核电站信息", notes = "根据url参数来获取核电站信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Hdz> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Hdz params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增核电站信息", notes = "根据JSON字符串新增核电站信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Hdz hdz) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        hdz.setRksj(timeS);
        hdz.setGxsj(timeS);

        hdz.setSzdxfjg(commonService.FillXfjg(hdz.getSzdxfjg()));
        hdz.setSzdxzqh(commonService.FillXzqh(hdz.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(hdz.getHdzmc());
        jsnr.addAll(Utils.pinyinList(hdz.getHdzdz()));
        hdz.setJsnr(jsnr);

        return service.insert(hdz);
    }

    @ApiOperation(value = "修改核电站信息", notes = "根据JSON字符串修改核电站信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Hdz hdz) throws Exception {
        hdz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        hdz.setSzdxfjg(commonService.FillXfjg(hdz.getSzdxfjg()));
        hdz.setSzdxzqh(commonService.FillXzqh(hdz.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(hdz.getHdzmc());
        jsnr.addAll(Utils.pinyinList(hdz.getHdzdz()));
        hdz.setJsnr(jsnr);

        return service.update(hdz);
    }

    @ApiOperation(value = "删除核电站信息", notes = "根据JSON字符串删除核电站信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Hdz hdz) throws Exception {
        return service.delete(hdz);
    }
}
