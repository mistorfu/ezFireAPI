package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abbs;
import com.kedacom.ezFireAPI.safe.service.AbbsService;
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

@Api(description = "安保部署接口")
@RestController
@RequestMapping("/abbs")
public class AbbsController {
    private static final Logger logger = LoggerFactory.getLogger(AbbsController.class);

    @Autowired
    private AbbsService abbsService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保部署信息" , notes = "根据url参数来获取安保部署信息")
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public List<Abbs> getAbbs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Abbs param:" + params.toString());
        return abbsService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保部署信息" , notes = "根据JSON字符串新增安保部署信息")
    @RequestMapping(value = "" , method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abbs abbs) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abbs.setRksj(timeS);
        abbs.setGxsj(timeS);
        abbs.setSzdxfjg(commonService.FillXfjg(abbs.getSzdxfjg()));
        abbs.setSzdxzqh(commonService.FillXzqh(abbs.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abbs.getBsmc());
        jsnr.addAll(Utils.pinyinList(abbs.getBsdd()));
        abbs.setJsnr(jsnr);
        return abbsService.insert(abbs);
    }

    @ApiOperation(value = "修改安保部署信息" , notes = "根据JSON字符串修改安保部署信息")
    @RequestMapping(value = "" , method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abbs abbs) throws Exception {
        abbs.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        abbs.setSzdxfjg(commonService.FillXfjg(abbs.getSzdxfjg()));
        abbs.setSzdxzqh(commonService.FillXzqh(abbs.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(abbs.getBsmc());
        jsnr.addAll(Utils.pinyinList(abbs.getBsdd()));
        abbs.setJsnr(jsnr);
        return abbsService.update(abbs);
    }

    @ApiOperation(value = "删除安保部署信息" , notes = "根据JSON字符串删除安保部署信息")
    @RequestMapping(value = "" , method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abbs abbs) throws Exception {
        return abbsService.delete(abbs);
    }

}
