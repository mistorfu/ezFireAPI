package com.kedacom.ezFireAPI.social.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.social.model.Mhjyzj;
import com.kedacom.ezFireAPI.social.service.MhjyzjService;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */
@Api(description = "灭火救援专家操作接口")
@RestController
@RequestMapping("/mhjyzj")
public class MhjyzjController {
    private static final Logger logger = LoggerFactory.getLogger(MhjyzjController.class);

    @Autowired
    private MhjyzjService service;
    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取灭火救援专家信息", notes = "根据url参数来获取灭火救援专家信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Mhjyzj> getMhjyzj(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Mhjyzj params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增灭火救援专家信息", notes = "根据JSON字符串新增灭火救援专家信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Mhjyzj mhjyzj) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        mhjyzj.setGxsj(timeS);
        mhjyzj.setRksj(timeS);
        fillMhjyzjData(mhjyzj);
        return service.insert(mhjyzj);
    }

    @ApiOperation(value = "修改灭火救援专家信息", notes = "根据JSON字符串修改灭火救援专家信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Mhjyzj mhjyzj) throws Exception {
        mhjyzj.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillMhjyzjData(mhjyzj);
        return service.update(mhjyzj);
    }

    @ApiOperation(value = "删除灭火救援专家信息", notes = "根据JSON字符串删除灭火救援专家信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Mhjyzj mhjyzj) throws Exception {
        return service.delete(mhjyzj);
    }

    private void fillMhjyzjData(Mhjyzj mhjyzj) {
        mhjyzj.setXb(commonService.FillDxlb(mhjyzj.getXb(), ZdxDefine.XB));
        mhjyzj.setXl(commonService.FillDxlb(mhjyzj.getXl(), ZdxDefine.XL));

        List<InnerDxlbext> list = new ArrayList<InnerDxlbext>();
        if (mhjyzj.getZjlyfl() != null) {
            Iterator<InnerDxlbext> iterator = mhjyzj.getZjlyfl().iterator();
            while (iterator.hasNext()) {
                list.add(commonService.FillDxlb(iterator.next(), ZdxDefine.ZJLY));
            }
            mhjyzj.setZjlyfl(list);
        }
        mhjyzj.setSzdxfjg(commonService.FillXfjg(mhjyzj.getSzdxfjg()));
        mhjyzj.setSzdxzqh(commonService.FillXzqh(mhjyzj.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(mhjyzj.getXm());
        jsnr.addAll(Utils.pinyinList(mhjyzj.getJzdz()));
        mhjyzj.setJsnr(jsnr);
    }
}
