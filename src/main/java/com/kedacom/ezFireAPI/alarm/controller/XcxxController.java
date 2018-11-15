package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Xcxx;
import com.kedacom.ezFireAPI.alarm.service.XcxxService;
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
 * @program: ezFireAPI
 * @description: 现场信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "现场信息操作接口")
@RestController
@RequestMapping("/xcxx")
public class XcxxController {
    private static final Logger logger = LoggerFactory.getLogger(XcxxController.class);

    @Autowired
    private XcxxService xcxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取现场信息", notes="根据url参数来获取现场信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xcxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Xcxx params: " + params.toString());
        return xcxxService.selectByMap(params);
    }

    @ApiOperation(value="新增现场信息", notes="根据JSON字符串新增现场信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xcxx xcxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        xcxx.setGxsj(timeS);
        xcxx.setRksj(timeS);
        return xcxxService.insert(xcxx);
    }

    @ApiOperation(value="修改现场信息", notes="根据JSON字符串修改现场信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xcxx xcxx) throws Exception {
        xcxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return xcxxService.update(xcxx);
    }

    @ApiOperation(value="删除现场信息", notes="根据JSON字符串删除现场信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xcxx xcxx) throws Exception {
        return xcxxService.delete(xcxx);
    }

}
