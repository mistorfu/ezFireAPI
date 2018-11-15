package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Wxq;
import com.kedacom.ezFireAPI.basic.service.WxqService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
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
 * @Description: 危险区
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "危险区操作接口")
@RestController
@RequestMapping("/wxq")
public class WxqController {
    private static final Logger logger = LoggerFactory.getLogger(WxqController.class);

    @Autowired
    private WxqService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取危险区信息", notes = "根据url参数来获取危险区信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Wxq> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Wxq params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增危险区信息", notes = "根据JSON字符串新增危险区信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Wxq wxq) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        wxq.setRksj(timeS);
        wxq.setGxsj(timeS);

        wxq.setWxqlb(commonService.FillDxlb(wxq.getWxqlb(), ZdxDefine.WBWCLLB));

        wxq.setSzdxfjg(commonService.FillXfjg(wxq.getSzdxfjg()));
        wxq.setSzdxzqh(commonService.FillXzqh(wxq.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(wxq.getWxqmc());
        jsnr.addAll(Utils.pinyinList(wxq.getWxqgs()));
        wxq.setJsnr(jsnr);

        return service.insert(wxq);
    }

    @ApiOperation(value = "修改危险区信息", notes = "根据JSON字符串修改危险区信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Wxq wxq) throws Exception {
        wxq.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        wxq.setWxqlb(commonService.FillDxlb(wxq.getWxqlb(), ZdxDefine.WXQLB));

        wxq.setSzdxfjg(commonService.FillXfjg(wxq.getSzdxfjg()));
        wxq.setSzdxzqh(commonService.FillXzqh(wxq.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(wxq.getWxqmc());
        jsnr.addAll(Utils.pinyinList(wxq.getWxqgs()));
        wxq.setJsnr(jsnr);

        return service.update(wxq);
    }

    @ApiOperation(value = "删除危险区信息", notes = "根据JSON字符串删除危险区信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Wxq wxq) throws Exception {
        return service.delete(wxq);
    }
}
