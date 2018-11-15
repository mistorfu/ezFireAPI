package com.kedacom.ezFireAPI.person.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.person.model.Device;
import com.kedacom.ezFireAPI.person.service.DeviceService;
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
 * Created by fudapeng on 2018/8/14.
 */
@Api(description = "人员装备操作接口")
@RestController
@RequestMapping("/ryzb")
public class DeviceController {
    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);

    @Autowired
    private DeviceService service;

    @ApiOperation(value = "获取人员装备信息", notes = "根据url参数来获取人员装备信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Device> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Device params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增人员装备信息", notes = "根据JSON字符串新增人员装备信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Device> devices) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        for (Device device : devices) {
            device.setCjsj(timeS);
            device.setGxsj(timeS);
            service.insert(device);
        }
        return new ReturnMessage();
    }

    @ApiOperation(value = "修改人员装备信息", notes = "根据JSON字符串修改人员装备信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Device device) throws Exception {
        device.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return service.update(device);
    }

    @ApiOperation(value = "删除人员装备信息", notes = "根据JSON字符串删除人员装备信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Device device) throws Exception {
        return service.delete(device);
    }
}
