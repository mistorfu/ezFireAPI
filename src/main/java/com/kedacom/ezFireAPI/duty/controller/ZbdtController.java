package com.kedacom.ezFireAPI.duty.controller;


import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Zbdt;
import com.kedacom.ezFireAPI.duty.service.ZbdtService;
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


@Api(description = "值班动态操作接口")
@RestController
@RequestMapping("/zbdt")
public class ZbdtController {
    private static final Logger logger = LoggerFactory.getLogger(ZbdtController.class);
    @Autowired
    private ZbdtService zbdtService;
    @Autowired
    private CommonService commonService;
    @ApiOperation(value = "获取值班动态信息",notes = "根据url参数获取值班动态信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zbdt> getZbdt(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Zbdt params :" + params.toString());
        return zbdtService.selectByMap(params);
    }

    @ApiOperation(value = "新增值班动态信息",notes = "根据JSON字符串新增值班动态信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zbdt zbdt) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zbdt.setGxsj(timeS);
        zbdt.setXfjg(commonService.FillXfjg(zbdt.getXfjg()));
        zbdt.setXzqh(commonService.FillXzqh(zbdt.getXzqh()));
        return zbdtService.insert(zbdt);
    }

    @ApiOperation(value = "修改值班动态信息",notes = "根据JSON字符串修改值班动态信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zbdt zbdt) throws Exception{
        zbdt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zbdt.setXfjg(commonService.FillXfjg(zbdt.getXfjg()));
        zbdt.setXzqh(commonService.FillXzqh(zbdt.getXzqh()));
        return zbdtService.update(zbdt);
    }


    @ApiOperation(value = "删除值班动态信息",notes = "根据JSON字符串删除值班动态信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zbdt zbdt) throws Exception{
        zbdt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zbdtService.delete(zbdt);
    }
}
