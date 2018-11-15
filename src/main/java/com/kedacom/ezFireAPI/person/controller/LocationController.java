package com.kedacom.ezFireAPI.person.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.person.model.Location;
import com.kedacom.ezFireAPI.person.service.LocationService;
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
 * Created by fudapeng on 2018/7/2.
 */
@Api(description = "室内定位操作接口")
@RestController
@RequestMapping("/sndw")
public class LocationController {
    private static final Logger logger = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    private LocationService service;

    @ApiOperation(value = "获取室内定位信息", notes = "根据url参数来获取室内定位信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Location> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Location params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增室内定位信息", notes = "根据JSON字符串新增室内定位信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Location> locations) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        for (Location location : locations) {
            location.setCjsj(timeS);
            location.setGxsj(timeS);
            service.insert(location);
        }
        return new ReturnMessage();
    }

    @ApiOperation(value = "修改室内定位信息", notes = "根据JSON字符串修改室内定位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Location location) throws Exception {
        location.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return service.update(location);
    }

    @ApiOperation(value = "删除室内定位信息", notes = "根据JSON字符串删除室内定位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Location location) throws Exception {
        return service.delete(location);
    }
}
