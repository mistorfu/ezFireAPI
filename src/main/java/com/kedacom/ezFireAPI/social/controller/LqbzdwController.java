package com.kedacom.ezFireAPI.social.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.social.model.Lqbzdw;
import com.kedacom.ezFireAPI.social.service.LqbzdwService;
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
@Api(description = "联勤保障单位操作接口")
@RestController
@RequestMapping("/lqbzdw")
public class LqbzdwController {
    private static final Logger logger = LoggerFactory.getLogger(LqbzdwController.class);

    @Autowired
    private LqbzdwService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取联勤保障单位信息", notes = "根据url参数来获取联勤保障单位信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Lqbzdw> getLqbzdw(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Lqbzdw params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增联勤保障单位信息", notes = "根据JSON字符串新增联勤保障单位信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Lqbzdw lqbzdw) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        lqbzdw.setGxsj(timeS);
        lqbzdw.setRksj(timeS);
        lqbzdw.setBzlb(commonService.FillDxlb(lqbzdw.getBzlb(), ZdxDefine.BZLB));
        lqbzdw.setSzdxfjg(commonService.FillXfjg(lqbzdw.getSzdxfjg()));
        lqbzdw.setSzdxzqh(commonService.FillXzqh(lqbzdw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(lqbzdw.getDwmc());
        jsnr.addAll(Utils.pinyinList(lqbzdw.getDwdz()));
        lqbzdw.setJsnr(jsnr);
        return service.insert(lqbzdw);
    }

    @ApiOperation(value = "修改联勤保障单位信息", notes = "根据JSON字符串修改联勤保障单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Lqbzdw lqbzdw) throws Exception {
        lqbzdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        lqbzdw.setBzlb(commonService.FillDxlb(lqbzdw.getBzlb(), ZdxDefine.BZLB));
        lqbzdw.setSzdxfjg(commonService.FillXfjg(lqbzdw.getSzdxfjg()));
        lqbzdw.setSzdxzqh(commonService.FillXzqh(lqbzdw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(lqbzdw.getDwmc());
        jsnr.addAll(Utils.pinyinList(lqbzdw.getDwdz()));
        lqbzdw.setJsnr(jsnr);
        return service.update(lqbzdw);
    }

    @ApiOperation(value = "删除联勤保障单位信息", notes = "根据JSON字符串删除联勤保障单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Lqbzdw lqbzdw) throws Exception {
        return service.delete(lqbzdw);
    }
}
