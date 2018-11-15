package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Trsy;
import com.kedacom.ezFireAPI.outfire.service.TrsyService;
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
 * @ClassName TrsyController
 * @Date 2018/5/30 15:27
 * @Author zhaomeng
 */
@Api(description = "天然水源操作接口")
@RestController
@RequestMapping("/trsy")
public class TrsyController {
    private static final Logger logger = LoggerFactory.getLogger(TrsyController.class);

    @Autowired
    private TrsyService trsyService;

    @ApiOperation(value="获取天然水源信息", notes="根据url参数来获取天然水源信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Trsy> getTrsys(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get trsy params: " + params.toString());
        return trsyService.selectByMap(params);
    }

    @ApiOperation(value="新增天然水源信息", notes="根据JSON字符串新增天然水源信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Trsy trsy) throws Exception {
        trsy = trsyService.setData(trsy);
        trsy.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        trsy.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return trsyService.insert(trsy);
    }

    @ApiOperation(value="修改天然水源消息", notes="根据JSON字符串修改天然水源信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Trsy trsy) throws Exception {
        trsy = trsyService.setData(trsy);
        trsy.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return trsyService.update(trsy);
    }

    @ApiOperation(value="删除天然水源消息", notes="根据JSON字符串删除天然水源信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Trsy trsy) throws Exception {
        return trsyService.delete(trsy);
    }
}