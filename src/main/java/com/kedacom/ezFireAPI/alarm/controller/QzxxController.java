package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Qzxx;
import com.kedacom.ezFireAPI.alarm.service.QzxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fudapeng on 2018/7/12.
 */
@Api(description = "前指设备信息操作接口")
@RestController
@RequestMapping("/qzxx")
public class QzxxController {
    private static final Logger logger = LoggerFactory.getLogger(QzxxController.class);

    @Autowired
    private QzxxService qzxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取前指设备信息", notes = "根据url参数来获取前指设备信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Qzxx> getQzxxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Qzxx params: " + params.toString());
        return qzxxService.selectByMap(params);
    }

    @ApiOperation(value = "新增前指设备信息", notes = "根据JSON字符串新增前指设备信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Qzxx qzxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        qzxx.setRksj(timeS);
        qzxx.setGxsj(timeS);
        fillQzxxData(qzxx);
        return qzxxService.insert(qzxx);
    }

    @ApiOperation(value = "修改前指设备信息", notes = "根据JSON字符串修改前指设备信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Qzxx qzxx) throws Exception {
        qzxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillQzxxData(qzxx);
        return qzxxService.update(qzxx);
    }

    @ApiOperation(value = "删除前指设备信息", notes = "根据JSON字符串删除前指设备信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Qzxx qzxx) throws Exception {
        return qzxxService.delete(qzxx);
    }

    private void fillQzxxData(Qzxx qzxx) {
        if (qzxx.getShape() == null && qzxx.getJd() != 0 && qzxx.getWd() != 0) {
            InnerShape shape = new InnerShape();
            shape.setCoordinates(Arrays.asList((Object)qzxx.getJd(), qzxx.getWd()));
            shape.setType("point");
            qzxx.setShape(shape);
        }
        qzxx.setSljg(commonService.FillXfjg(qzxx.getSljg()));
        List<String> jsnr = Utils.pinyinList(qzxx.getQzmc());
        jsnr.addAll(Utils.pinyinList(qzxx.getQzdz()));
        qzxx.setJsnr(jsnr);
    }
}