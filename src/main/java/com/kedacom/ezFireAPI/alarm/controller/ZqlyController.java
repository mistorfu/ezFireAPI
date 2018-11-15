package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqly;
import com.kedacom.ezFireAPI.alarm.service.ZqlyService;
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
 * @date 2018/5/29
 */
@Api(description = "灾情录音操作接口")
@RestController
@RequestMapping("/zqly")
public class ZqlyController {
    private static final Logger logger = LoggerFactory.getLogger(ZqlyController.class);

    @Autowired
    private ZqlyService zqlyService;

    @ApiOperation(value = "获取灾情录音信息",notes = "根据url参数来获取灾情录音信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zqly> getZqlys(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Zqly params:" + params.toString());
        return zqlyService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情录音信息",notes = "根据JSON字符串新增灾情录音信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqly zqly) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqly.setRksj(timeS);
        zqly.setGxsj(timeS);
        return zqlyService.insert(zqly);
    }

    @ApiOperation(value = "修改灾情录音信息",notes = "根据JSON字符串修改灾情录音信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqly zqly) throws Exception{
        zqly.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zqlyService.update(zqly);
    }

    @ApiOperation(value = "删除灾情录音信息",notes = "根据JSON字符串删除灾情录音信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqly zqly) throws Exception{
        return zqlyService.delete(zqly);
    }
}
