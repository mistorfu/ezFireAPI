package com.kedacom.ezFireAPI.detection.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.detection.bean.BFireJczd;
import com.kedacom.ezFireAPI.detection.bean.BFireJczdKey;
import com.kedacom.ezFireAPI.detection.dao.BFireJczdDao;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: sky
 * @Description:
 * @Data: create in 10:15 2018/5/29
 * @Mod By:
 */
@Api(description = "检测字段操作接口")
@RestController
@RequestMapping("/bFireJczd")
public class BFireJczdController {
    private static final Logger logger = LoggerFactory.getLogger(BFireJczdController.class);

    @Autowired
    BFireJczdDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BFireJczd> getBFireJczds(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }

        logger.debug("get BFireJczds params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<BFireJczd> getBFireJczdByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>(16);
        param.put("zdbs", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody BFireJczd bFireJczd) throws JsonProcessingException {
        dao.insertSelective(bFireJczd);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody BFireJczd bFireJczd) throws JsonProcessingException {
        dao.updateByPrimaryKeySelective(bFireJczd);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody BFireJczdKey bFireJczdKey) throws JsonProcessingException {
        dao.deleteByPrimaryKey(bFireJczdKey);

        return new ReturnMessage();
    }
}
