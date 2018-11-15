package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Wsxx;
import com.kedacom.ezFireAPI.alarm.service.WsxxService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
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
 * @program: ezFireAPI
 * @description: 火场文书
 * @author: wangjinbo
 * @create: 2018-05-29 09:37
 */

@Api(description = "火场文书操作接口")
@RestController
@RequestMapping("/wsxx")
public class WsxxController {
    private static final Logger logger = LoggerFactory.getLogger(DxalController.class);

    @Autowired
    private WsxxService wsxxService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取火场文书信息", notes="根据url参数来获取火场文书信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Wsxx> get(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get wsxx params: " + params.toString());
        return wsxxService.selectByMap(params);
    }

    @ApiOperation(value="新增火场文书信息", notes="根据JSON字符串新增火场文书信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Wsxx wsxx) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        wsxx.setGxsj(timeS);
        wsxx.setRksj(timeS);
        fillWsxxData(wsxx);
        return wsxxService.insert(wsxx);
    }

    @ApiOperation(value="修改火场文书信息", notes="根据JSON字符串修改火场文书信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Wsxx wsxx) throws Exception {
        wsxx.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillWsxxData(wsxx);
        return wsxxService.update(wsxx);
    }

    @ApiOperation(value="删除火场文书信息", notes="根据JSON字符串删除火场文书信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Wsxx wsxx) throws Exception {
        return wsxxService.delete(wsxx);
    }

    private void fillWsxxData(Wsxx wsxx) {
        wsxx.setFkjg(commonService.FillXfjg(wsxx.getFkjg()));
        List<String> jsnr = Utils.pinyinList(wsxx.getWszt());
        wsxx.setJsnr(jsnr);
    }
}
