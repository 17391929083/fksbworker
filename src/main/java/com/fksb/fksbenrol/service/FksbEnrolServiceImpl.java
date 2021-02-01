package com.fksb.fksbenrol.service;

import com.fksb.fksbenrol.mapper.WtAdBMapper;

import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.mapper.WtOrgBMapper;
import com.fksb.fksbenrol.model.*;

import com.fksb.supportmothord.mapper.WtAdTownMapper;
import com.fksb.supportmothord.mapper.WtAdVillageMapper;
import com.fksb.supportmothord.model.WtAdTownVO;
import com.fksb.supportmothord.model.WtAdTownVOExample;
import com.fksb.supportmothord.model.WtAdVillageVO;
import com.fksb.supportmothord.model.WtAdVillageVOExample;
import com.fksb.utill.CacheUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("fksbEnrolService")
public class FksbEnrolServiceImpl  implements FksbEnrolService {


  
    @Autowired
    private WtAdBMapper wtAdBMapper;

    @Autowired
    private WtOrgBMapper wtOrgBMapper;

    @Autowired
    private WtAdTownMapper wtAdTownMapper;

    @Autowired
    private WtAdVillageMapper wtAdVillageMapper;

    @Autowired
    private WtEquiMprMapper wtEquiMprMapper;



    @Override
    public FksbenrolVO selectAdAre(String orgCd) {
        FksbenrolVO fksbenrolVO=new FksbenrolVO();
            try {
                //查询省市县
                WtAdBVO wtAd = wtAdBMapper.selectAdAre(orgCd);
                //所属机构
                WtOrgBVO wtOrgBVO = new WtOrgBVO();
                List<WtOrgBVO>   list= (List<WtOrgBVO>) CacheUtil.getInstance().getCacheData("listWtOrgcd");
                wtOrgBVO = list.stream().filter(e -> e.getOrgCd().equals(orgCd)).findAny().get();
                if(wtOrgBVO==null){
                    wtOrgBVO=this.selectOrgCDNm(orgCd);
                    list.add(wtOrgBVO);
                    CacheUtil.getInstance().addCacheData("listWtOrgcd",list);
                }
                //查询乡镇
                WtAdTownVOExample wtAdTownVOExample=new WtAdTownVOExample();
                WtAdTownVOExample.Criteria criteria=wtAdTownVOExample.createCriteria();
                criteria.andAdCdEqualTo(wtAd.getAdCd());
                List<WtAdTownVO> wtAdTownVOS = wtAdTownMapper.selectByExample(wtAdTownVOExample);
                fksbenrolVO.setAdCd(wtAd.getAdCd());
                fksbenrolVO.setAdNm(wtAd.getAdNm());
                fksbenrolVO.setOrgNm(wtOrgBVO.getOrgNm());
                fksbenrolVO.setList(wtAdTownVOS);

            }catch (Exception e){
                e.printStackTrace();
            }

        return  fksbenrolVO;

    }

    @Override
    public WtOrgBVO selectOrgCDNm(String orgCd) {

        return wtOrgBMapper.selectByPrimaryKey(orgCd);
    }

    @Override
    public  List<WtAdVillageVO> selectVillageNm(String townId) {
        WtAdVillageVOExample wtAdVillageVOExample=new  WtAdVillageVOExample();
        WtAdVillageVOExample.Criteria criteria =  wtAdVillageVOExample.createCriteria();
        criteria.andTownidEqualTo(townId);
        List<WtAdVillageVO> wtAdVillageVOS = wtAdVillageMapper.selectByExample(wtAdVillageVOExample);
        return wtAdVillageVOS;
    }


     @Override
    public   boolean  isNullEquiid(FksbInserModel fksbInserModel){

        WtEquiMprVOExample wtEquiMprVOExample=new WtEquiMprVOExample();
        WtEquiMprVOExample.Criteria criteria=wtEquiMprVOExample.createCriteria();
        criteria.andEquiCdEqualTo(fksbInserModel.getEquicd());
        long countEquiid = wtEquiMprMapper.countByExample(wtEquiMprVOExample);
        if(countEquiid>0){
            return true;
        }else{
            return false;
        }

    }


}
