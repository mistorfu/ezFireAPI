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
 * @ClassName FhdwService
 * @Date 2018/5/25 13:51
 * @Author zhaomeng
 */

@Service
public class FhdwService extends EsBaseService<Fhdw>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(FhdwService.class);

    public FhdwService() {
        this.config = EsServiceConfigEnum.DWXX;
    }

    public Fhdw setData(Fhdw fhdw) throws Exception{
        fhdw.setDwlb(commonService.FillDxlb(fhdw.getDwlb(), ZdxDefine.ZDDWDWLB));
        if(fhdw.getDwsx()!=null) {
            List<InnerDxlbext> tempList = new ArrayList<InnerDxlbext>();
            for (int i = 0; i < fhdw.getDwsx().size(); i++) {
                InnerDxlbext temp = commonService.FillDxlb(fhdw.getDwsx().get(i), ZdxDefine.ZDDWDWSX);
                tempList.add(temp);
            }
            fhdw.setDwsx(tempList);
        }
        fhdw.setHzwhx(commonService.FillDxlb(fhdw.getHzwhx(), ZdxDefine.HZWHX));
        fhdw.setHzyhx(commonService.FillDxlb(fhdw.getHzyhx(), ZdxDefine.HZYHX));
        fhdw.setFgdj(commonService.FillDxlb(fhdw.getFgdj(),ZdxDefine.ZDDWFGDJ));
        fhdw.setSzdxzqh(commonService.FillXzqh(fhdw.getSzdxzqh()));
        fhdw.setSzdxfjg(commonService.FillXfjg(fhdw.getSzdxfjg()));

        List<String> jsnr_mc = Utils.pinyinList(fhdw.getDwmc());
        List<String> jsnr_dz = Utils.pinyinList(fhdw.getDwdz());
        List<String> jsnr_qh = Utils.pinyinList(fhdw.getSzdxzqh().getXzqhmc());
        fhdw.setJsnr_mc(jsnr_mc);
        fhdw.setJsnr_dz(jsnr_dz);
        fhdw.setJsnr_qh(jsnr_qh);

        List<String> jsnr = new ArrayList<String>();
        jsnr.addAll(jsnr_mc);
        jsnr.addAll(jsnr_dz);
        jsnr.addAll(jsnr_qh);
        fhdw.setJsnr(jsnr);
        return  fhdw;
    }
}