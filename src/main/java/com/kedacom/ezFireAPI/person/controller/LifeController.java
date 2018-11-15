package com.kedacom.ezFireAPI.person.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.person.model.Life;
import com.kedacom.ezFireAPI.person.service.LifeService;
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
@Api(description = "生命体征操作接口")
@RestController
@RequestMapping("/smtz")
public class LifeController {
    private static final Logger logger = LoggerFactory.getLogger(LifeController.class);

    @Autowired
    private LifeService service;

    @ApiOperation(value = "获取生命体征信息", notes = "根据url参数来获取生命体征信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Life> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Life params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增生命体征信息", notes = "根据JSON字符串新增生命体征信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Life> lifes) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        for (Life life : lifes) {
            life.setCjsj(timeS);
            life.setGxsj(timeS);
            service.insert(life);
        }
        return new ReturnMessage();
    }

    @ApiOperation(value = "修改生命体征信息", notes = "根据JSON字符串修改生命体征信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Life life) throws Exception {
        life.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return service.update(life);
    }

    @ApiOperation(value = "删除生命体征信息", notes = "根据JSON字符串删除生命体征信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Life life) throws Exception {
        return service.delete(life);
    }
}
