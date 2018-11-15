package com.kedacom.ezFireAPI.duty.controller;



import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Sxyq;
import com.kedacom.ezFireAPI.duty.service.SxyqService;
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

@Api(description = "涉消舆情操作接口")
@RequestMapping("/sxyq")
@RestController
public class SxyqController {
    private static final Logger logger = LoggerFactory.getLogger(SxyqController.class);
    @Autowired
    private SxyqService sxyqService;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取涉消舆情信息",notes = "根据url参数获取涉消舆情信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Sxyq> getSxyq(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Sxyq params :" + params.toString());
        return sxyqService.selectByMap(params);
    }
    @ApiOperation(value = "新增涉消舆情信息",notes = "根据json字符串新增涉消舆情信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Sxyq sxyq) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        sxyq.setRkry(timeS);
        sxyq.setGxsj(timeS);
        sxyq.setXfjg(commonService.FillXfjg(sxyq.getXfjg()));
        sxyq.setXzqh(commonService.FillXzqh(sxyq.getXzqh()));
        return sxyqService.insert(sxyq);
    }

    @ApiOperation(value = "修改涉消舆情信息",notes = "根据json字符串修改涉消舆情信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Sxyq sxyq) throws Exception{
        sxyq.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        sxyq.setXfjg(commonService.FillXfjg(sxyq.getXfjg()));
        sxyq.setXzqh(commonService.FillXzqh(sxyq.getXzqh()));


        return sxyqService.update(sxyq);
    }

    @ApiOperation(value = "删除涉消舆情信息",notes = "根据json字符串删除涉消舆情信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Sxyq sxyq) throws Exception{
        sxyq.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return sxyqService.delete(sxyq);
    }
}
