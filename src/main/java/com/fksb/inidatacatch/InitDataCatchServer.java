package com.fksb.inidatacatch;

import com.fksb.fksbenrol.mapper.WtOrgBMapper;
import com.fksb.fksbenrol.model.WtOrgBVO;
import com.fksb.fksbenrol.model.WtOrgBVOExample;
import com.fksb.supportmothord.mapper.FbTableMapper;
import com.fksb.supportmothord.mapper.WtWaterpriceMapper;
import com.fksb.supportmothord.model.FbTableVO;
import com.fksb.supportmothord.model.FbTableVOExample;
import com.fksb.supportmothord.model.WtWaterpriceVO;
import com.fksb.supportmothord.model.WtWaterpriceVOExample;
import com.fksb.utill.CacheUtil;
import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Component
public class InitDataCatchServer  implements ApplicationListener<ContextRefreshedEvent> {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private WtWaterpriceMapper wtWaterpriceMapper;

    @Autowired
    private WtOrgBMapper wtOrgBMapper;

    @Autowired
    private FbTableMapper fbTableMapper;

    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(contextRefreshedEvent.getApplicationContext().getParent()==null){

            logger.info("服务器启动,加载用水类型到内存中");
            WtWaterpriceVOExample wtWaterpriceVOExample = new WtWaterpriceVOExample();
            List<WtWaterpriceVO> listWaterType = wtWaterpriceMapper.selectByExample(wtWaterpriceVOExample);
            CacheUtil.getInstance().addCacheData("listWaterType",listWaterType);

            logger.info("启动时加载机构到内存中");
            
            WtOrgBVOExample wtOrgBVOExample=new WtOrgBVOExample();
            List<WtOrgBVO> wtOrgBVOS = wtOrgBMapper.selectByExample(wtOrgBVOExample);
            CacheUtil.getInstance().addCacheData("listWtOrgcd",wtOrgBVOS);


            logger.info("启动时加载分表到内存中");

            FbTableVOExample fbTableVOExample=new FbTableVOExample();
            List<FbTableVO> fbTableVOS = fbTableMapper.selectByExample(fbTableVOExample);
            CacheUtil.getInstance().addCacheData("listFbTable",fbTableVOS);
        }
    }
}
