package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Pom;
import com.kedacom.ezFireAPI.ez.service.PomService;
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
@Api(description = "地图全景图操作接口")
@RestController
@RequestMapping("/pom")
public class PomController {
    private static final Logger logger = LoggerFactory.getLogger(PomController.class);

    @Autowired
    private PomService pomService;
    @Autowired
    private CommonService commonService;
    @ApiOperation(value = "获取地图全景图信息", notes ="根据url参数来获取地图全景图信息" )
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Pom> getPom(@ApiParam @RequestParam HashMap<String,Object> params) throws Exception{
        logger.debug("get Pom params" + params.toString());
        return pomService.selectByMap(params);
    }

    @ApiOperation(value="新增地图全景图信息", notes="根据JSON字符串新增地图全景图信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Pom pom) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        pom.setRksj(timeS);
        pom.setGxsj(timeS);
        pom.setSzdxfjg(commonService.FillXfjg(pom.getSzdxfjg()));
        pom.setSzdxzqh(commonService.FillXzqh(pom.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(pom.getTxmc());
        jsnr.addAll(Utils.pinyinList(pom.getTxdd()));
        pom.setJsnr(jsnr);
        return pomService.insert(pom);
    }

    @ApiOperation(value="修改地图全景图信息", notes="根据JSON字符串修改地图全景图信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Pom pom) throws Exception {
        pom.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        pom.setSzdxfjg(commonService.FillXfjg(pom.getSzdxfjg()));
        pom.setSzdxzqh(commonService.FillXzqh(pom.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(pom.getTxmc());
        jsnr.addAll(Utils.pinyinList(pom.getTxdd()));
        pom.setJsnr(jsnr);
        return pomService.update(pom);
    }

    @ApiOperation(value="删除地图全景图信息", notes="根据JSON字符串删除地图全景图信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Pom pom) throws Exception {
        return pomService.delete(pom);
    }

}
