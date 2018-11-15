package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Clwz;
import com.kedacom.ezFireAPI.outfire.service.ClwzService;
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
import java.util.Map;

/**
 * Created by fudapeng on 2018/8/27.
 */
@Api(description = "车辆位置操作接口")
@RestController
@RequestMapping("/clwz")
public class ClwzController {
    private static final Logger logger = LoggerFactory.getLogger(ClwzController.class);

    @Autowired
    private ClwzService clwzService;

    @ApiOperation(value = "获取车辆位置信息",notes = "根据url参数获取车辆位置信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Map> getClwzs(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Clwz params :" + params.toString());
        return  clwzService.selectListByMap(params);
    }

    @ApiOperation(value = "新增车辆位置信息",notes = "根据JSON字符串新增车辆位置信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Clwz clwz) throws Exception{
        clwz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return clwzService.insert(clwz);
    }

    @ApiOperation(value = "修改车辆位置信息",notes = "根据JSON字符串修改车辆位置信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Clwz clwz) throws Exception{
        clwz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return clwzService.update(clwz);
    }

    @ApiOperation(value ="删除车辆位置信息",notes = "根据JSON字符串删除车辆位置信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Clwz clwz) throws Exception{
        return clwzService.delete(clwz);
    }
}