package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Clsz;
import com.kedacom.ezFireAPI.outfire.service.ClszService;
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
 * @ClassName ClszController
 * @Date 2018/5/23 16:49
 * @Author zhaomeng
 */
@Api(description = "车辆上装操作接口")
@RestController
@RequestMapping("/clsz")
public class ClszController {
    private static final Logger logger = LoggerFactory.getLogger(ClszController.class);

    @Autowired
    private ClszService clszService;

    @ApiOperation(value = "获取车辆上装信息",notes = "根据url参数获取车辆上装信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Clsz> getClszs(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("Clsz params :" + params.toString());
        return  clszService.selectByMap(params);
    }

    @ApiOperation(value = "新增车辆上装信息",notes = "根据JSON字符串新增车辆上装信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Clsz> clszs) throws Exception{
        for (Clsz clsz : clszs) {
            clsz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            clszService.insert(clsz);
        }
        return new ReturnMessage();
    }

    @ApiOperation(value = "修改车辆上装信息",notes = "根据JSON字符串修改车辆上装信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Clsz clsz) throws Exception{
        clsz.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return clszService.update(clsz);
    }

    @ApiOperation(value ="删除车辆上装信息",notes = "根据JSON字符串删除车辆上装信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Clsz clsz) throws Exception{
        return clszService.delete(clsz);
    }
}