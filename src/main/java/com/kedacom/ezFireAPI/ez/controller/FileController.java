package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.File;
import com.kedacom.ezFireAPI.ez.service.FileService;
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

@Api(description = "通用图像信息操作接口")
@RestController
@RequestMapping("/file")
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileService fileService;
    @Autowired
    private CommonService commonService;
    @ApiOperation(value="获取通用图像信息", notes="根据url参数来获取通用图像信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<File> getFile(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get File params: " + params.toString());
        return fileService.selectByMap(params);
    }


    @ApiOperation(value="新增通用图像信息", notes="根据JSON字符串新增通用图像信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody File file) throws Exception{
        file.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        file.setRksj(timeS);
        file.setGxsj(timeS);
        file.setSzdxfjg(commonService.FillXfjg(file.getSzdxfjg()));
        file.setSzdxzqh(commonService.FillXzqh(file.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(file.getTxmc());
        jsnr.addAll(Utils.pinyinList(file.getTxdd()));
        file.setJsnr(jsnr);
        return fileService.insert(file);
    }


    @ApiOperation(value = "修改通用图像信息" , notes = "根据JSON字符串修改通用图像信息")
    @RequestMapping(value = "" , method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody File file) throws Exception{
        file.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        file.setSzdxfjg(commonService.FillXfjg(file.getSzdxfjg()));
        file.setSzdxzqh(commonService.FillXzqh(file.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(file.getTxmc());
        jsnr.addAll(Utils.pinyinList(file.getTxdd()));
        file.setJsnr(jsnr);
        return fileService.update(file);
    }


    @ApiOperation(value = "删除通用图形信息" , notes = "根据JSON字符串删除通用图像信息")
    @RequestMapping(value = "" , method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody File file) throws Exception{
        return fileService.delete(file);
    }

}
