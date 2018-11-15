package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Ablx;
import com.kedacom.ezFireAPI.safe.service.AblxService;
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
 * create by fudapeng on 2018/8/14
 */
@Api(description = "安保路线接口")
@RestController
@RequestMapping("/ablx")
public class AblxController {
    private static final Logger logger = LoggerFactory.getLogger(AblxController.class);

    @Autowired
    private AblxService ablxService;

    @ApiOperation(value = "获取安保路线信息", notes = "根据url获取安保路线信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ablx> getAblxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get ablx param:" + params.toString());
        return ablxService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保路线信息", notes = "根据JSON字符串新增安保路线信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ablx ablx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ablx.setRksj(timeS);
        ablx.setGxsj(timeS);
        List<String> jsnr = Utils.pinyinList(ablx.getLxmc());
        ablx.setJsnr(jsnr);
        return ablxService.insert(ablx);
    }

    @ApiOperation(value = "修改安保路线信息", notes = "根据JSON字符串修改安保路线信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Ablx ablx) throws Exception {
        ablx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        List<String> jsnr = Utils.pinyinList(ablx.getLxmc());
        ablx.setJsnr(jsnr);
        return ablxService.update(ablx);
    }

    @ApiOperation(value = "删除安保路线信息", notes = "根据JSON字符串删除安保路线信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Ablx ablx) throws Exception {
        return ablxService.delete(ablx);
    }
}
