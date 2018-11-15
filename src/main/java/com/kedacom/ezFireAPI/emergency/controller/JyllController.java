package com.kedacom.ezFireAPI.emergency.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.emergency.model.Jyll;
import com.kedacom.ezFireAPI.emergency.service.JyllService;
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

@Api(description = "救援力量操作接口")
@RestController
@RequestMapping("jyll")
public class JyllController {
    private static final Logger logger = LoggerFactory.getLogger(JyllController.class);

    @Autowired
    private JyllService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取救援力量信息", notes = "根据url参数来获取救援力量信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Jyll> getJylls(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Jyll params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增救援力量信息", notes = "根据JSON字符串新增救援力量信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Jyll jyll) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        jyll.setRksj(timeS);
        jyll.setGxsj(timeS);
        fillJyllData(jyll);
        return service.insert(jyll);
    }

    @ApiOperation(value = "修改救援力量信息", notes = "根据JSON字符串修改救援力量信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Jyll jyll) throws Exception {
        jyll.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillJyllData(jyll);
        return service.update(jyll);
    }

    @ApiOperation(value = "删除救援力量信息", notes = "根据JSON字符串删除救援力量信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Jyll jyll) throws Exception {
        return service.delete(jyll);
    }

    private void fillJyllData(Jyll jyll) {
        jyll.setLllx(commonService.FillDxlb(jyll.getLllx(),ZdxDefine.JYLLLX));

        jyll.setSzdxfjg(commonService.FillXfjg(jyll.getSzdxfjg()));
        jyll.setSzdxzqh(commonService.FillXzqh(jyll.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(jyll.getLldd());
        jsnr.addAll(Utils.pinyinList(jyll.getLlmc()));
        jyll.setJsnr(jsnr);
    }
}
