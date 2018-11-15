package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Szxhs;
import com.kedacom.ezFireAPI.outfire.service.SzxhsService;
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
 * @ClassName SzxhsController
 * @Date 2018/5/30 13:33
 * @Author zhaomeng
 */
@Api(description = "消火栓操作接口")
@RestController
@RequestMapping("/xhs")
public class SzxhsController {
    private static final Logger logger = LoggerFactory.getLogger(SzxhsController.class);

    @Autowired
    private SzxhsService szxhsService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取消火栓信息", notes="根据url参数来获取消火栓信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Szxhs> getXhs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get xhs params: " + params.toString());
        return szxhsService.selectByMap(params);
    }

    @ApiOperation(value="新增消火栓信息", notes="根据JSON字符串新增消火栓信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Szxhs xhs) throws Exception {
        xhs = szxhsService.setData(xhs);
        xhs.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        xhs.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillSzxhsData(xhs);
        return szxhsService.insert(xhs);
    }

    @ApiOperation(value="修改消火栓信息", notes="根据JSON字符串修改消火栓信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Szxhs xhs) throws Exception {
        xhs = szxhsService.setData(xhs);
        xhs.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillSzxhsData(xhs);
        return szxhsService.update(xhs);
    }

    @ApiOperation(value="删除消火栓信息", notes="根据JSON字符串删除消火栓信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Szxhs xhs) throws Exception {
        return szxhsService.delete(xhs);
    }

    private void fillSzxhsData(Szxhs szxhs) {
        szxhs.setFzxt(commonService.FillDxlb(szxhs.getFzxt(), ZdxDefine.XFSYFZXS));
        szxhs.setJkxt(commonService.FillDxlb(szxhs.getJkxt(), ZdxDefine.XFSYJKXS));
        szxhs.setGwxt(commonService.FillDxlb(szxhs.getGwxt(), ZdxDefine.XFSYGWXS));
        szxhs.setSzdxfjg(commonService.FillXfjg(szxhs.getSzdxfjg()));
        szxhs.setSzdxzqh(commonService.FillXzqh(szxhs.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(szxhs.getXhsmc());
        jsnr.addAll(Utils.pinyinList(szxhs.getXhsdz()));
        szxhs.setJsnr(jsnr);
    }
}