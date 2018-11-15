package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Szyl;
import com.kedacom.ezFireAPI.safe.service.SzylService;
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
 * create by liangliang on 2018/5/29
 */
@Api(description = "实战演练接口")
@RestController
@RequestMapping("/szyl")
public class SzylController {
    private static final Logger logger = LoggerFactory.getLogger(SzylController.class);

    @Autowired
    private SzylService szylService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取实战演练信息", notes = "根据url获取实战演练信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Szyl> getSzyl(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get szyl param:" + params.toString());
        return szylService.selectByMap(params);
    }

    @ApiOperation(value = "新增实战演练信息", notes = "根据JSON字符串新增实战演练信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Szyl szyl) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        szyl.setRksj(timeS);
        szyl.setGxsj(timeS);
        szyl.setSzdxfjg(commonService.FillXfjg(szyl.getSzdxfjg()));
        szyl.setSzdxzqh(commonService.FillXzqh(szyl.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(szyl.getYlmc());
        jsnr.addAll(Utils.pinyinList(szyl.getYldd()));
        szyl.setJsnr(jsnr);
        return szylService.insert(szyl);
    }

    @ApiOperation(value = "修改实战演练信息", notes = "根据JSON字符串修改实战演练信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Szyl szyl) throws Exception {
        szyl.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        szyl.setSzdxfjg(commonService.FillXfjg(szyl.getSzdxfjg()));
        szyl.setSzdxzqh(commonService.FillXzqh(szyl.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(szyl.getYlmc());
        jsnr.addAll(Utils.pinyinList(szyl.getYldd()));
        szyl.setJsnr(jsnr);
        return szylService.update(szyl);
    }

    @ApiOperation(value = "删除实战演练信息", notes = "根据JSON字符串删除实战演练信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Szyl szyl) throws Exception {
        return szylService.delete(szyl);
    }
}
