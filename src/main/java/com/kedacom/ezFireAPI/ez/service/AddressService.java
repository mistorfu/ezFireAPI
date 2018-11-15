package com.kedacom.ezFireAPI.ez.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.ez.model.Address;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/28.
 */
@Service
public class AddressService extends EsBaseService<Address> {
    public AddressService() {
        this.config = EsServiceConfigEnum.ADDRESS;
    }
}