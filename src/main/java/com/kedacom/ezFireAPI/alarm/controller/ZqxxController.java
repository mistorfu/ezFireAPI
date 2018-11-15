package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqxx;
import com.kedacom.ezFireAPI.alarm.service.ZqxxService;
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
 * @author luping
 * @date 2018/5/29
 */
@Api(description = "灾情信息操作接口")
@RestController
@RequestMapping("/zqxx")
public class ZqxxController {
    private static final Logger logger = LoggerFactory.getLogger(ZqxxController.class);

    @Autowired
    private ZqxxService zqxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取灾情信息", notes = "根据url参数来获取灾情信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zqxx> getZqxxs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zqxx params: " + params.toString());
        return zqxxService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情信息", notes = "根据JSON字符串新增灾情信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqxx zqxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqxx.setRksj(timeS);
        zqxx.setGxsj(timeS);
        fillZqxxData(zqxx);
        return zqxxService.insert(zqxx);
    }

    @ApiOperation(value = "修改灾情信息", notes = "根据JSON字符串修改灾情信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zqxx zqxx) throws Exception {
        zqxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillZqxxData(zqxx);
        return zqxxService.update(zqxx);
    }

    @ApiOperation(value = "删除灾情信息", notes = "根据JSON字符串删除灾情信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zqxx zqxx) throws Exception {
        return zqxxService.delete(zqxx);
    }

    private void fillZqxxData(Zqxx zqxx) {
        zqxx.setZqlx(commonService.FillDxlb(zqxx.getZqlx(), ZdxDefine.ZQLX));
        zqxx.setZqdj(commonService.FillDxlb(zqxx.getZqdj(),ZdxDefine.ZQDJ));
        zqxx.setZqzt(commonService.FillDxlb(zqxx.getZqzt(),ZdxDefine.ZQZT));
        zqxx.setSzdxfjg(commonService.FillXfjg(zqxx.getSzdxfjg()));
        zqxx.setSzdxzqh(commonService.FillXzqh(zqxx.getSzdxzqh()));
        if (zqxx.getZqmc() == null || zqxx.getZqmc().equals("")) {
            zqxx.setZqmc(zqxx.getSzdxzqh().getXzqhmc() + zqxx.getZqlx().getValue());
        }
        if (zqxx.getZqqc() == null || zqxx.getZqqc().equals("")) {
            zqxx.setZqqc(zqxx.getSzdxzqh().getXzqhmc() + zqxx.getZqlx().getValue());
        }
        //检索内容名称
        List<String> jsnr_mc = Utils.pinyinList(zqxx.getZqmc());
        zqxx.setJsnr_mc(jsnr_mc);
        //检索内容地址
        List<String> jsnr_dz = Utils.pinyinList(zqxx.getZqdd());
        zqxx.setJsnr_dz(jsnr_dz);
        //检索内容区划
        List<String> jsnr_qh = Utils.pinyinList(zqxx.getSzdxzqh().getXzqhmc());
        zqxx.setJsnr_qh(jsnr_qh);
        //检索内容
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);
        zqxx.setJsnr(jsnr);
    }
}
