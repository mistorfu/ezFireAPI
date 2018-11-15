package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqzl;
import com.kedacom.ezFireAPI.alarm.service.ZqzlService;
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
@Api(description = "灾情指令操作接口")
@RestController
@RequestMapping("/zqzl")
public class ZqzlController {
    private static final Logger logger = LoggerFactory.getLogger(ZqzlController.class);

    @Autowired
    private ZqzlService zqzlService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取灾情指令信息", notes = "根据url参数来获取灾情指令信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zqzl> getZqzls(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zqzl params: " + params.toString());
        return zqzlService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情指令信息", notes = "根据JSON字符串新增灾情指令信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqzl zqzl) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqzl.setRksj(timeS);
        zqzl.setGxsj(timeS);
        fillZqzlData(zqzl);
        return zqzlService.insert(zqzl);
    }

    @ApiOperation(value = "修改灾情指令信息", notes = "根据JSON字符串修改灾情指令信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqzl zqzl) throws Exception {
        zqzl.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillZqzlData(zqzl);
        return zqzlService.update(zqzl);
    }

    @ApiOperation(value = "删除灾情指令信息", notes = "根据JSON字符串删除灾情指令信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqzl zqzl) throws Exception {
        return zqzlService.delete(zqzl);
    }

    private void fillZqzlData(Zqzl zqzl) {
        zqzl.setFsjg(commonService.FillXfjg(zqzl.getFsjg()));
        zqzl.setJsjg(commonService.FillXfjg(zqzl.getJsjg()));
        List<String> jsnr = Utils.pinyinList(zqzl.getXxzt());
        zqzl.setJsnr(jsnr);
    }
}
