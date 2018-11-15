package com.kedacom.ezFireAPI.duty.controller;



import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Zqll;

import com.kedacom.ezFireAPI.duty.service.ZqllService;
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


@RestController
@RequestMapping("/zqll")
@Api(description = "执勤力量操作接口")
public class ZqllController {
    private static final Logger logger = LoggerFactory.getLogger(ZqllController.class);

    @Autowired
    private ZqllService zqllService;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取执勤力量信息",notes = "根据url参数获取执勤力量信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zqll> getZqll(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Zqll params :" + params.toString());
        return zqllService.selectByMap(params);
    }

    @ApiOperation(value = "新增执勤力量信息",notes = "根据JSON字符串新增执勤力量信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqll zqll) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqll.setGxsj(timeS);
        zqll.setXfjg(commonService.FillXfjg(zqll.getXfjg()));
        zqll.setXzqh(commonService.FillXzqh(zqll.getXzqh()));
        return zqllService.insert(zqll);
    }

    @ApiOperation(value = "修改执勤力量信息",notes = "根据JSON字符串修改执勤力量信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqll zqll) throws Exception{
        zqll.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zqll.setXfjg(commonService.FillXfjg(zqll.getXfjg()));
        zqll.setXzqh(commonService.FillXzqh(zqll.getXzqh()));
        return zqllService.update(zqll);
    }

    @ApiOperation(value ="删除执勤力量信息",notes = "根据JSON字符串删除执勤力量信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqll zqll) throws Exception{
        return zqllService.delete(zqll);
    }

}
