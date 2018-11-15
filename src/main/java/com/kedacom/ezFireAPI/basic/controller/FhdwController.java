package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Fhdw;
import com.kedacom.ezFireAPI.basic.service.FhdwService;
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
 * @ClassName FhdwController
 * @Date 2018/5/25 13:51
 * @Author zhaomeng
 */

@Api(description = "防火单位操作接口")
@RestController
@RequestMapping("/dwxx")
public class FhdwController {
    private static final Logger logger = LoggerFactory.getLogger(FhdwController.class);

    @Autowired
    private FhdwService fhdwService;

    @ApiOperation(value="获取防火单位信息", notes="根据url参数来获取防火单位信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Fhdw> getFhdws(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get dwxx params: " + params.toString());
        return fhdwService.selectByMap(params);
    }

    @ApiOperation(value="新增防火单位信息", notes="根据JSON字符串新增防火单位信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Fhdw fhdw) throws Exception {
        fhdw = fhdwService.setData(fhdw);
        fhdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fhdw.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return fhdwService.insert(fhdw);
    }

    @ApiOperation(value="修改防火单位信息", notes="根据JSON字符串修改防火单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Fhdw fhdw) throws Exception {
        fhdw = fhdwService.setData(fhdw);
        fhdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return fhdwService.update(fhdw);
    }

    @ApiOperation(value="删除防火单位信息", notes="根据JSON字符串删除防火单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Fhdw fhdw) throws Exception {
        return fhdwService.delete(fhdw);
    }
}