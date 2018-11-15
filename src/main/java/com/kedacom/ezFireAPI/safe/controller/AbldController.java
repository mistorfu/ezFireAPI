package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abld;
import com.kedacom.ezFireAPI.safe.service.AbldService;
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
@Api(description = "安保联动接口")
@RestController
@RequestMapping("abld")
public class AbldController {
    private static final Logger logger = LoggerFactory.getLogger(AbldController.class);

    @Autowired
    private AbldService abldService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取安保联动信息", notes = "根据url获取安保联动信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Abld> getAblds(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abld param:" + params.toString());
        return abldService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保联动信息", notes = "根据JSON字符串新增安保联动信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abld abld) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abld.setRksj(timeS);
        abld.setGxsj(timeS);
        List<String> jsnr = Utils.pinyinList(abld.getDxmc());
        jsnr.addAll(Utils.pinyinList(abld.getLddx()));
        abld.setJsnr(jsnr);
        return abldService.insert(abld);
    }

    @ApiOperation(value = "修改安保联动信息", notes = "根据JSON字符串修改安保联动信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abld abld) throws Exception {
        abld.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        List<String> jsnr = Utils.pinyinList(abld.getDxmc());
        jsnr.addAll(Utils.pinyinList(abld.getLddx()));
        abld.setJsnr(jsnr);
        return abldService.update(abld);
    }

    @ApiOperation(value = "删除安保联动信息", notes = "根据JSON字符串删除安保联动信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abld abld) throws Exception {
        return abldService.delete(abld);
    }

}
