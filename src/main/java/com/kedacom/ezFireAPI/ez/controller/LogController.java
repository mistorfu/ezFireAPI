package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Log;
import com.kedacom.ezFireAPI.ez.service.LogService;
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
 * @author  guojiahao
 * @create  2018/5/28
 **/


@Api(description = "通用日志操作接口")
@RestController
@RequestMapping("/log")
public class LogController {
    private static final Logger logger=LoggerFactory.getLogger(LogController.class);

    @Autowired
    private LogService logService;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取通用日志信息" , notes = "根据url参数来获取通用日志信息")
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public List<Log> getLog(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Log params: " + params.toString());
        return logService.selectByMap(params);
    }


    @ApiOperation(value = "新增通用日志信息" ,notes = "根据JSON字符串新增通用日志信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Log log) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        log.setRksj(timeS);
        log.setGxsj(timeS);
        log.setRzlx(commonService.FillDxlb(log.getRzlx(),ZdxDefine.RZLX));
        log.setRzjb(commonService.FillDxlb(log.getRzjb(),ZdxDefine.RZJB));
        log.setCzmk(commonService.FillDxlb(log.getCzmk(),ZdxDefine.RZCZMK));
        log.setCzdx(commonService.FillDxlb(log.getCzdx(),ZdxDefine.RZCZDX));
        log.setCzlx(commonService.FillDxlb(log.getCzlx(),ZdxDefine.RZCZLX));

        return logService.insert(log);
    }

    @ApiOperation(value = "修改通用日志信息",notes = "根据JSON字符串修改通用日志信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Log log) throws Exception{
        log.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        log.setRzlx(commonService.FillDxlb(log.getRzlx(),ZdxDefine.RZLX));
        log.setRzjb(commonService.FillDxlb(log.getRzjb(),ZdxDefine.RZJB));
        log.setCzmk(commonService.FillDxlb(log.getCzmk(),ZdxDefine.RZCZMK));
        log.setCzdx(commonService.FillDxlb(log.getCzdx(),ZdxDefine.RZCZDX));
        log.setCzlx(commonService.FillDxlb(log.getCzlx(),ZdxDefine.RZCZLX));

        return logService.update(log);
    }

    @ApiOperation(value = "删除通用日志信息",notes = "根据JSON字符串删除通用日志信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Log log) throws Exception{
        return logService.delete(log);
    }

}
