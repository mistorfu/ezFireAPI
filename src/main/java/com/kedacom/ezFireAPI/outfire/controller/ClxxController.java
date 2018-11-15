package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Clxx;
import com.kedacom.ezFireAPI.outfire.service.ClxxService;
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
 * Created by fudapeng on 2018/5/31.
 */
@Api(description = "车辆信息操作接口")
@RestController
@RequestMapping("/clxx")
public class ClxxController {
    private static final Logger logger = LoggerFactory.getLogger(ClxxController.class);

    @Autowired
    private ClxxService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取车辆信息信息", notes = "根据url参数来获取车辆信息信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Clxx> getClxxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Clxx params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取车辆数量", notes = "根据url参数来获取车辆数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getClxxCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Clxx count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增车辆信息信息", notes = "根据JSON字符串新增车辆信息信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Clxx clxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        clxx.setRksj(timeS);
        clxx.setGxsj(timeS);
        fillClxxData(clxx);
        return service.insert(clxx);
    }

    @ApiOperation(value = "修改车辆信息信息", notes = "根据JSON字符串修改车辆信息信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Clxx clxx) throws Exception {
        clxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillClxxData(clxx);
        return service.update(clxx);
    }

    @ApiOperation(value = "删除车辆信息信息", notes = "根据JSON字符串删除车辆信息信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Clxx clxx) throws Exception {
        return service.delete(clxx);
    }
    
    private void fillClxxData(Clxx clxx) {
        clxx.setCllx(commonService.FillDxlb(clxx.getCllx(), ZdxDefine.XFCLX));
        clxx.setClzt(commonService.FillDxlb(clxx.getClzt(), ZdxDefine.CLZT));
        clxx.setSzdxfjg(commonService.FillXfjg(clxx.getSzdxfjg()));
        clxx.setSzdxzqh(commonService.FillXzqh(clxx.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(clxx.getClmc());
        jsnr.add(clxx.getCphm());
        clxx.setJsnr(jsnr);
    }
}
