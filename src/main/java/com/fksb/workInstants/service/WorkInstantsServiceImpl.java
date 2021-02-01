package com.fksb.workInstants.service;

import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("workInstantsService")
public class WorkInstantsServiceImpl  implements  WorkInstantsService{


     @Autowired
     public  WtEquiMprMapper wtEquiMprMapper;
    @Autowired
    public HttpSession session;

    
    @Override
    public  Map<String,Object> instantsNumber(){
        WtEquiMprVOExample wtEquiMprVOExample = new WtEquiMprVOExample();
        WtEquiMprVOExample.Criteria criteria = wtEquiMprVOExample.createCriteria();
        criteria.andMpUserEqualTo(session.getAttribute("fromUserName").toString());
        List<WtEquiMprVO> wtEquiMprVOS = wtEquiMprMapper.selectByExample(wtEquiMprVOExample);
        LocalDate localDate =LocalDate.now();
        LocalDate yesterday = localDate.plusDays(-1);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        Date date2 = Date.from(instant);
        List<WtEquiMprVO> collect = wtEquiMprVOS.stream().filter(e -> e.getMpDate().after(date2)).collect(Collectors.toList());
        Map<String,Object> map=new HashMap<>();
        map.put("newcount",collect.size());
        map.put("list",wtEquiMprVOS);

        return map;
   }



}
