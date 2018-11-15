package com.kedacom.ezFireAPI.duty.controller;



import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Zqyj;

import com.kedacom.ezFireAPI.duty.service.ZqyjService;
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
@Api(description = "灾情预警操作接口")
@RequestMapping("/zqyj")
public class ZqyjController {
    @Autowired
    private ZqyjService zqyjService;
    @Autowired
    private CommonService commonService;
    private static final Logger logger = LoggerFactory.getLogger(ZqyjController.class);
    @ApiOperation(value = "获取灾情预警信息",notes = "根据url参数获取灾情预警信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zqyj> getZqyj(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Zqyj params :" + params.toString());
        return zqyjService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情预警信息",notes = "根据JSON字符串新增灾情预警信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqyj zqyj) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqyj.setGxsj(timeS);
        zqyj.setYjdj(commonService.FillDxlb(zqyj.getYjdj(), ZdxDefine.ZQYJ));
        zqyj.setXfjg(commonService.FillXfjg(zqyj.getXfjg()));
        zqyj.setXzqh(commonService.FillXzqh(zqyj.getXzqh()));
        return zqyjService.insert(zqyj);
    }

    @ApiOperation(value = "修改灾情预警信息",notes = "根据JSON字符串修改灾情预警操信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqyj zqyj) throws Exception{
        zqyj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zqyj.setYjdj(commonService.FillDxlb(zqyj.getYjdj(), ZdxDefine.ZQYJ));
        zqyj.setXfjg(commonService.FillXfjg(zqyj.getXfjg()));
        zqyj.setXzqh(commonService.FillXzqh(zqyj.getXzqh()));
        return zqyjService.update(zqyj);
    }


    @ApiOperation(value = "删除灾情预警信息",notes = "根据JSON字符串删除灾情预警信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqyj zqyj) throws Exception{
        return zqyjService.delete(zqyj);
    }

}
