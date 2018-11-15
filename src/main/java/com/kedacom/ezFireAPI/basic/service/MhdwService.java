package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Fhdw;
import com.kedacom.ezFireAPI.common.*;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MhdwService
 * @Date 2018/5/29 13:30
 * @Author zhaomeng
 */
@Service
public class MhdwService extends EsBaseService<Fhdw> {

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(MhdwService.class);

    public MhdwService() {
        this.config = EsServiceConfigEnum.MHDW;
    }

    public Fhdw setData(Fhdw mhdw) throws Exception{
        mhdw.setDwlb(commonService.FillDxlb(mhdw.getDwlb(), ZdxDefine.ZDDWDWLB));
        if(mhdw.getDwsx()!=null){
            List<InnerDxlbext> tempList = new ArrayList<InnerDxlbext>();
            for(int i =0;i<mhdw.getDwsx().size();i++){
                InnerDxlbext temp = commonService.FillDxlb(mhdw.getDwsx().get(i),ZdxDefine.ZDDWDWSX);
                tempList.add(temp);
            }
            mhdw.setDwsx(tempList);
        }
        mhdw.setHzwhx(commonService.FillDxlb(mhdw.getHzwhx(), ZdxDefine.HZWHX));
        mhdw.setHzyhx(commonService.FillDxlb(mhdw.getHzyhx(), ZdxDefine.HZYHX));
        mhdw.setFgdj(commonService.FillDxlb(mhdw.getFgdj(),ZdxDefine.ZDDWFGDJ));
        mhdw.setSzdxzqh(commonService.FillXzqh(mhdw.getSzdxzqh()));
        mhdw.setSzdxfjg(commonService.FillXfjg(mhdw.getSzdxfjg()));

        List<String> jsnr_mc = Utils.pinyinList(mhdw.getDwmc());
        mhdw.setJsnr_mc(jsnr_mc);
        List<String> jsnr_dz = Utils.pinyinList(mhdw.getDwdz());
        mhdw.setJsnr_dz(jsnr_dz);
        List<String> jsnr_qh = Utils.pinyinList(mhdw.getSzdxzqh().getXzqhmc());
        mhdw.setJsnr_qh(jsnr_qh);
        //检索内容
        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);
        mhdw.setJsnr(jsnr);
        return mhdw;
    }
}