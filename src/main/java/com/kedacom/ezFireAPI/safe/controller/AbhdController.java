package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abhd;
import com.kedacom.ezFireAPI.safe.service.AbhdService;
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
@Api(description = "安保活动接口")
@RestController
@RequestMapping("/abhd")
public class AbhdController {
    private static final Logger logger = LoggerFactory.getLogger(AbhdController.class);

    @Autowired
    private AbhdService abhdService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保活动信息", notes = "根据url获取安保活动信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Abhd> getAbhds(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abhd param:" + params.toString());
        return abhdService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保活动信息", notes = "根据JSON字符串新增安保活动信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abhd abhd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abhd.setRksj(timeS);
        abhd.setGxsj(timeS);
        abhd.setHdjb(commonService.FillDxlb(abhd.getHdjb(), ZdxDefine.HDJB));
        abhd.setSzdxfjg(commonService.FillXfjg(abhd.getSzdxfjg()));
        abhd.setSzdxzqh(commonService.FillXzqh(abhd.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abhd.getHdmc());
        jsnr.addAll(Utils.pinyinList(abhd.getHddd()));
        abhd.setJsnr(jsnr);
        return abhdService.insert(abhd);
    }

    @ApiOperation(value = "修改安保活动信息", notes = "根据JSON字符串修改安保活动信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abhd abhd) throws Exception {
        abhd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        abhd.setSzdxfjg(commonService.FillXfjg(abhd.getSzdxfjg()));
        abhd.setSzdxzqh(commonService.FillXzqh(abhd.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abhd.getHdmc());
        jsnr.addAll(Utils.pinyinList(abhd.getHddd()));
        abhd.setJsnr(jsnr);
        return abhdService.update(abhd);
    }

    @ApiOperation(value = "删除安保活动信息", notes = "根据JSON字符串删除安保活动信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abhd abhd) throws Exception {
        return abhdService.delete(abhd);
    }
}
