package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Zbxx;
import com.kedacom.ezFireAPI.outfire.service.TzzbService;
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
 * @ClassName TzzbController
 * @Date 2018/5/29 17:15
 * @Author zhaomeng
 */
@Api(description = "特种装备操作接口")
@RestController
@RequestMapping("/tzzb")
public class TzzbController {
    private static final Logger logger = LoggerFactory.getLogger(TzzbController.class);

    @Autowired
    private TzzbService tzzbService;

    @ApiOperation(value="获取特种装备信息", notes="根据url参数来获取特种装备信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zbxx> getTzzbs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Tzzb params: " + params.toString());
        return tzzbService.selectByMap(params);
    }

    @ApiOperation(value="新增特种装备信息", notes="根据JSON字符串新增特种装备信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zbxx tzzb) throws Exception {
        tzzb = tzzbService.setData(tzzb);
        tzzb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        tzzb.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return tzzbService.insert(tzzb);
    }

    @ApiOperation(value="修改特种装备信息", notes="根据JSON字符串修改特种装备信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zbxx tzzb) throws Exception {
        tzzb = tzzbService.setData(tzzb);
        tzzb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return tzzbService.update(tzzb);
    }

    @ApiOperation(value="删除特种装备信息", notes="根据JSON字符串删除特种装备信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zbxx tzzb) throws Exception {
        return tzzbService.delete(tzzb);
    }
}