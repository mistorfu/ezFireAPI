package com.kedacom.ezFireAPI.qj.controller;

import com.kedacom.ezFireAPI.common.dao.CommonDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fudapeng on 2018/7/10.
 */
@Api(description = "系统配置查询接口")
@RestController
@RequestMapping("/xtpz")
public class BQjXtpzController {
    private static final Logger logger = LoggerFactory.getLogger(BQjXtpzController.class);

    @Autowired
    private CommonDao dao;

    @ApiOperation(value = "获取系统配置信息", notes = "根据路由参数来获取系统配置信息")
    @RequestMapping(value = "/{blm}", method = RequestMethod.GET)
    public String getPttServer(@PathVariable("blm") String blm) {
        String result = "";
        Map params = new HashMap();
        params.put("blm", blm);
        List<Map> data = dao.getXtpz(params);
        if (data.size() > 0) result = data.get(0).get("PZZ").toString();

        logger.debug("get xtpz params: " + params.toString() + " result: " + result);

        return result;
    }
}