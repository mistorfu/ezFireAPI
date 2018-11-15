package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Sdz;
import com.kedacom.ezFireAPI.basic.service.SdzService;
import com.kedacom.ezFireAPI.common.CommonService;
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
 * @Description: 水电站
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "水电站操作接口")
@RestController
@RequestMapping("/sdz")
public class SdzController {
    private static final Logger logger = LoggerFactory.getLogger(SdzController.class);

    @Autowired
    private SdzService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取水电站信息", notes = "根据url参数来获取水电站信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Sdz> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Sdz params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增水电站信息", notes = "根据JSON字符串新增水电站信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Sdz sdz) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        sdz.setRksj(timeS);
        sdz.setGxsj(timeS);

        sdz.setSzdxfjg(commonService.FillXfjg(sdz.getSzdxfjg()));
        sdz.setSzdxzqh(commonService.FillXzqh(sdz.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(sdz.getSdzmc());
        jsnr.addAll(Utils.pinyinList(sdz.getSdzdz()));
        sdz.setJsnr(jsnr);

        return service.insert(sdz);
    }

    @ApiOperation(value = "修改水电站信息", notes = "根据JSON字符串修改水电站信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Sdz sdz) throws Exception {
        sdz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        sdz.setSzdxfjg(commonService.FillXfjg(sdz.getSzdxfjg()));
        sdz.setSzdxzqh(commonService.FillXzqh(sdz.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(sdz.getSdzmc());
        jsnr.addAll(Utils.pinyinList(sdz.getSdzdz()));
        sdz.setJsnr(jsnr);

        return service.update(sdz);
    }

    @ApiOperation(value = "删除水电站信息", notes = "根据JSON字符串删除水电站信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Sdz sdz) throws Exception {
        return service.delete(sdz);
    }
}
