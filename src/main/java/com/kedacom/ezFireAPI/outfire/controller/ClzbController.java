package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Clzb;
import com.kedacom.ezFireAPI.outfire.service.ClzbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by fudapeng on 2018/7/16.
 */
@Api(description = "车辆装备操作接口")
@RestController
@RequestMapping("/clzb")
public class ClzbController {
    private static final Logger logger = LoggerFactory.getLogger(ClzbController.class);

    @Autowired
    private ClzbService clzbService;

    @ApiOperation(value="获取车辆装备信息", notes="根据url参数来获取车辆装备信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Clzb> getClzbs(@RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Clzb params: " + params.toString());

        return clzbService.selectByMap(params);
    }

    @ApiOperation(value = "新增车辆装备信息", notes = "根据JSON字符串新增前指设备信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@CustomRequestBody List<Clzb> clzbs) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        for (Clzb clzb : clzbs) {
            clzb.setCjsj(timeS);
            clzb.setGxsj(timeS);
            clzbService.insert(clzb);
        }

        return new ReturnMessage();
    }

    @ApiOperation(value = "修改车辆装备信息", notes = "根据JSON字符串修改车辆装备信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody Clzb clzb) throws Exception {
        clzb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        return clzbService.update(clzb);
    }

    @ApiOperation(value = "删除车辆装备信息", notes = "根据JSON字符串删除车辆装备信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody Clzb clzb) throws Exception {
        return clzbService.delete(clzb);
    }
}
