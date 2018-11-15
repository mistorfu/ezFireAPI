package com.kedacom.ezFireAPI.law.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.law.model.Zftj;
import com.kedacom.ezFireAPI.law.service.ZftjService;
import io.swagger.annotations.Api;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;


/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */
@Api(description = "执法统计信息操作接口")
@RestController
@RequestMapping("/zftj")
public class ZftjController {
    private static final Logger logger = LoggerFactory.getLogger(ZftjController.class);

    @Autowired
    private ZftjService service;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取执法统计信息", notes = "根据url参数来获取执法统计信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zftj> getZftj(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zftj params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增执法统计信息", notes = "根据JSON字符串新增执法统计信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zftj zftj) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zftj.setGxsj(timeS);
        zftj.setRksj(timeS);
        zftj.setSzdxfjg(commonService.FillXfjg(zftj.getSzdxfjg()));
        zftj.setSzdxzqh(commonService.FillXzqh(zftj.getSzdxzqh()));
        return service.insert(zftj);
    }

    @ApiOperation(value = "修改执法统计信息", notes = "根据JSON字符串修改执法统计信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zftj zftj) throws Exception {
        zftj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zftj.setSzdxfjg(commonService.FillXfjg(zftj.getSzdxfjg()));
        zftj.setSzdxzqh(commonService.FillXzqh(zftj.getSzdxzqh()));
        return service.update(zftj);
    }

    @ApiOperation(value = "删除执法统计信息", notes = "根据JSON字符串删除执法统计信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zftj zftj) throws Exception {
        return service.delete(zftj);
    }

}
