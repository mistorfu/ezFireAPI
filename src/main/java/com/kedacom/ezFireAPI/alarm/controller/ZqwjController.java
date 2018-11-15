package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqwj;
import com.kedacom.ezFireAPI.alarm.service.ZqwjService;
import com.kedacom.ezFireAPI.common.Utils;
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
 * @author luping
 * @date 2018/5/29
 */
@Api(description = "灾情文件操作接口")
@RestController
@RequestMapping("/zqwj")
public class ZqwjController {
    private static final Logger logger = LoggerFactory.getLogger(ZqwjController.class);

    @Autowired
    private ZqwjService zqwjService;

    @ApiOperation(value = "获取灾情文件信息",notes = "根据url参数来获取灾情文件信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zqwj> getZqwjs(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Zqwj params:" + params.toString());
        return zqwjService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情文件信息",notes = "根据JSON字符串新增灾情文件信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqwj zqwj) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqwj.setRksj(timeS);
        zqwj.setGxsj(timeS);
        return zqwjService.insert(zqwj);
    }

    @ApiOperation(value = "更新灾情文件信息",notes = "根据JSON字符串更新灾情文件信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqwj zqwj) throws Exception{
        zqwj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zqwjService.update(zqwj);
    }

    @ApiOperation(value = "删除灾情文件信息",notes = "根据JSON字符串删除灾情文件信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqwj zqwj) throws Exception{
        return zqwjService.delete(zqwj);
    }
}
