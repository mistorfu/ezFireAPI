package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abll;
import com.kedacom.ezFireAPI.safe.service.AbllService;
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
@Api(description = "安保力量接口")
@RestController
@RequestMapping("/abll")
public class AbllController {
    private static final Logger logger = LoggerFactory.getLogger(AbllController.class);

    @Autowired
    private AbllService abllService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保力量信息", notes = "根据url获取安保力量信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Abll> getAblls(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abll param:" + params.toString());
        return abllService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保力量信息", notes = "根据JSON字符串新增安保力量信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abll abll) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abll.setRksj(timeS);
        abll.setGxsj(timeS);
        abll.setLllx(commonService.FillDxlb(abll.getLllx(), ZdxDefine.LLLX));
        abll.setSzdxfjg(commonService.FillXfjg(abll.getSzdxfjg()));
        abll.setSzdxzqh(commonService.FillXzqh(abll.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abll.getLlmc());
        jsnr.addAll(Utils.pinyinList(abll.getLldd()));
        abll.setJsnr(jsnr);
        return abllService.insert(abll);
    }

    @ApiOperation(value = "修改安保力量信息", notes = "根据JSON字符串修改安保力量信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abll abll) throws Exception {
        abll.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        abll.setSzdxfjg(commonService.FillXfjg(abll.getSzdxfjg()));
        abll.setSzdxzqh(commonService.FillXzqh(abll.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abll.getLlmc());
        jsnr.addAll(Utils.pinyinList(abll.getLldd()));
        abll.setJsnr(jsnr);
        return abllService.update(abll);
    }

    @ApiOperation(value = "删除安保力量信息", notes = "根据JSON字符串删除安保力量信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abll abll) throws Exception {
        return abllService.delete(abll);
    }
}
