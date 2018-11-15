package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Xfsc;
import com.kedacom.ezFireAPI.outfire.model.Xfsh;
import com.kedacom.ezFireAPI.outfire.service.XfscService;
import com.kedacom.ezFireAPI.outfire.service.XfshService;
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
 * @ClassName XfshController
 * @Date 2018/5/30 14:31
 * @Author zhaomeng
 */
@Api(description = "消防水鹤操作接口")
@RestController
@RequestMapping("/xfsh")
public class XfshController {
    private static final Logger logger = LoggerFactory.getLogger(XfshController.class);

    @Autowired
    private XfshService xfshService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取消防水鹤信息", notes="根据url参数来获取消防水鹤信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xfsh> getXfshs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get xfsh params: " + params.toString());
        return xfshService.selectByMap(params);
    }

    @ApiOperation(value="新增消防水鹤信息", notes="根据JSON字符串新增消防水鹤信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xfsh xfsh) throws Exception {
        xfsh = xfshService.setData(xfsh);
        xfsh.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        xfsh.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfshData(xfsh);
        return xfshService.insert(xfsh);
    }

    @ApiOperation(value="修改消防水鹤信息", notes="根据JSON字符串修改消防水鹤信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xfsh xfsh) throws Exception {
        xfsh = xfshService.setData(xfsh);
        xfsh.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfshData(xfsh);
        return xfshService.update(xfsh);
    }

    @ApiOperation(value="删除消防水鹤信息", notes="根据JSON字符串删除消防水鹤信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xfsh xfsh) throws Exception {
        return xfshService.delete(xfsh);
    }

    private void fillXfshData(Xfsh xfsh) {
        xfsh.setGwxt(commonService.FillDxlb(xfsh.getGwxt(), ZdxDefine.XFSYGWXS));
        xfsh.setSzdxfjg(commonService.FillXfjg(xfsh.getSzdxfjg()));
        xfsh.setSzdxzqh(commonService.FillXzqh(xfsh.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(xfsh.getShmc());
        jsnr.addAll(Utils.pinyinList(xfsh.getShdz()));
        xfsh.setJsnr(jsnr);
    }
}