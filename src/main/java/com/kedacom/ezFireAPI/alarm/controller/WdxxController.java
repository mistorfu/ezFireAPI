package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Wdxx;
import com.kedacom.ezFireAPI.alarm.service.WdxxService;
import com.kedacom.ezFireAPI.common.CommonService;
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
 * @program: ezFireAPI
 * @description: 文电信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "文电信息操作接口")
@RestController
@RequestMapping("/wdxx")
public class WdxxController {
    private static final Logger logger = LoggerFactory.getLogger(DxalController.class);

    @Autowired
    private WdxxService wdxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取文电信息信息", notes="根据url参数来获取文电信息信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Wdxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Wdxx params: " + params.toString());
        return wdxxService.selectByMap(params);
    }

    @ApiOperation(value="新增文电信息信息", notes="根据JSON字符串新增文电信息信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Wdxx wdxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        wdxx.setGxsj(timeS);
        wdxx.setRksj(timeS);
        wdxx.setFsjg(commonService.FillXfjg(wdxx.getFsjg()));
        wdxx.setJsjg(commonService.FillXfjg(wdxx.getJsjg()));
        return wdxxService.insert(wdxx);
    }

    @ApiOperation(value="修改文电信息信息", notes="根据JSON字符串修改文电信息信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Wdxx wdxx) throws Exception {
        wdxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        wdxx.setFsjg(commonService.FillXfjg(wdxx.getFsjg()));
        wdxx.setJsjg(commonService.FillXfjg(wdxx.getJsjg()));
        return wdxxService.update(wdxx);
    }

    @ApiOperation(value="删除文电信息信息", notes="根据JSON字符串删除文电信息信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Wdxx wdxx) throws Exception {
        return wdxxService.delete(wdxx);
    }
}
