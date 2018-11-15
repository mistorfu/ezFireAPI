package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Zydw;
import com.kedacom.ezFireAPI.outfire.service.ZydwService;
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
 * Created by fudapeng on 2018/5/30.
 */
@Api(description = "专业队伍操作接口")
@RestController
@RequestMapping("/zydw")
public class ZydwController {
    private static final Logger logger = LoggerFactory.getLogger(ZydwController.class);

    @Autowired
    private ZydwService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取专业队伍信息", notes = "根据url参数来获取专业队伍信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zydw> getZydws(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zydw params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增专业队伍信息", notes = "根据JSON字符串新增专业队伍信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zydw zydw) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zydw.setRksj(timeS);
        zydw.setGxsj(timeS);
        fillZydwData(zydw);
        return service.insert(zydw);
    }

    @ApiOperation(value = "修改专业队伍信息", notes = "根据JSON字符串修改专业队伍信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zydw zydw) throws Exception {
        zydw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillZydwData(zydw);
        return service.update(zydw);
    }

    @ApiOperation(value = "删除专业队伍信息", notes = "根据JSON字符串删除专业队伍信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zydw zydw) throws Exception {
        return service.delete(zydw);
    }

    private void fillZydwData(Zydw zydw) {
        zydw.setDwxs(commonService.FillDxlb(zydw.getDwxs(), ZdxDefine.ZYDWXS));
        zydw.setDwlb(commonService.FillDxlb(zydw.getDwlb(), ZdxDefine.ZYDWLX));
        zydw.setSzdxfjg(commonService.FillXfjg(zydw.getSzdxfjg()));
        zydw.setSzdxzqh(commonService.FillXzqh(zydw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(zydw.getDwdz());
        jsnr.addAll(Utils.pinyinList(zydw.getDwmc()));
        zydw.setJsnr(jsnr);
    }
}
