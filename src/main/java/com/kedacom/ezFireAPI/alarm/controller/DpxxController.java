
package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Dpxx;
import com.kedacom.ezFireAPI.alarm.service.DpxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
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
 * @description: 调派信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "调派信息操作接口")
@RestController
@RequestMapping("/dpxx")
public class DpxxController {
    private static final Logger logger = LoggerFactory.getLogger(DpxxController.class);

    @Autowired
    private DpxxService dpxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取调派信息", notes="根据url参数来获取调派信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Dpxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Dpxx params: " + params.toString());
        return dpxxService.selectByMap(params);
    }

    @ApiOperation(value="新增调派信息", notes="根据JSON字符串新增调派信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Dpxx dpxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        dpxx.setRksj(timeS);
        dpxx.setGxsj(timeS);
        fillDpxxData(dpxx);
        return dpxxService.insert(dpxx);
    }

    @ApiOperation(value="修改调派信息", notes="根据JSON字符串修改调派信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Dpxx dpxx) throws Exception {
        dpxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillDpxxData(dpxx);
        return dpxxService.update(dpxx);
    }

    @ApiOperation(value="删除调派信息", notes="根据JSON字符串删除调派信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Dpxx dpxx) throws Exception {
        return dpxxService.delete(dpxx);
    }

    private void fillDpxxData(Dpxx dpxx) {
        dpxx.setFsjg(commonService.FillXfjg(dpxx.getFsjg()));
        for (InnerXfjg xfjg : dpxx.getJsjg()) {
            commonService.FillXfjg(xfjg);
        }
        dpxx.setFsxq(commonService.FillXzqh(dpxx.getFsxq()));
    }
}

