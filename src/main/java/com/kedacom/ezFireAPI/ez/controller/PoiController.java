package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Poi;
import com.kedacom.ezFireAPI.ez.service.PoiService;
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
 * @author  guojiahao
 * @create  2018/5/28
 **/

@Api(description = "社会兴趣点操作接口")
@RestController
@RequestMapping("/poi")
public class PoiController {
    private static final Logger logger = LoggerFactory.getLogger(PoiController.class);

    @Autowired
    private PoiService poiService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取社会兴趣点信息", notes="根据url参数来获取社会兴趣点信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Poi> getPoi(@ApiParam @RequestParam HashMap<String,Object> params)throws Exception{
        logger.debug("get Poi Params" + params.toString());
        return poiService.selectByMap(params);
    }

    @ApiOperation(value="新增社会兴趣点信息", notes="根据JSON字符串新增社会兴趣点信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Poi poi) throws Exception {
        poi.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        poi.setRksj(timeS);
        poi.setGxsj(timeS);
        poi.setXqdlx(commonService.FillDxlb(poi.getXqdlx(),ZdxDefine.XQDLX));
        poi.setSzdxzqh(commonService.FillXzqh(poi.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(poi.getXqdmc());
        jsnr.addAll(Utils.pinyinList(poi.getXqdmz()));
        poi.setJsnr(jsnr);

        return poiService.insert(poi);
    }

    @ApiOperation(value="修改社会兴趣点信息", notes="根据JSON字符串修改社会兴趣点信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Poi poi) throws Exception {
        poi.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        poi.setXqdlx(commonService.FillDxlb(poi.getXqdlx(),ZdxDefine.XQDLX));
        poi.setSzdxzqh(commonService.FillXzqh(poi.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(poi.getXqdmc());
        jsnr.addAll(Utils.pinyinList(poi.getXqdmz()));
        poi.setJsnr(jsnr);
        return poiService.update(poi);
    }

    @ApiOperation(value="删除社会兴趣点信息", notes="根据JSON字符串删除社会兴趣点信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Poi poi) throws Exception {
        return poiService.delete(poi);
    }
}
