package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Glsd;
import com.kedacom.ezFireAPI.basic.service.GlsdService;
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
 * @Description: 公路隧道
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "公路隧道操作接口")
@RestController
@RequestMapping("/glsd")
public class GlsdController {
    private static final Logger logger = LoggerFactory.getLogger(GlsdController.class);

    @Autowired
    private GlsdService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取公路隧道信息", notes = "根据url参数来获取公路隧道信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Glsd> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Glsd params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增公路隧道信息", notes = "根据JSON字符串新增公路隧道信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Glsd glsd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        glsd.setRksj(timeS);
        glsd.setGxsj(timeS);

        glsd.setSzdxfjg(commonService.FillXfjg(glsd.getSzdxfjg()));
        glsd.setSzdxzqh(commonService.FillXzqh(glsd.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(glsd.getSdmc());
        jsnr.addAll(Utils.pinyinList(glsd.getSdwz()));
        glsd.setJsnr(jsnr);

        return service.insert(glsd);
    }

    @ApiOperation(value = "修改公路隧道信息", notes = "根据JSON字符串修改公路隧道信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Glsd glsd) throws Exception {
        glsd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        glsd.setSzdxfjg(commonService.FillXfjg(glsd.getSzdxfjg()));
        glsd.setSzdxzqh(commonService.FillXzqh(glsd.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(glsd.getSdmc());
        jsnr.addAll(Utils.pinyinList(glsd.getSdwz()));
        glsd.setJsnr(jsnr);

        return service.update(glsd);
    }

    @ApiOperation(value = "删除公路隧道信息", notes = "根据JSON字符串删除公路隧道信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Glsd glsd) throws Exception {
        return service.delete(glsd);
    }
}
