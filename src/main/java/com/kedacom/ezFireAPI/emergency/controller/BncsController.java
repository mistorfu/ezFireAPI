package com.kedacom.ezFireAPI.emergency.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.emergency.model.Bncs;
import com.kedacom.ezFireAPI.emergency.service.BncsService;
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
 * @Author: zhanghao
 * @Description:
 * @Data: create in 19:11 2018/6/26
 * @Mod By:
 */
@Api(description = "避难场所操作接口")
@RestController
@RequestMapping("/bncs")
public class BncsController {
    private static final Logger logger = LoggerFactory.getLogger(BncsController.class);

    @Autowired
    private BncsService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取避难场所信息", notes = "根据url参数来获取避难场所信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Bncs> getBncss(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Bncs params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增避难场所信息", notes = "根据JSON字符串新增避难场所信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Bncs bncs) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        bncs.setRksj(timeS);
        bncs.setGxsj(timeS);
        fillBncsData(bncs);
        return service.insert(bncs);
    }

    @ApiOperation(value = "修改避难场所信息", notes = "根据JSON字符串修改避难场所信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Bncs bncs) throws Exception {
        bncs.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillBncsData(bncs);
        return service.update(bncs);
    }

    @ApiOperation(value = "删除避难场所信息", notes = "根据JSON字符串删除避难场所信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Bncs bncs) throws Exception {
        return service.delete(bncs);
    }

    private void fillBncsData(Bncs bncs) {
        bncs.setSzdxfjg(commonService.FillXfjg(bncs.getSzdxfjg()));
        bncs.setSzdxzqh(commonService.FillXzqh(bncs.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(bncs.getCsmc());
        jsnr.addAll(Utils.pinyinList(bncs.getCsdz()));
        bncs.setJsnr(jsnr);
    }
}
