package com.fksb.fksbuser.service;

import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.mapper.WtOrgBMapper;
import com.fksb.fksbenrol.model.FksbInserModel;
import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import com.fksb.fksbenrol.model.WtOrgBVO;
import com.fksb.fksbenrol.service.FksbEnrolService;
import com.fksb.fksbuser.mapper.WtEquiMpZncdMapper;
import com.fksb.fksbuser.model.FksbUserVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVOExample;
import com.fksb.supportmothord.mapper.WtAdVillageMapper;
import com.fksb.supportmothord.mapper.WtEquiMpUserinfoMapper;
import com.fksb.supportmothord.mapper.WtWaterpriceMapper;
import com.fksb.supportmothord.mapper.ZtapwaterPaymentByUserMapper;
import com.fksb.supportmothord.model.*;
import com.fksb.utill.CacheUtil;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("fksbUserService")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class FksbUserServiceImpl  implements FksbUserService {

     @Autowired
    private WtWaterpriceMapper wtWaterpriceMapper;
    @Autowired
    private WtEquiMpZncdMapper wtEquiMpZncdMapper;

    @Autowired
    private WtEquiMprMapper wtEquiMprMapper;

    @Autowired
    private WtAdVillageMapper wtAdVillageMapper;

    @Autowired
    private WtEquiMpUserinfoMapper wtEquiMpUserinfoMapper;

    @Autowired
    private WtOrgBMapper wtOrgBMapper;

    @Autowired
    private ZtapwaterPaymentByUserMapper ztapwaterPaymentByUserMapper;

    @Autowired
    private   FksbEnrolService     ksbEnrolService;


    @Autowired
    private HttpSession session;

    @Autowired
    private Map<String,Object> orgcdMaxMpcd;

 

    
    @Override
    public List<WtWaterpriceVO> waterType() {
        List<WtWaterpriceVO>  listWaterType= (List<WtWaterpriceVO>) CacheUtil.getInstance().getCacheData("listWaterType");
        if(listWaterType!=null){

            return listWaterType;
        }else{
        WtWaterpriceVOExample wtWaterpriceVOExample = new WtWaterpriceVOExample();
        List<WtWaterpriceVO> wtWaterpriceVOS = wtWaterpriceMapper.selectByExample(wtWaterpriceVOExample);
        CacheUtil.getInstance().addCacheData("listWaterType",wtWaterpriceVOS);   
            return wtWaterpriceVOS;
        }
    }

    @Override

    public int inserMprZncb(FksbUserVO fksbUserVO) {
        int returnsign=0;

        //获取动态代理
        FksbUserServiceImpl  fksbUserServiceImpl = (FksbUserServiceImpl) AopContext.currentProxy();
        //得到最新的mapcd
        FksbInserModel fksbInserModel = newMpcd();

//        //查询设备是否存在是否存在
//        if(ksbEnrolService.isNullEquiid(fksbInserModel)){
//             return -1;//设备存在
//        }

        //通过事务调用存储
        boolean boole = fksbUserServiceImpl.inserData(fksbInserModel, fksbUserVO);
        if(!boole){
            return 1;//注册失败
        }

        return returnsign;
    }
    @Transactional
    public boolean inserData(FksbInserModel fksbInserModel,FksbUserVO fksbUserVO){


        WtEquiMprVO wtEquiMprVO=getMprData(fksbInserModel,fksbUserVO);
        //存储mpr
        int i = wtEquiMprMapper.insertSelective(wtEquiMprVO);
        //存储zncb
        WtEquiMpZncdVO wtEquiMpZncdVO=getZncbData(fksbInserModel,fksbUserVO);

        int j = wtEquiMpZncdMapper.insertSelective(wtEquiMpZncdVO);
        //构建数据userinfo表中
        WtEquiMpUserinfoVO wtEquiMpUserinfoVO = gerUserInfoData(wtEquiMpZncdVO);
        //存储userinfo数据
        int z = wtEquiMpUserinfoMapper.insertSelective(wtEquiMpUserinfoVO);
        ZtapwaterPaymentByUserVO byUserData=null;
        try {
            byUserData = getByUserData(wtEquiMpUserinfoVO);
       }catch (Exception ex){
              ex.printStackTrace();
       }

        //整理byUser表数据
        int k = ztapwaterPaymentByUserMapper.insertSelective(byUserData);


        if(i+j+k+z==4){return true; }else{ return false;}
    }

    private  FksbInserModel  newMpcd(){
        FksbInserModel fksbInserModel= (FksbInserModel) session.getAttribute("fksbInserModel");
       Object  orgCd=session.getAttribute("orgCd");
       if(orgcdMaxMpcd.get(fksbInserModel.getVilliid())==null){
            /*查询最大测点*/
            WtEquiMprVOExample wtEquiMprVOExample=new WtEquiMprVOExample();
            WtEquiMprVOExample.Criteria criteria=wtEquiMprVOExample.createCriteria();
            criteria.andOrgCdEqualTo(orgCd.toString());
            WtAdVillageVO wtAdVillageVO = wtAdVillageMapper.selectByPrimaryKey(fksbInserModel.getVilliid());
            String maxMpcd = wtEquiMprMapper.selInsertMaxMpcd(wtAdVillageVO.getCode());

            if(StringUtils.isEmpty(maxMpcd)){
                /*获取村code*/
                // wtAdVillageVO = wtAdVillageMapper.selectByPrimaryKey(fksbInserModel.getVilliid());
                String  newMpcd=wtAdVillageVO.getCode()+"00001";
                orgcdMaxMpcd.put(fksbInserModel.getVilliid()+"",newMpcd);
                fksbInserModel.setMpCd(newMpcd);
                maxMpcd=newMpcd;
            }
            //自动加1 返回去
            Long  newMpcd=Long.valueOf(maxMpcd)+1;
            fksbInserModel.setMpCd(newMpcd.toString());
            orgcdMaxMpcd.put(fksbInserModel.getVilliid()+"",newMpcd);
        }else{
            fksbInserModel.setMpCd(Long.valueOf(orgcdMaxMpcd.get("newMpcd"+orgCd).toString())+1+"");
            orgcdMaxMpcd.put(fksbInserModel.getVilliid()+"",fksbInserModel.getMpCd());
      }
       return  fksbInserModel;


        
    }




    private  WtEquiMprVO getMprData(FksbInserModel fksbInserModel,FksbUserVO fksbUserVO){
        WtEquiMprVO wtEquiMprVO=new WtEquiMprVO();

        wtEquiMprVO.setMpCd(fksbInserModel.getMpCd());
        wtEquiMprVO.setMpNm(fksbUserVO.getUserName());
        wtEquiMprVO.setMpLoc(fksbUserVO.getUserLocal());
        wtEquiMprVO.setMpDate(new Date());
        wtEquiMprVO.setMpLong(new BigDecimal(0));
        wtEquiMprVO.setMpLat(new BigDecimal(0));
        wtEquiMprVO.setIsFather(false);
        wtEquiMprVO.setPrCd(fksbInserModel.getAdCd().substring(0,2)+"0000");
        wtEquiMprVO.setCiCd(fksbInserModel.getAdCd().substring(0,4)+"00");
        wtEquiMprVO.setAdCd(fksbInserModel.getAdCd());
        wtEquiMprVO.setOrgCd(fksbInserModel.getOrgCd());
        wtEquiMprVO.setEquiCd(fksbInserModel.getEquicd());
        wtEquiMprVO.setEuqiId(new Long(13));
        wtEquiMprVO.setMpUser(fksbInserModel.getMpUser());
        wtEquiMprVO.setEquiPic(fksbInserModel.getEquiPic());
        wtEquiMprVO.setStates(0);
        wtEquiMprVO.setEquiStates(0);
        /*口径和通讯方式*/  //后续添加

       return wtEquiMprVO;
    }

    private  WtEquiMpZncdVO getZncbData(FksbInserModel fksbInserModel,FksbUserVO fksbUserVO){

        // zncb
        WtEquiMpZncdVO wtEquiMpZncdVO=new WtEquiMpZncdVO();
        wtEquiMpZncdVO.setMpCd(fksbInserModel.getMpCd());
        wtEquiMpZncdVO.setTownid(new Long(fksbInserModel.getTownid()));
        wtEquiMpZncdVO.setVillageid(new Long(fksbInserModel.getVilliid()));
        wtEquiMpZncdVO.setHouseno(fksbUserVO.getUserLocal());
        wtEquiMpZncdVO.setHousehold(fksbUserVO.getUserName());
        wtEquiMpZncdVO.setPhone(fksbUserVO.getUserPhone());
        wtEquiMpZncdVO.setWatermetertype(new Short(1+""));
        wtEquiMpZncdVO.setWatertype(new Short(fksbUserVO.getWaterType()+""));
        wtEquiMpZncdVO.setArea(new BigDecimal(fksbUserVO.getUserAre()+""));
        wtEquiMpZncdVO.setUsestate(new Short(fksbUserVO.getUserType()+""));
        wtEquiMpZncdVO.setStatus(0);

        return wtEquiMpZncdVO;
    }





   

    private WtEquiMpUserinfoVO gerUserInfoData(WtEquiMpZncdVO wtEquiMpZncdVO){

        WtEquiMpUserinfoVO wtEquiMpUserinfoVO = new WtEquiMpUserinfoVO();
        wtEquiMpUserinfoVO.setUsername(wtEquiMpZncdVO.getHousehold());
        wtEquiMpUserinfoVO.setPhone(wtEquiMpZncdVO.getPhone());
        wtEquiMpUserinfoVO.setStatus(wtEquiMpZncdVO.getStatus());
        wtEquiMpUserinfoVO.setOrgcd(session.getAttribute("orgCd").toString());
        wtEquiMpUserinfoVO.setAddtime(new Date());
        wtEquiMpUserinfoVO.setTs(new Date());
        return wtEquiMpUserinfoVO;
    }

private ZtapwaterPaymentByUserVO getByUserData(WtEquiMpUserinfoVO wtEquiMpUserinfoVO){
        /*查询安表 或者按照户缴纳*/
    WtOrgBVO wtOrgBVO = wtOrgBMapper.selectByPrimaryKey(wtEquiMpUserinfoVO.getOrgcd());


    ZtapwaterPaymentByUserVO ztapwaterPaymentByUserVO = new ZtapwaterPaymentByUserVO();
    ztapwaterPaymentByUserVO.setUserid(wtEquiMpUserinfoVO.getId());
    ztapwaterPaymentByUserVO.setPhone(wtEquiMpUserinfoVO.getPhone());
    ztapwaterPaymentByUserVO.setStatus(wtOrgBVO.getPaymentState());

    return  ztapwaterPaymentByUserVO;


}



}
