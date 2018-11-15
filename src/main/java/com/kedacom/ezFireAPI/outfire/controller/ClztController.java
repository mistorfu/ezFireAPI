package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CustomRequestBody;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Clzt;
import com.kedacom.ezFireAPI.outfire.service.ClztService;
import io.swagger.annotations.ApiOperation;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fudapeng on 2018/5/22.
 */
@RestController
@RequestMapping("/clzt")
public class ClztController {
    private static final Logger logger = LoggerFactory.getLogger(ClztController.class);

    @Autowired
    private ClztService clztService;

    @ApiOperation(value = "获取车辆状态信息", notes = "根据url参数来获取车辆状态信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Clzt> getClzts(@RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Clzt params: " + params.toString());

        return clztService.selectByMap(params);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@CustomRequestBody List<Clzt> clzts) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ReturnMessage msg = new ReturnMessage();
        for (Clzt clzt : clzts) {
            clzt.setCjsj(timeS);
            clzt.setGxsj(timeS);
            msg = clztService.insert(clzt);
        }
        return msg;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody Clzt clzt) throws Exception {
        clzt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        return clztService.update(clzt);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody Clzt clzt) throws Exception {
        return clztService.delete(clzt);
    }
}
