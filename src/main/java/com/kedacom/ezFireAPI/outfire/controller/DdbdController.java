package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Ddbd;
import com.kedacom.ezFireAPI.outfire.service.DdbdService;
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
@Api(description = "调度编队操作接口")
@RestController
@RequestMapping("/ddbd")
public class DdbdController {
    private static final Logger logger = LoggerFactory.getLogger(DdbdController.class);

    @Autowired
    private DdbdService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取调度编队信息", notes = "根据url参数来获取调度编队信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Ddbd> getDdbds(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Ddbd params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "新增调度编队信息", notes = "根据JSON字符串新增调度编队信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Ddbd ddbd) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        ddbd.setRksj(timeS);
        ddbd.setGxsj(timeS);
        fillDdbdData(ddbd);
        return service.insert(ddbd);
    }

    @ApiOperation(value = "修改调度编队信息", notes = "根据JSON字符串修改调度编队信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Ddbd ddbd) throws Exception {
        ddbd.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillDdbdData(ddbd);
        return service.update(ddbd);
    }

    @ApiOperation(value = "删除调度编队信息", notes = "根据JSON字符串删除调度编队信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Ddbd ddbd) throws Exception {
        return service.delete(ddbd);
    }
    
    private void fillDdbdData(Ddbd ddbd) {
        ddbd.setDwlb(commonService.FillDxlb(ddbd.getDwlb(), ZdxDefine.SDBDLX));
        ddbd.setSzdxfjg(commonService.FillXfjg(ddbd.getSzdxfjg()));
        ddbd.setSzdxzqh(commonService.FillXzqh(ddbd.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(ddbd.getDwmc());
        ddbd.setJsnr(jsnr);
    }
}
