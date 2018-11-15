package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Dxal;
import com.kedacom.ezFireAPI.alarm.service.DxalService;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 典型案例
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "典型案例操作接口")
@RestController
@RequestMapping("/dxal")
public class DxalController {
    private static final Logger logger = LoggerFactory.getLogger(DxalController.class);

    @Autowired
    private DxalService dxalService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取典型案例", notes="根据url参数来获取典型案例")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Dxal> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Dxal params: " + params.toString());
        return dxalService.selectByMap(params);
    }

    @ApiOperation(value="新增典型案例", notes="根据JSON字符串新增典型案例")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Dxal dxal) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        dxal.setGxsj(timeS);
        dxal.setRksj(timeS);
        dxal.setZqlx(commonService.FillDxlb(dxal.getZqlx(), ZdxDefine.ZQLX));
        dxal.setZqdj(commonService.FillDxlb(dxal.getZqdj(), ZdxDefine.ZQDJ));
        dxal.setZqzt(commonService.FillDxlb(dxal.getZqzt(), ZdxDefine.ZQZT));
        dxal.setSzdxfjg(commonService.FillXfjg(dxal.getSzdxfjg()));
        dxal.setSzdxzqh(commonService.FillXzqh(dxal.getSzdxzqh()));
        List<String> jsnr_mc = Utils.pinyinList(dxal.getZqmc());
        dxal.setJsnr_mc(jsnr_mc);
        List<String> jsnr_dz = Utils.pinyinList(dxal.getZqdd());
        dxal.setJsnr_dz(jsnr_dz);
        List<String> jsnr_qh = Utils.pinyinList(dxal.getSzdxzqh().getXzqhmc());
        dxal.setJsnr_qh(jsnr_qh);
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);
        dxal.setJsnr(jsnr);
        return dxalService.insert(dxal);
    }

    @ApiOperation(value="修改典型案例", notes="根据JSON字符串修改典型案例")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Dxal dxal) throws Exception {
        dxal.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        dxal.setZqlx(commonService.FillDxlb(dxal.getZqlx(), ZdxDefine.ZQLX));
        dxal.setZqdj(commonService.FillDxlb(dxal.getZqdj(), ZdxDefine.ZQDJ));
        dxal.setZqzt(commonService.FillDxlb(dxal.getZqzt(), ZdxDefine.ZQZT));
        dxal.setSzdxfjg(commonService.FillXfjg(dxal.getSzdxfjg()));
        dxal.setSzdxzqh(commonService.FillXzqh(dxal.getSzdxzqh()));
        List<String> jsnr_mc = Utils.pinyinList(dxal.getZqmc());
        dxal.setJsnr_mc(jsnr_mc);
        List<String> jsnr_dz = Utils.pinyinList(dxal.getZqdd());
        dxal.setJsnr_dz(jsnr_dz);
        List<String> jsnr_qh = Utils.pinyinList(dxal.getSzdxzqh().getXzqhmc());
        dxal.setJsnr_qh(jsnr_qh);
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);
        dxal.setJsnr(jsnr);
        return dxalService.update(dxal);
    }

    @ApiOperation(value="删除典型案例", notes="根据JSON字符串删除典型案例")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Dxal dxal) throws Exception {
        return dxalService.delete(dxal);
    }
}
