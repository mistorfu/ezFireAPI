package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Station;
import com.kedacom.ezFireAPI.ez.service.StationService;
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
 * Created by fudapeng on 2018/8/28.
 */
@Api(description = "交通站点操作接口")
@RestController
@RequestMapping("/station")
public class StationController {
    private static final Logger logger = LoggerFactory.getLogger(StationController.class);

    @Autowired
    private StationService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取交通站点信息", notes = "根据url参数来获取交通站点信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Station> getStations(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Station params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取交通站点数量", notes = "根据url参数来获取交通站点数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getStationCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Station count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增交通站点信息", notes = "根据JSON字符串新增交通站点信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Station station) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        station.setRksj(timeS);
        station.setGxsj(timeS);
        fillStationData(station);
        return service.insert(station);
    }

    @ApiOperation(value = "修改交通站点信息", notes = "根据JSON字符串修改交通站点信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Station station) throws Exception {
        station.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillStationData(station);
        return service.update(station);
    }

    @ApiOperation(value = "删除交通站点信息", notes = "根据JSON字符串删除交通站点信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Station station) throws Exception {
        return service.delete(station);
    }

    private void fillStationData(Station station) {
        station.setSzdxzqh(commonService.FillXzqh(station.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(station.getZdmc());
        station.setJsnr(jsnr);
    }
}