package com.kedacom.ezFireAPI.duty.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Tqyb;
import com.kedacom.ezFireAPI.duty.service.TqybService;
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

@Api(description = "天气预报操作接口")
@RestController
@RequestMapping("/tqyb")
public class TqybController {
    @Autowired
    private TqybService tqybService;
    @Autowired
    private CommonService commonService;
    private static final Logger logger = LoggerFactory.getLogger(TqybController.class);
    @ApiOperation(value = "获取天气预报信息",notes = "根据url参数获取天气预报信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Tqyb> getTqyb(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Tqyb params :" + params.toString());
        return tqybService.selectByMap(params);
    }

    @ApiOperation(value = "新增天气预报信息",notes = "根据JSON字符串新增天气预报信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Tqyb tqyb) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        tqyb.setGxsj(timeS);
        tqyb.setXzqh(commonService.FillXzqh(tqyb.getXzqh()));
        return tqybService.insert(tqyb);
    }

    @ApiOperation(value = "修改天气预报信息",notes = "根据JSON字符串修改天气预报信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Tqyb tqyb) throws Exception{
        tqyb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        tqyb.setXzqh(commonService.FillXzqh(tqyb.getXzqh()));
        return tqybService.update(tqyb);
    }


    @ApiOperation(value = "删除天气预报信息",notes = "根据JSON字符串删除天气预报信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Tqyb tqyb) throws Exception{
        tqyb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return tqybService.delete(tqyb);
    }
}
