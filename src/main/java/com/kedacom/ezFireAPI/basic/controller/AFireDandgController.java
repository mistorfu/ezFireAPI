package com.kedacom.ezFireAPI.basic.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.basic.bean.AFireDandg;
import com.kedacom.ezFireAPI.basic.dao.AFireDandgDao;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by fudapeng on 2018/5/21.
 */
@Api(description = "危险品操作接口")
@RestController
@RequestMapping("/aFireDandg")
public class AFireDandgController {
    private static final Logger logger = LoggerFactory.getLogger(AFireDandgController.class);

    @Autowired
    private AFireDandgDao dao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<AFireDandg> getAFireDandgs(@RequestParam HashMap<String, String> params) {
        if (!params.containsKey("offset")) {
            params.put("offset", "0");
        }
        if (!params.containsKey("limit")) {
            params.put("limit", "10");
        }
        logger.debug("get AFireDandgs params: " + params.toString());

        return dao.selectByMap(params);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<AFireDandg> getAFireDandgByID(@PathVariable("id") String id) {
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("xh", id);

        return dao.selectByMap(param);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@RequestBody AFireDandg aFireDandg) throws JsonProcessingException {
        dao.insert(aFireDandg);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@RequestBody AFireDandg aFireDandg) throws JsonProcessingException {
        dao.update(aFireDandg);

        return new ReturnMessage();
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@RequestBody AFireDandg aFireDandg) throws JsonProcessingException {
        dao.delete(aFireDandg);

        return new ReturnMessage();
    }

}
