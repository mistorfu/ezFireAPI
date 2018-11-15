package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Xzqy;
import com.kedacom.ezFireAPI.ez.service.XzqyService;
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
@Api(description = "行政区域操作接口")
@RestController
@RequestMapping("/xzqy")
public class XzqyController {
    private static final Logger logger = LoggerFactory.getLogger(XzqyController.class);

    @Autowired
    private XzqyService service;

    @ApiOperation(value = "获取行政区域信息", notes = "根据url参数来获取行政区域信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xzqy> getXzqys(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Xzqy params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取行政区域数量", notes = "根据url参数来获取行政区域数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getXzqyCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Xzqy count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增行政区域信息", notes = "根据JSON字符串新增行政区域信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xzqy xzqy) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        xzqy.setRksj(timeS);
        xzqy.setGxsj(timeS);
        fillXzqyData(xzqy);
        return service.insert(xzqy);
    }

    @ApiOperation(value = "修改行政区域信息", notes = "根据JSON字符串修改行政区域信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xzqy xzqy) throws Exception {
        xzqy.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXzqyData(xzqy);
        return service.update(xzqy);
    }

    @ApiOperation(value = "删除行政区域信息", notes = "根据JSON字符串删除行政区域信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xzqy xzqy) throws Exception {
        return service.delete(xzqy);
    }

    private void fillXzqyData(Xzqy xzqy) {
        List<String> jsnr = Utils.pinyinList(xzqy.getXzmc());
        xzqy.setJsnr(jsnr);
    }
}