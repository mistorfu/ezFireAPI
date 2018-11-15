package com.kedacom.ezFireAPI.detection.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.detection.bean.BFireJcdx;
import com.kedacom.ezFireAPI.detection.bean.BFireJczdKey;
import com.kedacom.ezFireAPI.detection.dao.BFireJcdxDao;
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
 * @Data: create in 10:14 2018/5/29
 * @Mod By:
 */
@Api(description = "检测对象操作接口")
@RestController
@RequestMapping("/bFireJcdx")
public class BFireJcdxController {
    private static final Logger logger = LoggerFactory.getLogger(BFireJcdxController.class);

    @Autowired
    BFireJcdxDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BFireJcdx> getBFireJcdxes(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }

        logger.debug("get BFireJcdxes params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<BFireJcdx> getBFireJcdxByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>(16);
        param.put("dxbh", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody BFireJcdx bFireJcdx) throws JsonProcessingException {
        dao.insertSelective(bFireJcdx);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody BFireJcdx bFireJcdx) throws JsonProcessingException {
        dao.updateSelective(bFireJcdx);

        return new ReturnMessage();
    }


    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody BFireJcdx bFireJcdx) throws JsonProcessingException {
        dao.deleteByPrimaryKey(bFireJcdx.getDxbh());

        return new ReturnMessage();
    }
}
