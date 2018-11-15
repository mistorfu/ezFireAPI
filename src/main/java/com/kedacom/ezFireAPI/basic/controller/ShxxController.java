package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Shxx;
import com.kedacom.ezFireAPI.basic.service.ShxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
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
 * @Description: 石化信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "石化信息操作接口")
@RestController
@RequestMapping("/shxx")
public class ShxxController {
    private static final Logger logger = LoggerFactory.getLogger(ShxxController.class);

    @Autowired
    private ShxxService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取石化信息信息", notes = "根据url参数来获取石化信息信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Shxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Shxx params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增石化信息信息", notes = "根据JSON字符串新增石化信息信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Shxx shxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        shxx.setRksj(timeS);
        shxx.setGxsj(timeS);

        shxx.setDwlb(commonService.FillDxlb(shxx.getDwlb(),ZdxDefine.SHDWLB));
        shxx.setDwxz(commonService.FillDxlb(shxx.getDwxz(),ZdxDefine.SHDWXZ));

        shxx.setSzdxfjg(commonService.FillXfjg(shxx.getSzdxfjg()));
        shxx.setSzdxzqh(commonService.FillXzqh(shxx.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(shxx.getDwmc());
        jsnr.addAll(Utils.pinyinList(shxx.getDwdz()));
        shxx.setJsnr(jsnr);

        return service.insert(shxx);
    }

    @ApiOperation(value = "修改石化信息信息", notes = "根据JSON字符串修改石化信息信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Shxx shxx) throws Exception {
        shxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        shxx.setDwlb(commonService.FillDxlb(shxx.getDwlb(),ZdxDefine.SHDWLB));
        shxx.setDwxz(commonService.FillDxlb(shxx.getDwxz(),ZdxDefine.SHDWXZ));

        shxx.setSzdxfjg(commonService.FillXfjg(shxx.getSzdxfjg()));
        shxx.setSzdxzqh(commonService.FillXzqh(shxx.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(shxx.getDwmc());
        jsnr.addAll(Utils.pinyinList(shxx.getDwdz()));
        shxx.setJsnr(jsnr);

        return service.update(shxx);
    }

    @ApiOperation(value = "删除石化信息信息", notes = "根据JSON字符串删除石化信息信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Shxx shxx) throws Exception {
        return service.delete(shxx);
    }
}
