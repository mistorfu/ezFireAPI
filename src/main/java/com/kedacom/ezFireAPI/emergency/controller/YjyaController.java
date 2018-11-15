package com.kedacom.ezFireAPI.emergency.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.emergency.model.Yjya;
import com.kedacom.ezFireAPI.emergency.service.YjyaService;
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
 * @Author: zhanghao
 * @Description:
 * @Data: create in 13:45 2018/5/29
 * @Mod By:
 */
@Api(description = "应急预案操作接口")
@RestController
@RequestMapping("/yjya")
public class YjyaController {
    private static final Logger logger = LoggerFactory.getLogger(YjyaController.class);

    @Autowired
    YjyaService yjyaService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取应急预案信息", notes="根据JSON字符串来获取应急预案信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Yjya> getYjyas(@RequestParam @ApiParam(required = false) HashMap<String, Object> params) throws Exception {
        logger.debug("get Yjya params: " + params.toString());

        return yjyaService.selectByMap(params);
    }

    @ApiOperation(value="添加应急预案信息", notes="根据json字符串来添加应急预案信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Yjya yjya) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        yjya.setRksj(timeS);
        yjya.setGxsj(timeS);

        yjya.setYalx(commonService.FillDxlb(yjya.getYalx(),ZdxDefine.YALX));

        yjya.setSzdxzqh(commonService.FillXzqh(yjya.getSzdxzqh()));
        yjya.setSzdxfjg(commonService.FillXfjg(yjya.getSzdxfjg()));

        //TODO 全屏、简拼检索（JSNR）

        return yjyaService.insert(yjya);
    }

    @ApiOperation(value="修改应急预案信息", notes="根据json字符串来修改应急预案信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Yjya yjya) throws Exception {
        yjya.setGxsj( DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        yjya.setYalx(commonService.FillDxlb(yjya.getYalx(),ZdxDefine.YALX));

        yjya.setSzdxzqh(commonService.FillXzqh(yjya.getSzdxzqh()));
        yjya.setSzdxfjg(commonService.FillXfjg(yjya.getSzdxfjg()));

        return yjyaService.update(yjya);
    }

    @ApiOperation(value="删除应急预案信息", notes="根据json字符串来删除应急预案信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Yjya yjya) throws Exception {
        return yjyaService.delete(yjya);
    }
}
