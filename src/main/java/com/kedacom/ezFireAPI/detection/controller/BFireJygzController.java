package com.kedacom.ezFireAPI.detection.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.detection.bean.BFireJygz;
import com.kedacom.ezFireAPI.detection.dao.BFireJygzDao;
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
 * @Data: create in 15:54 2018/5/28
 * @Mod By:
 */
@Api(description = "校验规则操作接口")
@RestController
@RequestMapping("/bFireJygz")
public class BFireJygzController {
    private static final Logger logger = LoggerFactory.getLogger(BFireJygzController.class);

    @Autowired
    BFireJygzDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BFireJygz> getBFireJygzes(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }

        logger.debug("get BFireJygzes params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<BFireJygz> getBFireJygzByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>(16);
        param.put("gzbh", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody BFireJygz bFireJygz) throws JsonProcessingException {
        dao.insertSelective(bFireJygz);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody BFireJygz bFireJygz) throws JsonProcessingException {
        dao.updateSelective(bFireJygz);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody BFireJygz bFireJygz) throws JsonProcessingException {
        dao.delete(bFireJygz.getGzbh());

        return new ReturnMessage();
    }

}

