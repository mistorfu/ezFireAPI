package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqwx;
import com.kedacom.ezFireAPI.alarm.service.ZqwxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
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
 * @author luping
 * @date 2018/5/29
 */
@Api(description = "灾情微信操作接口")
@RestController
@RequestMapping("/zqwx")
public class ZqwxController {
    private static final Logger logger = LoggerFactory.getLogger(ZqwxController.class);

    @Autowired
    private ZqwxService zqwxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取灾情微信信息",notes = "根据url参数来获取灾情微信信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zqwx> getZqwxs(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Zqwx params:" + params.toString());
        return zqwxService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情微信信息",notes = "根据JSON字符串新增灾情微信信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqwx zqwx) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqwx.setRksj(timeS);
        zqwx.setGxsj(timeS);
        fillZqwxData(zqwx);
        return zqwxService.insert(zqwx);
    }

    @ApiOperation(value = "修改灾情微信信息",notes = "根据JSON字符串修改灾情微信信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqwx zqwx) throws Exception{
        zqwx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillZqwxData(zqwx);
        return zqwxService.update(zqwx);
    }

    @ApiOperation(value = "删除灾情微信信息",notes = "根据JSON字符串删除灾情微信信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqwx zqwx) throws Exception{
        return zqwxService.delete(zqwx);
    }

    private void fillZqwxData(Zqwx zqwx) {
        zqwx.setFsjg(commonService.FillXfjg(zqwx.getFsjg()));
        List<String> jsnr = Utils.pinyinList(zqwx.getXxzt());
        zqwx.setJsnr(jsnr);
    }
}
