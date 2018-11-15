package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Mhyj;
import com.kedacom.ezFireAPI.outfire.model.Wzck;
import com.kedacom.ezFireAPI.outfire.service.MhyjService;
import com.kedacom.ezFireAPI.outfire.service.WzckService;
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
 * @ClassName WzckController
 * @Date 2018/5/30 10:30
 * @Author zhaomeng
 */
@Api(description = "物资仓库操作接口")
@RestController
@RequestMapping("/wzck")
public class WzckController {
    private static final Logger logger = LoggerFactory.getLogger(WzckController.class);

    @Autowired
    private WzckService wzckService;

    @ApiOperation(value="获取物资仓库信息", notes="根据url参数来获取物资仓库信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Wzck> getWzcks(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get wzck params: " + params.toString());
        return wzckService.selectByMap(params);
    }

    @ApiOperation(value="新增物资仓库信息", notes="根据JSON字符串新增物资仓库信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Wzck wzck) throws Exception {
        wzck = wzckService.setData(wzck);
        wzck.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        wzck.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return wzckService.insert(wzck);
    }

    @ApiOperation(value="修改物资仓库信息", notes="根据JSON字符串修改物资仓库信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Wzck wzck) throws Exception {
        wzck = wzckService.setData(wzck);
        wzck.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return wzckService.update(wzck);
    }

    @ApiOperation(value="删除物资仓库信息", notes="根据JSON字符串删除物资仓库信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Wzck wzck) throws Exception {
        return wzckService.delete(wzck);
    }
}