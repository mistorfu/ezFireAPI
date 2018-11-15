package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Zybd;
import com.kedacom.ezFireAPI.outfire.service.ZybdService;
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
 * Created by fudapeng on 2018/5/31.
 */
@Api(description = "增援编队操作接口")
@RestController
@RequestMapping("/zybd")
public class ZybdController {
    private static final Logger logger = LoggerFactory.getLogger(ZybdController.class);

    @Autowired
    private ZybdService service;

    @Autowired
    private CommonService commonService;
    
    @ApiOperation(value = "获取增援编队信息", notes = "根据url参数来获取增援编队信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zybd> getZybds(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zybd params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增增援编队信息", notes = "根据JSON字符串新增增援编队信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zybd zybd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zybd.setRksj(timeS);
        zybd.setGxsj(timeS);
        fillZybdData(zybd);
        return service.insert(zybd);
    }

    @ApiOperation(value = "修改增援编队信息", notes = "根据JSON字符串修改增援编队信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Zybd zybd) throws Exception {
        zybd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillZybdData(zybd);
        return service.update(zybd);
    }

    @ApiOperation(value = "删除增援编队信息", notes = "根据JSON字符串删除增援编队信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Zybd zybd) throws Exception {
        return service.delete(zybd);
    }

    private void fillZybdData(Zybd zybd) {
        zybd.setDwlb(commonService.FillDxlb(zybd.getDwlb(), ZdxDefine.ZYBDLX));
        zybd.setSzdxfjg(commonService.FillXfjg(zybd.getSzdxfjg()));
        zybd.setSzdxzqh(commonService.FillXzqh(zybd.getSzdxzqh()));
        zybd.setJsnr(Utils.pinyinList(zybd.getDwmc()));
    }
}
