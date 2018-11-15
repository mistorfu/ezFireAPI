package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Cldp;
import com.kedacom.ezFireAPI.outfire.model.Zbxx;
import com.kedacom.ezFireAPI.outfire.service.CldpService;
import com.kedacom.ezFireAPI.outfire.service.ZbxxService;
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
 * @ClassName ZbxxController
 * @Date 2018/5/29 16:32
 * @Author zhaomeng
 */
@Api(description = "装备信息操作接口")
@RestController
@RequestMapping("/zbxx")
public class ZbxxController {
    private static final Logger logger = LoggerFactory.getLogger(ZbxxController.class);

    @Autowired
    private ZbxxService zbxxService;

    @ApiOperation(value="获取装备信息", notes="根据url参数来获取装备信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zbxx> getZbxxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zbxx params: " + params.toString());
        return zbxxService.selectByMap(params);
    }

    @ApiOperation(value="新增装备信息", notes="根据JSON字符串新增装备信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zbxx zbxx) throws Exception {
        zbxx = zbxxService.setData(zbxx);
        zbxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zbxx.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zbxxService.insert(zbxx);
    }

    @ApiOperation(value="修改装备信息", notes="根据JSON字符串修改装备信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zbxx zbxx) throws Exception {
        zbxx = zbxxService.setData(zbxx);
        zbxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zbxxService.update(zbxx);
    }

    @ApiOperation(value="删除装备信息", notes="根据JSON字符串删除装备信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zbxx zbxx) throws Exception {
        return zbxxService.delete(zbxx);
    }
}