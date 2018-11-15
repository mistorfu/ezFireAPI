package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqwz;
import com.kedacom.ezFireAPI.alarm.service.ZqwzService;
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
 * @author luping
 * @date 2018/6/12
 */
@Api(value = "灾情位置操作接口")
@RestController
@RequestMapping("/zqwz")
public class ZqwzController {
    private final static Logger logger = LoggerFactory.getLogger(ZqwzController.class);

    @Autowired
    private ZqwzService zqwzService;

    @ApiOperation(value = "获取灾情位置信息",notes = "根据url参数来获取灾情位置信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zqwz> getZqwzs(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Zqwz params:" + params.toString());
        return zqwzService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情位置信息",notes = "根据JSON字符串新增灾情位置信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqwz zqwz) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqwz.setRksj(timeS);
        zqwz.setGxsj(timeS);
        return zqwzService.insert(zqwz);
    }

    @ApiOperation(value = "修改灾情位置信息",notes = "根据JSON字符串修改灾情位置信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqwz zqwz) throws Exception{
        zqwz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zqwzService.update(zqwz);
    }

    @ApiOperation(value = "删除灾情位置信息",notes = "根据JSON字符串删除灾情位置信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqwz zqwz) throws Exception{
        return zqwzService.delete(zqwz);
    }
}
