import com.kedacom.ezFireAPI.Application;
import com.kedacom.ezFireAPI.basic.controller.DzdController;
import com.kedacom.ezFireAPI.basic.model.Dzd;
import com.kedacom.ezFireAPI.basic.model.DzdOrcl;
import com.kedacom.ezFireAPI.basic.service.DzdService;
import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @Description: 地震带
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DzdTest {
    private static final Logger logger = LoggerFactory.getLogger(DzdTest.class);

    @Autowired
    private DzdController controller;

    @Autowired
    private DzdService service;

    @Test
    public void insertDzdsFromOrclToEs() throws Exception {
        Boolean b = false;
        //从oracle中获取所有的地震带
        List<DzdOrcl> dzds = service.getDzdFromOracle();
        //记录插入个数
        int num = 0;

        for (DzdOrcl dzdOrcl : dzds) {
            //判断dzd是否已经存在，不存在则插入，标签改为true
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("dzdmc",dzdOrcl.getDzdmc());
            List<Dzd> dzdsES = controller.get(map);

            if(dzdsES.size() == 0){
                Dzd dzd = new Dzd();
                dzd.setDzdmc(dzdOrcl.getDzdmc());
                dzd.setDzdfl("1");
                dzd.setFbqygs(dzdOrcl.getFbqygs());
                dzd.setLszqgs(dzdOrcl.getLszqgs());
                InnerXzqh xzqh = new InnerXzqh();//行政区划
                xzqh.setXzqhbh(dzdOrcl.getXzqhbh());
                dzd.setSzdxzqh(xzqh);
                dzd.setDzdbh(UUID.randomUUID().toString());

                controller.post(dzd);
                num++;
                b = true;
            }

        }
        logger.info("****共插入" + num + "个新数据到es中****");
    }

}
