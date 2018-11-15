package com.kedacom.ezFireAPI.emergency.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.emergency.model.Ydcl;
import com.kedacom.ezFireAPI.emergency.service.YdclService;
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
 * Created by fudapeng on 2018/8/28.
 */
@Api(description = "运单车辆操作接口")
@RestController
@RequestMapping("/ydcl")
public class YdclController {
    private static final Logger logger = LoggerFactory.getLogger(YdclController.class);

    @Autowired
    private YdclService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取运单车辆信息", notes = "根据url参数来获取运单车辆信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ydcl> getYdcls(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ydcl params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取运单车辆数量", notes = "根据url参数来获取运单车辆数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getYdclCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ydcl count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增运单车辆信息", notes = "根据JSON字符串新增运单车辆信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ydcl ydcl) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ydcl.setRksj(timeS);
        ydcl.setGxsj(timeS);
        fillYdclData(ydcl);
        return service.insert(ydcl);
    }

    @ApiOperation(value = "修改运单车辆信息", notes = "根据JSON字符串修改运单车辆信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Ydcl ydcl) throws Exception {
        ydcl.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillYdclData(ydcl);
        return service.update(ydcl);
    }

    @ApiOperation(value = "删除运单车辆信息", notes = "根据JSON字符串删除运单车辆信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Ydcl ydcl) throws Exception {
        return service.delete(ydcl);
    }

    private void fillYdclData(Ydcl ydcl) {
        List<String> jsnr = Utils.pinyinList(ydcl.getCphm());
        ydcl.setQdxzqh(commonService.FillXzqh(ydcl.getQdxzqh()));
        ydcl.setZdxzqh(commonService.FillXzqh(ydcl.getZdxzqh()));
        ydcl.setJsnr(jsnr);
    }
}