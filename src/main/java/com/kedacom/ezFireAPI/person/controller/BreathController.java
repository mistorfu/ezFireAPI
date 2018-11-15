package com.kedacom.ezFireAPI.person.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.person.model.Breath;
import com.kedacom.ezFireAPI.person.service.BreathService;
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
 * Created by fudapeng on 2018/5/27.
 */
@Api(description = "空呼数据操作接口")
@RestController
@RequestMapping("/khsj")
public class BreathController {
    private static final Logger logger = LoggerFactory.getLogger(BreathController.class);

    @Autowired
    private BreathService service;

    @ApiOperation(value = "获取空呼数据信息", notes = "根据url参数来获取空呼数据信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Breath> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Breath params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增空呼数据信息", notes = "根据JSON字符串新增空呼数据信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Breath> breaths) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        for (Breath breath : breaths) {
            breath.setCjsj(timeS);
            breath.setGxsj(timeS);
            service.insert(breath);
        }
        return new ReturnMessage();

    }

    @ApiOperation(value = "修改空呼数据信息", notes = "根据JSON字符串修改空呼数据信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Breath breath) throws Exception {
        breath.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return service.update(breath);
    }

    @ApiOperation(value = "删除空呼数据信息", notes = "根据JSON字符串删除空呼数据信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Breath breath) throws Exception {
        return service.delete(breath);
    }
}
