package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Ryzt;
import com.kedacom.ezFireAPI.outfire.service.RyztService;
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
 * Created by fudapeng on 2018/5/31.
 */
@Api(description = "人员状态操作接口")
@RestController
@RequestMapping("/ryzt")
public class RyztController {
    private static final Logger logger = LoggerFactory.getLogger(RyztController.class);

    @Autowired
    private RyztService service;

    @ApiOperation(value = "获取人员状态信息", notes = "根据url参数来获取人员状态信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ryzt> getRyzts(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ryzt params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增人员状态信息", notes = "根据JSON字符串新增人员状态信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ryzt ryzt) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ryzt.setCjsj(timeS);
        ryzt.setGxsj(timeS);
        return service.insert(ryzt);
    }
}
