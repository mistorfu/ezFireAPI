package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Hcdt;
import com.kedacom.ezFireAPI.alarm.service.HcdtService;
import com.kedacom.ezFireAPI.common.CommonService;
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
 * @description: 火场动态
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "火场动态操作接口")
@RestController
@RequestMapping("/hcdt")
public class HcdtController {
    private static final Logger logger = LoggerFactory.getLogger(HcdtController.class);

    @Autowired
    private HcdtService hcdtService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取火场动态信息", notes="根据url参数来获取火场动态信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Hcdt> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Hcdt params: " + params.toString());
        return hcdtService.selectByMap(params);
    }

    @ApiOperation(value="新增火场动态信息", notes="根据JSON字符串新增火场动态信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Hcdt hcdt) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        hcdt.setGxsj(timeS);
        hcdt.setRksj(timeS);
        return hcdtService.insert(hcdt);
    }

    @ApiOperation(value="修改火场动态信息", notes="根据JSON字符串修改火场动态信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Hcdt hcdt) throws Exception {
        hcdt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return hcdtService.update(hcdt);
    }

    @ApiOperation(value="删除火场动态信息", notes="根据JSON字符串删除火场动态信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Hcdt hcdt) throws Exception {
        return hcdtService.delete(hcdt);
    }
}
