package com.kedacom.ezFireAPI.outfire.controller;

import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.outfire.model.Qsmt;
import com.kedacom.ezFireAPI.outfire.service.QsmtService;
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
 * @ClassName QsmtController
 * @Date 2018/5/30 14:54
 * @Author zhaomeng
 */
@Api(description = "取水码头操作接口")
@RestController
@RequestMapping("/qsmt")
public class QsmtController {
    private static final Logger logger = LoggerFactory.getLogger(QsmtController.class);

    @Autowired
    private QsmtService qsmtService;

    @ApiOperation(value="获取取水码头信息", notes="根据url参数来获取取水码头信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Qsmt> getQsmts(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get qsmt params: " + params.toString());
        return qsmtService.selectByMap(params);
    }

    @ApiOperation(value="新增取水码头信息", notes="根据JSON字符串新增取水码头信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Qsmt qsmt) throws Exception {
        qsmt = qsmtService.setData(qsmt);
        qsmt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        qsmt.setRksj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return qsmtService.insert(qsmt);
    }

    @ApiOperation(value="修改取水码头信息", notes="根据JSON字符串修改取水码头信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Qsmt qsmt) throws Exception {
        qsmt = qsmtService.setData(qsmt);
        qsmt.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        return qsmtService.update(qsmt);
    }

    @ApiOperation(value="删除取水码头信息", notes="根据JSON字符串删除取水码头信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Qsmt qsmt) throws Exception {
        return qsmtService.delete(qsmt);
    }
}