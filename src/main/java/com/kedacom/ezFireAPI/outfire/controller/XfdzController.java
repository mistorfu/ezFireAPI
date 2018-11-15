package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Xfdz;
import com.kedacom.ezFireAPI.outfire.service.XfdzService;
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
 * Created by fudapeng on 2018/5/29.
 */
@Api(description = "消防队站操作接口")
@RestController
@RequestMapping("/xfdz")
public class XfdzController {
    private static final Logger logger = LoggerFactory.getLogger(XfdzController.class);

    @Autowired
    private XfdzService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取消防队站信息", notes = "根据url参数来获取消防队站信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xfdz> getXfdzs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Xfdz params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增消防队站信息", notes = "根据JSON字符串新增消防队站信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xfdz xfdz) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        xfdz.setRksj(timeS);
        xfdz.setGxsj(timeS);
        fillXfdzData(xfdz);
        return service.insert(xfdz);
    }

    @ApiOperation(value = "修改消防队站信息", notes = "根据JSON字符串修改消防队站信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xfdz xfdz) throws Exception {
        xfdz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfdzData(xfdz);
        return service.update(xfdz);
    }

    @ApiOperation(value = "删除消防队站信息", notes = "根据JSON字符串删除消防队站信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xfdz xfdz) throws Exception {
        return service.delete(xfdz);
    }

    private void fillXfdzData(Xfdz xfdz) {
        xfdz.setDzlb(commonService.FillDxlb(xfdz.getDzlb(), ZdxDefine.XFDZLB));
        xfdz.setDzxs(commonService.FillDxlb(xfdz.getDzxs(), ZdxDefine.XFDZXS));
        xfdz.setSzdxfjg(commonService.FillXfjg(xfdz.getSzdxfjg()));
        xfdz.setSzdxzqh(commonService.FillXzqh(xfdz.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(xfdz.getDzmc());
        jsnr.addAll(Utils.pinyinList(xfdz.getDzdz()));
        xfdz.setJsnr(jsnr);
    }
}
