package com.kedacom.ezFireAPI.emergency.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.emergency.model.Dzyd;
import com.kedacom.ezFireAPI.emergency.service.DzydService;
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
 * Created by fudapeng on 2018/8/28.
 */
@Api(description = "电子运单操作接口")
@RestController
@RequestMapping("/dzyd")
public class DzydController {
    private static final Logger logger = LoggerFactory.getLogger(DzydController.class);

    @Autowired
    private DzydService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取电子运单信息", notes = "根据url参数来获取电子运单信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Dzyd> getDzyds(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Dzyd params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取电子运单数量", notes = "根据url参数来获取电子运单数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getDzydCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Dzyd count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增电子运单信息", notes = "根据JSON字符串新增电子运单信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Dzyd dzyd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        dzyd.setRksj(timeS);
        dzyd.setGxsj(timeS);
        fillDzydData(dzyd);
        return service.insert(dzyd);
    }

    @ApiOperation(value = "修改电子运单信息", notes = "根据JSON字符串修改电子运单信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Dzyd dzyd) throws Exception {
        dzyd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillDzydData(dzyd);
        return service.update(dzyd);
    }

    @ApiOperation(value = "删除电子运单信息", notes = "根据JSON字符串删除电子运单信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Dzyd dzyd) throws Exception {
        return service.delete(dzyd);
    }

    private void fillDzydData(Dzyd dzyd) {
        dzyd.setQdxfjg(commonService.FillXfjg(dzyd.getQdxfjg()));
        dzyd.setQdxzqh(commonService.FillXzqh(dzyd.getQdxzqh()));
        dzyd.setZdxfjg(commonService.FillXfjg(dzyd.getZdxfjg()));
        dzyd.setZdxzqh(commonService.FillXzqh(dzyd.getZdxzqh()));
        List<String> jsnr = Utils.pinyinList(dzyd.getYdmc());
        dzyd.setJsnr(jsnr);
    }
}