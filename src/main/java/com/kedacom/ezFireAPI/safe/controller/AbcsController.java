package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abcs;
import com.kedacom.ezFireAPI.safe.service.AbcsService;
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
@Api(description = "安保场所接口")
@RestController
@RequestMapping("/abcs")
public class AbcsController {
    private static final Logger logger = LoggerFactory.getLogger(AbcsController.class);

    @Autowired
    private AbcsService abcsService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保场所信息", notes = "根据url获取安保场所信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Abcs> getAbcs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abcs params:" + params.toString());
        return abcsService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保场所信息", notes = "根据url新增安保场所信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abcs abcs) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abcs.setRksj(timeS);
        abcs.setGxsj(timeS);
        abcs.setSzdxfjg(commonService.FillXfjg(abcs.getSzdxfjg()));
        abcs.setSzdxzqh(commonService.FillXzqh(abcs.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abcs.getCsmc());
        jsnr.addAll(Utils.pinyinList(abcs.getCsdd()));
        abcs.setJsnr(jsnr);
        return abcsService.insert(abcs);
    }

    @ApiOperation(value = "修改安保场所信息", notes = "根据JSON字符串修改安保场所信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abcs abcs) throws Exception {
        abcs.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        abcs.setSzdxfjg(commonService.FillXfjg(abcs.getSzdxfjg()));
        abcs.setSzdxzqh(commonService.FillXzqh(abcs.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abcs.getCsmc());
        jsnr.addAll(Utils.pinyinList(abcs.getCsdd()));
        abcs.setJsnr(jsnr);
        return abcsService.update(abcs);
    }

    @ApiOperation(value = "删除安保场所信息", notes = "根据JSON删除安保场所信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abcs abcs) throws Exception {
        return abcsService.delete(abcs);
    }
}
