package com.kedacom.ezFireAPI.duty.controller;


import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Zbkb;
import com.kedacom.ezFireAPI.duty.service.ZbkbService;
import com.kedacom.ezFireAPI.outfire.model.Clsz;
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


@Api(description = "值班快报操作接口")
@RequestMapping("/zbkb")
@RestController
public class ZbkbController {
    private static final Logger logger = LoggerFactory.getLogger(ZbkbController.class);

    @Autowired
    private ZbkbService zbkbService;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取值班快报信息",notes = "根据url参数获取值班快报信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zbkb> getZbkb(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Zbkb params :" + params.toString());
        return  zbkbService.selectByMap(params);
    }

    @ApiOperation(value = "新增值班快报信息",notes = "根据JSON字符串新增值班快报信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zbkb zbkb) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zbkb.setGxsj(timeS);
        zbkb.setKblb(commonService.FillDxlb(zbkb.getKblb(), ZdxDefine.KBLX));
        zbkb.setXfjg(commonService.FillXfjg(zbkb.getXfjg()));
        zbkb.setXzqh(commonService.FillXzqh(zbkb.getXzqh()));
        List<String> jsnr = Utils.pinyinList(zbkb.getKbbt());
        zbkb.setJsnr(jsnr);
        return zbkbService.insert(zbkb);
    }

    @ApiOperation(value = "修改值班快报信息",notes = "根据JSON字符串修改值班快报信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zbkb zbkb) throws Exception{
        zbkb.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zbkb.setKblb(commonService.FillDxlb(zbkb.getKblb(), ZdxDefine.KBLX));
        zbkb.setXfjg(commonService.FillXfjg(zbkb.getXfjg()));
        zbkb.setXzqh(commonService.FillXzqh(zbkb.getXzqh()));
        List<String> jsnr = Utils.pinyinList(zbkb.getKbbt());
        zbkb.setJsnr(jsnr);
        return zbkbService.update(zbkb);
    }

    @ApiOperation(value ="删除值班快报信息",notes = "根据JSON字符串删除值班快报信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zbkb zbkb) throws Exception{
        return zbkbService.delete(zbkb);
    }

}
