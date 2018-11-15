package com.kedacom.ezFireAPI.qj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.qj.bean.BQjGnfz;
import com.kedacom.ezFireAPI.qj.dao.BQjGnfzDao;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: zhanghao
 * @Description:
 * @Data: create in 11:03 2018/5/29
 * @Mod By:
 */
@Api(description = "功能分组操作接口")
@RestController
@RequestMapping("/bQjGnfz")
public class BQjGnfzController {
    private static final Logger logger = LoggerFactory.getLogger(BQjGnfzController.class);

    @Autowired
    BQjGnfzDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BQjGnfz> getBQjGnfzs(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }

        logger.debug("get BQjGnfzs params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<BQjGnfz> getBQjGnfzByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>(16);
        param.put("fzbh", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody BQjGnfz bQjGnfz) throws JsonProcessingException {
        dao.insertSelective(bQjGnfz);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody BQjGnfz bQjGnfz) throws JsonProcessingException {
        dao.updateByPrimaryKeySelective(bQjGnfz);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody BQjGnfz bQjGnfz) throws JsonProcessingException {
        dao.deleteByPrimaryKey(bQjGnfz.getFzbh());

        return new ReturnMessage();
    }
}
