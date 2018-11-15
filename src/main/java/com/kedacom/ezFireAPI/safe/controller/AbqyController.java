package com.kedacom.ezFireAPI.safe.controller;

import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.safe.model.Abqy;
import com.kedacom.ezFireAPI.safe.service.AbqyService;
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
 * create by fudapeng on 2018/8/14
 */
@Api(description = "安保区域接口")
@RestController
@RequestMapping("/abqy")
public class AbqyController {
    private static final Logger logger = LoggerFactory.getLogger(AbqyController.class);

    @Autowired
    private AbqyService abqyService;

    @ApiOperation(value = "获取安保区域信息", notes = "根据url获取安保区域信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Abqy> getAbqys(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get abqy param:" + params.toString());
        return abqyService.selectByMap(params);
    }

    @ApiOperation(value = "新增安保区域信息", notes = "根据JSON字符串新增安保区域信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Abqy abqy) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        abqy.setRksj(timeS);
        abqy.setGxsj(timeS);
        List<String> jsnr = Utils.pinyinList(abqy.getQymc());
        abqy.setJsnr(jsnr);
        return abqyService.insert(abqy);
    }

    @ApiOperation(value = "修改安保区域信息", notes = "根据JSON字符串修改安保区域信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Abqy abqy) throws Exception {
        abqy.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        List<String> jsnr = Utils.pinyinList(abqy.getQymc());
        abqy.setJsnr(jsnr);
        return abqyService.update(abqy);
    }

    @ApiOperation(value = "删除安保区域信息", notes = "根据JSON字符串删除安保区域信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Abqy abqy) throws Exception {
        return abqyService.delete(abqy);
    }
}
