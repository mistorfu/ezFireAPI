package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Cbwz;
import com.kedacom.ezFireAPI.outfire.service.CbwzService;
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
 * @ClassName CbwzController
 * @Date 2018/5/30 10:51
 * @Author zhaomeng
 */
@Api(description = "储备物资操作接口")
@RestController
@RequestMapping("/cbwz")
public class CbwzController {
    private static final Logger logger = LoggerFactory.getLogger(CbwzController.class);

    @Autowired
    private CbwzService cbwzService;

    @ApiOperation(value="获取储备物资信息", notes="根据url参数来获取储备物资信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Cbwz> getCbwzs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get cbwz params: " + params.toString());
        return cbwzService.selectByMap(params);
    }

    @ApiOperation(value="新增储备物资信息", notes="根据JSON字符串新增储备物资信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Cbwz cbwz) throws Exception {
        cbwz = cbwzService.setData(cbwz);
        cbwz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        cbwz.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return cbwzService.insert(cbwz);
    }

    @ApiOperation(value="修改储备物资信息", notes="根据JSON字符串修改储备物资信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Cbwz cbwz) throws Exception {
        cbwz = cbwzService.setData(cbwz);
        cbwz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return cbwzService.update(cbwz);
    }

    @ApiOperation(value="删除储备物资信息", notes="根据JSON字符串删除储备物资信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Cbwz cbwz) throws Exception {
        return cbwzService.delete(cbwz);
    }
}