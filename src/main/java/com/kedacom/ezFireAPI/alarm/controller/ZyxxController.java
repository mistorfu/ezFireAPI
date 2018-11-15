package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zyxx;
import com.kedacom.ezFireAPI.alarm.service.ZyxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.ZdxDefine;
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
 * @program: ezFireAPI
 * @description: 请求增援
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "请求增援操作接口")
@RestController
@RequestMapping("/zyxx")
public class ZyxxController {
    private static final Logger logger = LoggerFactory.getLogger(ZyxxController.class);

    @Autowired
    private ZyxxService zyxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取请求增援信息", notes="根据url参数来获取请求增援信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zyxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get zyxx params: " + params.toString());
        return zyxxService.selectByMap(params);
    }

    @ApiOperation(value="新增请求增援信息", notes="根据JSON字符串新增请求增援信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zyxx zyxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zyxx.setGxsj(timeS);
        zyxx.setRksj(timeS);
        zyxx.setQqlx(commonService.FillDxlb(zyxx.getQqlx(),ZdxDefine.QQLX));
        zyxx.setQqjg(commonService.FillXfjg(zyxx.getQqjg()));
        zyxx.setJsjg(commonService.FillXfjg(zyxx.getJsjg()));
        return zyxxService.insert(zyxx);
    }

    @ApiOperation(value="修改请求增援信息", notes="根据JSON字符串修改请求增援信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zyxx zyxx) throws Exception {
        zyxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zyxx.setQqlx(commonService.FillDxlb(zyxx.getQqlx(),ZdxDefine.QQLX));
        zyxx.setQqjg(commonService.FillXfjg(zyxx.getQqjg()));
        zyxx.setJsjg(commonService.FillXfjg(zyxx.getJsjg()));
        return zyxxService.update(zyxx);
    }

    @ApiOperation(value="删除请求增援信息", notes="根据JSON字符串删除请求增援信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zyxx zyxx) throws Exception {
        return zyxxService.delete(zyxx);
    }
}
