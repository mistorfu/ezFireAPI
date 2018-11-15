package com.kedacom.ezFireAPI.basic.controller;

import com.kedacom.ezFireAPI.basic.model.Jzxx;
import com.kedacom.ezFireAPI.basic.service.JzxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerXfdz;
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
import java.util.Iterator;
import java.util.List;

/**
 * @Description: 建筑信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Api(description = "建筑信息操作接口")
@RestController
@RequestMapping("/jzxx")
public class JzxxController {
    private static final Logger logger = LoggerFactory.getLogger(JzxxController.class);

    @Autowired
    private JzxxService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取建筑信息信息", notes = "根据url参数来获取建筑信息信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Jzxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Jzxx params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增建筑信息信息", notes = "根据JSON字符串新增建筑信息信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Jzxx jzxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        jzxx.setRksj(timeS);
        jzxx.setGxsj(timeS);

        jzxx.setJzjg(commonService.FillDxlb(jzxx.getJzjg(), ZdxDefine.JZJG));
        jzxx.setNhdj(commonService.FillDxlb(jzxx.getNhdj(), ZdxDefine.NHDJ));
        jzxx.setBwcllb(commonService.FillDxlb(jzxx.getBwcllb(), ZdxDefine.WBWCLLB));
        jzxx.setJzlb(commonService.FillDxlb(jzxx.getJzlb(), ZdxDefine.JZLB));

        List<InnerDxlbext> jzyt = new ArrayList<InnerDxlbext>();
        Iterator<InnerDxlbext> iterator = jzxx.getJzyt().iterator();
        while (iterator.hasNext()) {
            jzyt.add(commonService.FillDxlb(iterator.next(), ZdxDefine.JZYT));
        }
        jzxx.setJzyt(jzyt);

        jzxx.setSzdxfjg(commonService.FillXfjg(jzxx.getSzdxfjg()));
        jzxx.setSzdxzqh(commonService.FillXzqh(jzxx.getSzdxzqh()));

        //检索内容（名称）
        List<String> jsnr_mc = Utils.pinyinList(jzxx.getJzmc());
        jzxx.setJsnr_mc(jsnr_mc);
        //检索内容（地址）
        List<String> jsnr_dz = Utils.pinyinList(jzxx.getJzdz());
        jzxx.setJsnr_dz(jsnr_dz);
        //检索内容（区划）
        List<String> jsnr_qh = Utils.pinyinList(jzxx.getSzdxzqh().getXzqhmc());
        jzxx.setJsnr_qh(jsnr_qh);
        //检索内容，把名称、地址、区划放入检索内容里面
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);

        jzxx.setJsnr(jsnr);

        return service.insert(jzxx);
    }

    @ApiOperation(value = "修改建筑信息信息", notes = "根据JSON字符串修改建筑信息信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Jzxx jzxx) throws Exception {
        jzxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));

        jzxx.setJzjg(commonService.FillDxlb(jzxx.getJzjg(), ZdxDefine.JZJG));
        jzxx.setNhdj(commonService.FillDxlb(jzxx.getNhdj(), ZdxDefine.NHDJ));
        jzxx.setBwcllb(commonService.FillDxlb(jzxx.getBwcllb(), ZdxDefine.WBWCLLB));
        jzxx.setJzlb(commonService.FillDxlb(jzxx.getJzlb(), ZdxDefine.JZLB));

        List<InnerDxlbext> jzyt = new ArrayList<InnerDxlbext>();
        Iterator<InnerDxlbext> iterator = jzxx.getJzyt().iterator();
        while (iterator.hasNext()) {
            jzyt.add(commonService.FillDxlb(iterator.next(), ZdxDefine.JZYT));
        }
        jzxx.setJzyt(jzyt);

        jzxx.setSzdxfjg(commonService.FillXfjg(jzxx.getSzdxfjg()));
        jzxx.setSzdxzqh(commonService.FillXzqh(jzxx.getSzdxzqh()));

        //检索内容（名称）
        List<String> jsnr_mc = Utils.pinyinList(jzxx.getJzmc());
        jzxx.setJsnr_mc(jsnr_mc);
        //检索内容（地址）
        List<String> jsnr_dz = Utils.pinyinList(jzxx.getJzdz());
        jzxx.setJsnr_dz(jsnr_dz);
        //检索内容（区划）
        List<String> jsnr_qh = Utils.pinyinList(jzxx.getSzdxzqh().getXzqhmc());
        jzxx.setJsnr_qh(jsnr_qh);
        //检索内容，把名称、地址、区划放入检索内容里面
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);

        jzxx.setJsnr(jsnr);

        return service.update(jzxx);
    }

    @ApiOperation(value = "删除建筑信息信息", notes = "根据JSON字符串删除建筑信息信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Jzxx jzxx) throws Exception {
        return service.delete(jzxx);
    }
}
