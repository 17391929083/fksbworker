package com.fksb.fksbselect.service;

import com.fksb.fksbenrol.model.WtOrgBVO;
import com.fksb.fksbenrol.service.FksbEnrolService;
import com.fksb.fksbselect.mapper.WtFksbDataRtrMapper;
import com.fksb.fksbselect.model.FksbDataMprRtrVO;
import com.fksb.fksbselect.model.FksbInfoZncbVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbuser.mapper.WtEquiMpZncdMapper;
import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVOExample;
import com.fksb.supportmothord.model.WtWaterpriceVO;
import com.fksb.utill.CacheUtil;
import com.fksb.worker.utill.RandUtil;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("fksbSelectService")
public class FksbSelectServiceImpl implements FksbSelectService {

      @Autowired
      private WtFksbDataRtrMapper wtFksbDataRtrMapper;

      @Autowired
      private WtEquiMpZncdMapper wtEquiMpZncdMapper;

      @Autowired
      private RabbitTemplate rabbitTemplate;

      @Autowired
      private HttpSession session;

    /*
    *
    * 查询水表上报信息
    * */
    @Override
    public FksbDataMprRtrVO selectMprFksbRtr(String equiid) throws  NullPointerException{
        FksbDataMprRtrVO fksbDataMprRtrVO=new FksbDataMprRtrVO();
        Object orgCd = session.getAttribute("orgCd");
        WtFksbDataRtrVO wtFksbDataRtrVO = wtFksbDataRtrMapper.selectMprFksbRtr(equiid,orgCd.toString());
        List<WtOrgBVO>   list= (List<WtOrgBVO>) CacheUtil.getInstance().getCacheData("listWtOrgcd");
        WtOrgBVO wtOrgBVO = list.stream().filter(e -> e.getOrgCd().equals(session.getAttribute("orgCd"))).findAny().get();

        fksbDataMprRtrVO.setOrgNm(wtOrgBVO.getOrgNm());
        fksbDataMprRtrVO.setMpcd(wtFksbDataRtrVO.getMpCd());
        if(wtFksbDataRtrVO.getDtTt()==null){
            fksbDataMprRtrVO.setEqStates(new Integer(-1).longValue());
           return fksbDataMprRtrVO;
        }
        fksbDataMprRtrVO.setTime(wtFksbDataRtrVO.getDtTt());
        fksbDataMprRtrVO.setAccumuWater(new BigDecimal(wtFksbDataRtrVO.getAccumuWater()).setScale(2, BigDecimal.ROUND_HALF_UP));
        fksbDataMprRtrVO.setTotalQty(wtFksbDataRtrVO.getTotalQty().setScale(2, BigDecimal.ROUND_HALF_UP));
        fksbDataMprRtrVO.setFmStates(wtFksbDataRtrVO.getValveS().longValue());
        fksbDataMprRtrVO.setSignals(wtFksbDataRtrVO.getSignals().longValue());
        fksbDataMprRtrVO.setV(wtFksbDataRtrVO.getV());
        LocalDate now = LocalDate.now();
        Instant instant = wtFksbDataRtrVO.getDtTt().toInstant();//(时间线上的一个瞬时点。)
        ZoneId zoneId = ZoneId.systemDefault();//{@code Europe/Paris}.(时区)
        LocalDate date = instant.atZone(zoneId).toLocalDate();
        fksbDataMprRtrVO.setEqStates(now.toEpochDay()- date.toEpochDay());
      return  fksbDataMprRtrVO;
    }

    /*
    * 查询水表信息
    *
    * */
    @Override
  public FksbInfoZncbVO selectFksbInfo(String mpCd, String equiid)throws  NullPointerException{
        WtEquiMpZncdVOExample wtEquiMpZncdVOExample = new WtEquiMpZncdVOExample();
        WtEquiMpZncdVOExample.Criteria criteria = wtEquiMpZncdVOExample.createCriteria();
        criteria.andMpCdEqualTo(mpCd);
        List<WtEquiMpZncdVO> wtEquiMpZncdVOS = wtEquiMpZncdMapper.selectByExample(wtEquiMpZncdVOExample);
        WtEquiMpZncdVO wtEquiMpZncdVO = wtEquiMpZncdVOS.get(0);
        FksbInfoZncbVO fksbInfoZncbVO = new FksbInfoZncbVO();

        fksbInfoZncbVO.setEquiId(equiid);
        fksbInfoZncbVO.setEquiLoc(wtEquiMpZncdVO.getHouseno());
        fksbInfoZncbVO.setHomeAre(wtEquiMpZncdVO.getArea());
        fksbInfoZncbVO.setHouseholdName(wtEquiMpZncdVO.getHousehold());
        fksbInfoZncbVO.setPhone(wtEquiMpZncdVO.getPhone());
        List<WtWaterpriceVO> listWaterType = (List<WtWaterpriceVO>) CacheUtil.getInstance().getCacheData("listWaterType");
        WtWaterpriceVO wtWaterpriceVO = listWaterType.stream().filter(e -> e.getId().shortValue()==wtEquiMpZncdVO.getWatertype().longValue()).findAny().get();
        fksbInfoZncbVO.setWaterType(wtWaterpriceVO.getWpName());
        return fksbInfoZncbVO;
    }



    /*
    * 修改水表信息
    * */
    @Override
   public  int  updateZncb(WtEquiMpZncdVO wtEquiMpZncdVO){
       rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
       rabbitTemplate.convertAndSend(RandUtil.FKSB_MAINTAIN_EXCGABGE, RandUtil.FKSB_ZNCB_key, wtEquiMpZncdVO);

       return 0;


   }
}
