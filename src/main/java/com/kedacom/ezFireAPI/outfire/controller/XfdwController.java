package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Xfdw;
import com.kedacom.ezFireAPI.outfire.service.XfdwService;
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
 * @author fudapeng
 * @create 2018/5/25
 **/

@Api(description = "消防单位操作接口")
@RestController
@RequestMapping("/xfdw")
public class XfdwController {
    private static final Logger logger = LoggerFactory.getLogger(XfdwController.class);

    @Autowired
    private XfdwService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取消防单位信息", notes = "根据url参数来获取消防单位信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xfdw> getXfdws(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Xfdw params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增消防单位信息", notes = "根据JSON字符串新增消防单位信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xfdw xfdw) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        xfdw.setRksj(timeS);
        xfdw.setGxsj(timeS);
        fillXfdwData(xfdw);
        return service.insert(xfdw);
    }

    @ApiOperation(value = "修改消防单位信息", notes = "根据JSON字符串修改消防单位信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xfdw xfdw) throws Exception {
        xfdw.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfdwData(xfdw);
        return service.update(xfdw);
    }

    @ApiOperation(value = "删除消防单位信息", notes = "根据JSON字符串删除消防单位信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xfdw xfdw) throws Exception {
        return service.delete(xfdw);
    }

    private void fillXfdwData(Xfdw xfdw) {
        xfdw.setDwlb(commonService.FillDxlb(xfdw.getDwlb(), ZdxDefine.XFJGDWLB));
        xfdw.setSzdxzqh(commonService.FillXzqh(xfdw.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(xfdw.getDwdz());
        jsnr.addAll(Utils.pinyinList(xfdw.getDwmc()));
        xfdw.setJsnr(jsnr);
    }
}