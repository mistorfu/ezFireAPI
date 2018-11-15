package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Ybdw;
import com.kedacom.ezFireAPI.outfire.service.YbdwService;
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
 * Created by fudapeng on 2018/5/29.
 */
@Api(description = "应保单位操作接口")
@RestController
@RequestMapping("/ybdw")
public class YbdwController {
    private static final Logger logger = LoggerFactory.getLogger(YbdwController.class);

    @Autowired
    private YbdwService service;

    @Autowired
    private CommonService commonService;
    
    @ApiOperation(value = "获取应保单位信息", notes = "根据url参数来获取应保单位信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ybdw> getYbdws(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ybdw params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增应保单位信息", notes = "根据JSON字符串新增应保单位信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ybdw ybdw) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ybdw.setRksj(timeS);
        ybdw.setGxsj(timeS);
        fillYbdwData(ybdw);
        return service.insert(ybdw);
    }

    @ApiOperation(value = "修改应保单位信息", notes = "根据JSON字符串修改应保单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Ybdw ybdw) throws Exception {
        ybdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillYbdwData(ybdw);
        return service.update(ybdw);
    }

    @ApiOperation(value = "删除应保单位信息", notes = "根据JSON字符串删除应保单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Ybdw ybdw) throws Exception {
        return service.delete(ybdw);
    }
    
    private void fillYbdwData(Ybdw ybdw) {
        ybdw.setBzlb(commonService.FillDxlb(ybdw.getBzlb(), ZdxDefine.DWBZLB));
        ybdw.setSzdxfjg(commonService.FillXfjg(ybdw.getSzdxfjg()));
        ybdw.setSzdxzqh(commonService.FillXzqh(ybdw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(ybdw.getDwdz());
        jsnr.addAll(Utils.pinyinList(ybdw.getDwmc()));
        ybdw.setJsnr(jsnr);
    }
}
