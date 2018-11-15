package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Ryxx;
import com.kedacom.ezFireAPI.outfire.service.RyxxService;
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
@Api(description = "人员信息操作接口")
@RestController
@RequestMapping("/ryxx")
public class RyxxController {
    private static final Logger logger = LoggerFactory.getLogger(RyxxController.class);

    @Autowired
    private RyxxService service;

    @Autowired
    private CommonService commonService;
    
    @ApiOperation(value = "获取人员信息信息", notes = "根据url参数来获取人员信息信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ryxx> getRyxxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ryxx params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取人员数量", notes = "根据url参数来获取人员数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getRyxxCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ryxx count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增人员信息信息", notes = "根据JSON字符串新增人员信息信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ryxx ryxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ryxx.setRksj(timeS);
        ryxx.setGxsj(timeS);
        fillRyxxData(ryxx);
        return service.insert(ryxx);
    }

    @ApiOperation(value = "修改人员信息信息", notes = "根据JSON字符串修改人员信息信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Ryxx ryxx) throws Exception {
        ryxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillRyxxData(ryxx);
        return service.update(ryxx);
    }

    @ApiOperation(value = "删除人员信息信息", notes = "根据JSON字符串删除人员信息信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Ryxx ryxx) throws Exception {
        return service.delete(ryxx);
    }
    
    private void fillRyxxData(Ryxx ryxx) {
        ryxx.setXb(commonService.FillDxlb(ryxx.getXb(), ZdxDefine.XB));
        ryxx.setMz(commonService.FillDxlb(ryxx.getMz(), ZdxDefine.MZ));
        ryxx.setGw(commonService.FillDxlb(ryxx.getGw(), ZdxDefine.GW));
        ryxx.setZw(commonService.FillDxlb(ryxx.getZw(), ZdxDefine.ZW));
        ryxx.setRylb(commonService.FillDxlb(ryxx.getRylb(), ZdxDefine.RYLB));
        ryxx.setRyzk(commonService.FillDxlb(ryxx.getRyzk(), ZdxDefine.RYZK));
        ryxx.setZwqk(commonService.FillDxlb(ryxx.getZwqk(), ZdxDefine.RYZGZT));
        ryxx.setSzdxfjg(commonService.FillXfjg(ryxx.getSzdxfjg()));
        ryxx.setSzdxzqh(commonService.FillXzqh(ryxx.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(ryxx.getXm());
        jsnr.add(ryxx.getSfzh());
        ryxx.setJsnr(jsnr);
    }
}
