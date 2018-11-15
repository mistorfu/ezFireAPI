package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Yqgx;
import com.kedacom.ezFireAPI.basic.service.YqgxService;
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
 * @Description: 油气管线
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "油气管线操作接口")
@RestController
@RequestMapping("/yqgx")
public class YqgxController {
    private static final Logger logger = LoggerFactory.getLogger(YqgxController.class);

    @Autowired
    private YqgxService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取油气管线信息", notes = "根据url参数来获取油气管线信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Yqgx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Yqgx params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增油气管线信息", notes = "根据JSON字符串新增油气管线信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Yqgx yqgx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        yqgx.setRksj(timeS);
        yqgx.setGxsj(timeS);

        yqgx.setGxlb(commonService.FillDxlb(yqgx.getGxlb(), ZdxDefine.GXLB));
        yqgx.setSswz(commonService.FillDxlb(yqgx.getSswz(), ZdxDefine.SSWZ));

        yqgx.setXfjg(commonService.FillXfjg(yqgx.getXfjg()));
        yqgx.setSzdxzqh(commonService.FillXzqh(yqgx.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(yqgx.getGxmc());
        jsnr.addAll(Utils.pinyinList(yqgx.getGxgs()));
        yqgx.setJsnr(jsnr);

        return service.insert(yqgx);
    }

    @ApiOperation(value = "修改油气管线信息", notes = "根据JSON字符串修改油气管线信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Yqgx yqgx) throws Exception {
        yqgx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        yqgx.setGxlb(commonService.FillDxlb(yqgx.getGxlb(), ZdxDefine.GXLB));
        yqgx.setSswz(commonService.FillDxlb(yqgx.getSswz(), ZdxDefine.SSWZ));

        yqgx.setXfjg(commonService.FillXfjg(yqgx.getXfjg()));
        yqgx.setSzdxzqh(commonService.FillXzqh(yqgx.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(yqgx.getGxmc());
        jsnr.addAll(Utils.pinyinList(yqgx.getGxgs()));
        yqgx.setJsnr(jsnr);

        return service.update(yqgx);
    }

    @ApiOperation(value = "删除油气管线信息", notes = "根据JSON字符串删除油气管线信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Yqgx yqgx) throws Exception {
        return service.delete(yqgx);
    }
}
