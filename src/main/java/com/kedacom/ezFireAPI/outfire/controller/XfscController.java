package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.ZdxDefine;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Xfsc;
import com.kedacom.ezFireAPI.outfire.service.XfscService;
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
 * @ClassName XfscController
 * @Date 2018/5/30 14:11
 * @Author zhaomeng
 */
@Api(description = "消防水池操作接口")
@RestController
@RequestMapping("/xfsc")
public class XfscController {
    private static final Logger logger = LoggerFactory.getLogger(XfscController.class);

    @Autowired
    private XfscService xfscService;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value="获取消防水池信息", notes="根据url参数来获取消防水池信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Xfsc> getXfscs(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get xfsc params: " + params.toString());
        return xfscService.selectByMap(params);
    }

    @ApiOperation(value="新增消防水池信息", notes="根据JSON字符串新增消防水池信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Xfsc xfsc) throws Exception {
        xfsc = xfscService.setData(xfsc);
        xfsc.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        xfsc.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfscData(xfsc);
        return xfscService.insert(xfsc);
    }

    @ApiOperation(value="修改消防水池信息", notes="根据JSON字符串修改消防水池信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Xfsc xfsc) throws Exception {
        xfsc = xfscService.setData(xfsc);
        xfsc.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillXfscData(xfsc);
        return xfscService.update(xfsc);
    }

    @ApiOperation(value="删除消防水池信息", notes="根据JSON字符串删除消防水池信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Xfsc xfsc) throws Exception {
        return xfscService.delete(xfsc);
    }

    private void fillXfscData(Xfsc xfsc) {
        xfsc.setGwxt(commonService.FillDxlb(xfsc.getGwxt(), ZdxDefine.XFSYGWXS));
        xfsc.setSzdxfjg(commonService.FillXfjg(xfsc.getSzdxfjg()));
        xfsc.setSzdxzqh(commonService.FillXzqh(xfsc.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(xfsc.getScmc());
        jsnr.addAll(Utils.pinyinList(xfsc.getScdz()));
        xfsc.setJsnr(jsnr);
    }
}