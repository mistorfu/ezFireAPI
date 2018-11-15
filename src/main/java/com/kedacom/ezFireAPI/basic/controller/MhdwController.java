package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Fhdw;
import com.kedacom.ezFireAPI.basic.service.FhdwService;
import com.kedacom.ezFireAPI.basic.service.MhdwService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MhdwController
 * @Date 2018/5/29 13:32
 * @Author zhaomeng
 */
@Api(description = "灭火单位操作接口")
@RestController
@RequestMapping("/dwxx_miehuo")
public class MhdwController {
    private static final Logger logger = LoggerFactory.getLogger(MhdwController.class);

    @Autowired
    private MhdwService mhdwService;

    @ApiOperation(value="获取灭火单位信息", notes="根据url参数来获取灭火单位信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Fhdw> getMhdws(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get dwxx params: " + params.toString());
        return mhdwService.selectByMap(params);
    }

    @ApiOperation(value="新增灭火单位信息", notes="根据JSON字符串新增灭火单位信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Fhdw mhdw) throws Exception {
        mhdw = mhdwService.setData(mhdw);
        mhdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        mhdw.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return mhdwService.insert(mhdw);
    }

    @ApiOperation(value="修改灭火单位信息", notes="根据JSON字符串修改灭火单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Fhdw mhdw) throws Exception {
        mhdw = mhdwService.setData(mhdw);
        mhdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return mhdwService.update(mhdw);
    }

    @ApiOperation(value="删除灭火单位信息", notes="根据JSON字符串删除灭火单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Fhdw fhdw) throws Exception {
        return mhdwService.delete(fhdw);
    }
}