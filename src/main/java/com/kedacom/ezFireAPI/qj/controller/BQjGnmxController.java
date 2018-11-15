package com.kedacom.ezFireAPI.qj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.qj.bean.BQjGnmx;
import com.kedacom.ezFireAPI.qj.dao.BQjGnmxDao;
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
@Api(description = "功能明细操作接口")
@RestController
@RequestMapping("/bQjGnmx")
public class BQjGnmxController {
    private static final Logger logger = LoggerFactory.getLogger(BQjGnmxController.class);

    @Autowired
    BQjGnmxDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BQjGnmx> getBQjGnmxs(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }

        logger.debug("get BQjGnmxs params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<BQjGnmx> getBQjGnmxByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>(16);
        param.put("gnbh", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody BQjGnmx bQjGnmx) throws JsonProcessingException {
        dao.insertSelective(bQjGnmx);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody BQjGnmx bQjGnmx) throws JsonProcessingException {
        dao.updateByPrimaryKeySelective(bQjGnmx);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody BQjGnmx bQjGnmx) throws JsonProcessingException {
        dao.deleteByPrimaryKey(bQjGnmx.getGnbh());

        return new ReturnMessage();
    }
}
