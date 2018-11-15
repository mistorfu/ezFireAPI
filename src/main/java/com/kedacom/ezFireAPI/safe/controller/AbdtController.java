package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abdt;
import com.kedacom.ezFireAPI.safe.service.AbdtService;
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
@Api(description = "安保动态接口")
@RestController
@RequestMapping("/abdt")
public class AbdtController {
    private static final Logger logger = LoggerFactory.getLogger(AbdtController.class);

    @Autowired
    private AbdtService abdtService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保动态信息", notes = "根据url获取安保动态信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Abdt> getAbdts(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abdt param:" + params.toString());
        return abdtService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保动态信息", notes = "根据JSON字符串新增安保动态信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abdt abdt) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abdt.setRksj(timeS);
        abdt.setGxsj(timeS);
        abdt.setSzdxfjg(commonService.FillXfjg(abdt.getSzdxfjg()));
        abdt.setSzdxzqh(commonService.FillXzqh(abdt.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abdt.getSjzt());
        jsnr.addAll(Utils.pinyinList(abdt.getFsdd()));
        abdt.setJsnr(jsnr);
        return abdtService.insert(abdt);
    }

    @ApiOperation(value = "修改安保动态信息", notes = "根据JSON字符串修改安保动态信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abdt abdt) throws Exception {
        abdt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        abdt.setSzdxfjg(commonService.FillXfjg(abdt.getSzdxfjg()));
        abdt.setSzdxzqh(commonService.FillXzqh(abdt.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abdt.getSjzt());
        jsnr.addAll(Utils.pinyinList(abdt.getFsdd()));
        abdt.setJsnr(jsnr);
        return abdtService.update(abdt);
    }

    @ApiOperation(value = "删除安保动态信息", notes = "根据JSON字符串删除安保动态信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abdt abdt) throws Exception {
        return abdtService.delete(abdt);
    }
}
