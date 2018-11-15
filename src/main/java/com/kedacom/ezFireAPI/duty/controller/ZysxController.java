package com.kedacom.ezFireAPI.duty.controller;



import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.duty.model.Zysx;

import com.kedacom.ezFireAPI.duty.service.ZysxService;
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

@RequestMapping("/zysx")
@Api(description = "重要事项操作接口")
@RestController
public class ZysxController {

    private static final Logger logger = LoggerFactory.getLogger(ZysxController.class);
    @Autowired
    private ZysxService zysxService;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取重要事项信息",notes = "根据url参数获取重要事项信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Zysx> getSxyq(@ApiParam @RequestParam HashMap<String,Object> params)
            throws Exception{
        logger.debug("Zysx params :" + params.toString());
        return zysxService.selectByMap(params);
    }
    @ApiOperation(value = "新增重要事项信息",notes = "根据json字符串新增重要事项信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zysx zysx) throws Exception{
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zysx.setGxsj(timeS);
        zysx.setXfjg(commonService.FillXfjg(zysx.getXfjg()));
        zysx.setXzqh(commonService.FillXzqh(zysx.getXzqh()));
        List<String> jsnr = Utils.pinyinList(zysx.getSxbt());
        jsnr.addAll(Utils.pinyinList(zysx.getSxnr()));
        jsnr.addAll(Utils.pinyinList(zysx.getFbry()));
        jsnr.addAll(Utils.pinyinList(zysx.getFbdw()));
        zysx.setJsnr(jsnr);
        return zysxService.insert(zysx);
    }

    @ApiOperation(value = "修改重要事项信息",notes = "根据json字符串修改重要事项信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zysx zysx) throws Exception{
        zysx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        zysx.setXfjg(commonService.FillXfjg(zysx.getXfjg()));
        zysx.setXzqh(commonService.FillXzqh(zysx.getXzqh()));
        List<String> jsnr = Utils.pinyinList(zysx.getSxbt());
        jsnr.addAll(Utils.pinyinList(zysx.getSxnr()));
        jsnr.addAll(Utils.pinyinList(zysx.getFbry()));
        jsnr.addAll(Utils.pinyinList(zysx.getFbdw()));
        zysx.setJsnr(jsnr);
        return zysxService.update(zysx);
    }

    @ApiOperation(value = "删除重要事项信息",notes = "根据json字符串删除重要事项信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zysx zysx) throws Exception{
        zysx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zysxService.delete(zysx);
    }
}
