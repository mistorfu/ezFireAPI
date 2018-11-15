package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Mhyj;
import com.kedacom.ezFireAPI.outfire.service.MhyjService;
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
 * @ClassName MhyjController
 * @Date 2018/5/30 9:43
 * @Author zhaomeng
 */
@Api(description = "灭火药剂操作接口")
@RestController
@RequestMapping("/mhyj")
public class MhyjController {
    private static final Logger logger = LoggerFactory.getLogger(MhyjController.class);

    @Autowired
    private MhyjService mhyjService;

    @ApiOperation(value="获取灭火药剂信息", notes="根据url参数来获取灭火药剂信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Mhyj> getMhyjs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Mhyj params: " + params.toString());
        return mhyjService.selectByMap(params);
    }

    @ApiOperation(value="新增灭火药剂信息", notes="根据JSON字符串新增灭火药剂信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Mhyj mhyj) throws Exception {
        mhyj = mhyjService.setData(mhyj);
        mhyj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        mhyj.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return mhyjService.insert(mhyj);
    }

    @ApiOperation(value="修改灭火药剂信息", notes="根据JSON字符串修改灭火药剂信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Mhyj mhyj) throws Exception {
        mhyj = mhyjService.setData(mhyj);
        mhyj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return mhyjService.update(mhyj);
    }

    @ApiOperation(value="删除灭火药剂信息", notes="根据JSON字符串删除灭火药剂信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Mhyj mhyj) throws Exception {
        return mhyjService.delete(mhyj);
    }
}