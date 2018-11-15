package com.kedacom.ezFireAPI.outfire.controller;
import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Cldp;
import com.kedacom.ezFireAPI.outfire.service.CldpService;
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
 * @author  zhaomeng
 * @create  2018/5/23
 **/

@Api(description = "车辆底盘操作接口")
@RestController
@RequestMapping("/cldp")
public class CldpController {
    private static final Logger logger = LoggerFactory.getLogger(CldpController.class);

    @Autowired
    private CldpService cldpService;

    @ApiOperation(value="获取车辆底盘信息", notes="根据url参数来获取车辆底盘信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Cldp> getCldps(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Cldp params: " + params.toString());
        return cldpService.selectByMap(params);
    }

    @ApiOperation(value="新增车辆底盘信息", notes="根据JSON字符串新增车辆底盘信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @CustomRequestBody List<Cldp> cldps) throws Exception {
        for (Cldp cldp : cldps) {
            cldp.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            cldpService.insert(cldp);
        }
        return new ReturnMessage();
    }

    @ApiOperation(value="修改车辆底盘信息", notes="根据JSON字符串修改车辆底盘信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Cldp cldp) throws Exception {
        cldp.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return cldpService.update(cldp);
    }

    @ApiOperation(value="删除车辆底盘信息", notes="根据JSON字符串删除车辆底盘信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Cldp cldp) throws Exception {
        return cldpService.delete(cldp);
    }
}