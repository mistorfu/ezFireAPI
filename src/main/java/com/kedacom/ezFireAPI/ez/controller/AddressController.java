package com.kedacom.ezFireAPI.ez.controller;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import com.kedacom.ezFireAPI.ez.model.Address;
import com.kedacom.ezFireAPI.ez.service.AddressService;
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
 * Created by fudapeng on 2018/8/28.
 */
@Api(description = "门址门牌号操作接口")
@RestController
@RequestMapping("/address")
public class AddressController {
    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService service;

    @Autowired
    private CommonService commonService;

    @ApiOperation(value = "获取门址门牌号信息", notes = "根据url参数来获取门址门牌号信息")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Address> getAddresss(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Address params: " + params.toString());
        return service.selectByMap(params);
    }

    @ApiOperation(value = "获取门址门牌号数量", notes = "根据url参数来获取门址门牌号数量")
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long getAddressCount(@ApiParam @RequestParam HashMap<String, Object> params) throws Exception {
        logger.debug("get Address count params: " + params.toString());
        return service.getCountByMap(params);
    }

    @ApiOperation(value = "新增门址门牌号信息", notes = "根据JSON字符串新增门址门牌号信息")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ReturnMessage post(@ApiParam @RequestBody Address address) throws Exception {
        String timeS = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
        address.setCjsj(timeS);
        address.setGxsj(timeS);
        fillAddressData(address);
        return service.insert(address);
    }

    @ApiOperation(value = "修改门址门牌号信息", notes = "根据JSON字符串修改门址门牌号信息")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ReturnMessage put(@ApiParam @RequestBody Address address) throws Exception {
        address.setGxsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        fillAddressData(address);
        return service.update(address);
    }

    @ApiOperation(value = "删除门址门牌号信息", notes = "根据JSON字符串删除门址门牌号信息")
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ReturnMessage delete(@ApiParam @RequestBody Address address) throws Exception {
        return service.delete(address);
    }

    private void fillAddressData(Address address) {
        address.setSzdxzqh(commonService.FillXzqh(address.getSzdxzqh()));
        List<String> jsnr = Utils.pinyinList(address.getZzxz());
        address.setJsnr_zzxz(jsnr);
        address.setJsnr_xzqhmc(Utils.pinyinList(address.getSzdxzqh().getXzqhmc()));
    }
}