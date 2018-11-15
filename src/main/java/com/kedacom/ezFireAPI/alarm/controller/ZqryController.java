package com.kedacom.ezFireAPI.alarm.controller;

import com.kedacom.ezFireAPI.alarm.model.Zqry;
import com.kedacom.ezFireAPI.alarm.service.ZqryService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
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
 * @author luping
 * @date 2018/5/29
 */
@Api(description = "灾情人员操作接口")
@RestController
@RequestMapping("/zqry")
public class ZqryController {
    private static final Logger logger = LoggerFactory.getLogger(ZqryController.class);

    @Autowired
    private ZqryService zqryService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取灾情人员信息", notes = "根据url参数来获取灾情人员信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Zqry> getZqrys(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Zqry params:" + params.toString());
        return zqryService.selectByMap(params);
    }

    @ApiOperation(value = "新增灾情人员信息", notes = "根据JSON字符串新增灾情人员信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Zqry zqry) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        zqry.setRksj(timeS);
        zqry.setGxsj(timeS);
        //if (zqry.getZzlx() == null) zqry.setZzlx("1"); // 1：参战 2：观战 3：作战
        if (zqry.getZzxs() == null) {
            InnerDxlbext zzxs = new InnerDxlbext();
            zzxs.setId("11"); // 1：参战 2：观战 10：指挥作战 11：内攻作战
            zqry.setZzxs(zzxs);
        }
        if (zqry.getZzzt() == null) zqry.setZzzt("1"); // 0：已退出 1：作战中
        zqry.setRyzw(commonService.FillDxlb(zqry.getRyzw(), ZdxDefine.ZW));
        zqry.setZzxs(commonService.FillDxlb(zqry.getZzxs(), ZdxDefine.RYZZXS));
        zqry.setXfjg(commonService.FillXfjg(zqry.getXfjg()));
        return zqryService.insert(zqry);
    }

    /*@ApiOperation(value = "更新灾情人员信息",notes = "根据JSON字符串更新灾情人员信息")
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public String put(@ApiParam @RequestBody Zqry zqry) throws Exception{
        zqry.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return zqryService.update(zqry);
    }

    @ApiOperation(value = "删除灾情人员信息",notes = "根据JSON字符串删除灾情人员信息")
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public String delete(@ApiParam @RequestBody Zqry zqry) throws Exception{
        return zqryService.delete(zqry);
    }*/
}
