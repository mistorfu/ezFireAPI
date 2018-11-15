package com.kedacom.ezFireAPI.social.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.social.model.Yjlddw;
import com.kedacom.ezFireAPI.social.service.YjlddwService;
import io.swagger.annotations.Api;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */

@Api(description = "应急联动单位操作接口")
@RestController
@RequestMapping("/yjlddw")
public class YjlddwController {
    private static final Logger logger = LoggerFactory.getLogger(YjlddwController.class);

    @Autowired
    private YjlddwService service;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取应急联动单位信息", notes = "根据url参数来获取应急联动单位信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Yjlddw> getYjlddw(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Yjlddw params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增应急联动单位信息", notes = "根据JSON字符串新增应急联动单位信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Yjlddw yjlddw) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        yjlddw.setGxsj(timeS);
        yjlddw.setRksj(timeS);
        yjlddw.setDwlb(commonService.FillDxlb(yjlddw.getDwlb(), ZdxDefine.YJLDDWLB));
        yjlddw.setSzdxfjg(commonService.FillXfjg(yjlddw.getSzdxfjg()));
        yjlddw.setSzdxzqh(commonService.FillXzqh(yjlddw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(yjlddw.getDwmc());
        jsnr.addAll(Utils.pinyinList(yjlddw.getDwdz()));
        yjlddw.setJsnr(jsnr);
        return service.insert(yjlddw);
    }

    @ApiOperation(value = "修改应急联动单位信息", notes = "根据JSON字符串修改应急联动单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Yjlddw yjlddw) throws Exception {
        yjlddw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        yjlddw.setDwlb(commonService.FillDxlb(yjlddw.getDwlb(), ZdxDefine.YJLDDWLB));
        yjlddw.setSzdxfjg(commonService.FillXfjg(yjlddw.getSzdxfjg()));
        yjlddw.setSzdxzqh(commonService.FillXzqh(yjlddw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(yjlddw.getDwmc());
        jsnr.addAll(Utils.pinyinList(yjlddw.getDwdz()));
        yjlddw.setJsnr(jsnr);
        return service.update(yjlddw);
    }

    @ApiOperation(value = "删除应急联动单位信息", notes = "根据JSON字符串删除应急联动单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Yjlddw yjlddw) throws Exception {
        return service.delete(yjlddw);
    }
}
