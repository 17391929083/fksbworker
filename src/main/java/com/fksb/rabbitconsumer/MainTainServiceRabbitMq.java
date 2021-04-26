package com.fksb.rabbitconsumer;

import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import com.fksb.fksbmaintain.mapper.WtEquiMpRepairMapper;
import com.fksb.fksbmaintain.model.FksbMainTainVO;
import com.fksb.fksbmaintain.model.WtEquiMpRepairVO;
import com.fksb.fksbmaintain.model.WtEquiMpRepairVOExample;
import com.fksb.fksbselect.mapper.WtFksbDataRtrMapper;
import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVOExample;
import com.fksb.supportmothord.mapper.FbTableMapper;
import com.fksb.supportmothord.model.FbTableVO;
import com.fksb.supportmothord.model.FbTableVOExample;
import com.fksb.utill.CacheUtil;
import com.fksb.worker.model.WxBdWaterVO;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@RestController
public class MainTainServiceRabbitMq implements ChannelAwareMessageListener {

    @Autowired
    private WtEquiMprMapper wtEquiMprMapper;

    @Autowired
    private FbTableMapper fbTableMapper;

    @Autowired
    private WtFksbDataRtrMapper wtFksbDataRtrMapper;

    @Autowired
    private WtEquiMpRepairMapper wtEquiMpRepairMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        //获取消息的id 用于签收
        long deliveryTag = message.getMessageProperties().getDeliveryTag();

        FksbMainTainVO  fksbMainTainVO = JSONObject.parseObject(message.getBody(), FksbMainTainVO.class);

        try {


        //更换设备编号
        int changeequiid = this.changeequiid(fksbMainTainVO);
        //更改用水量
         int i = this.changeWater(fksbMainTainVO);
         //增加换表记录
          int changeRecodeid = this.hangeFksbRecords(fksbMainTainVO);



            channel.basicAck(deliveryTag,false);
        }catch (Exception ex){
            ex.printStackTrace();

        }


    }

    private int changeequiid(FksbMainTainVO  fksbMainTainVO){
        //更换设备编号
        WtEquiMprVO wtEquiMprVO=new WtEquiMprVO();
        wtEquiMprVO.setEquiCd(fksbMainTainVO.getNewEquiid());
        wtEquiMprVO.setPicline(fksbMainTainVO.getPciLine());
        WtEquiMprVOExample wtEquiMprVOExample = new WtEquiMprVOExample();
        WtEquiMprVOExample.Criteria criteria = wtEquiMprVOExample.createCriteria();
        criteria.andEquiCdEqualTo(fksbMainTainVO.getOldEquiid());
        criteria.andOrgCdEqualTo(fksbMainTainVO.getOrgcd());
        int changsign = wtEquiMprMapper.updateByExampleSelective(wtEquiMprVO, wtEquiMprVOExample);
        return changsign;

    }


    private int changeWater(FksbMainTainVO  fksbMainTainVO){
       //内存分表中查询数据
        List<FbTableVO> listFbTable = (List<FbTableVO>) CacheUtil.getInstance().getCacheData("listFbTable");
        FbTableVO fbTableVO=new FbTableVO();
        boolean bl = listFbTable.stream().anyMatch(e -> e.getOrgcd().equals(fksbMainTainVO.getOrgcd()) && e.getHistorysign() == 0);//.findAny().get();
        if(bl){
            fbTableVO = listFbTable.stream().filter(e -> e.getOrgcd().equals(fksbMainTainVO.getOrgcd()) && e.getHistorysign() == 0).findAny().get();
        }else{
            //数据库查询 如果存在重新放入缓存
            FbTableVOExample fbTableVOExample = new FbTableVOExample();
            FbTableVOExample.Criteria criteria = fbTableVOExample.createCriteria();
            criteria.andOrgcdEqualTo(fksbMainTainVO.getOrgcd());
            criteria.andHistorysignEqualTo((byte) 0);
            List<FbTableVO> fbTableVOS = fbTableMapper.selectByExample(fbTableVOExample);
            if(fbTableVOS.size()>0){
                fbTableVO=fbTableVOS.get(0);
                listFbTable.add(fbTableVO);
                CacheUtil.getInstance().addCacheData("listFbTable",listFbTable);
                bl=true;

            }


        }

        //修改水量
        WtFksbDataRtrVO  wtFksbDataRtrVO=new WtFksbDataRtrVO();
        WtFksbDataRtrVOExample wtFksbDataRtrVOExample = new WtFksbDataRtrVOExample();
        WtFksbDataRtrVOExample.Criteria criteria1 = wtFksbDataRtrVOExample.createCriteria();
        criteria1.andMpCdEqualTo(fksbMainTainVO.getMpcd());
        wtFksbDataRtrVO.setAccumuWater(fksbMainTainVO.getWaterNum().doubleValue());
        int fbupdate=0;
        if(bl){
         fbupdate = wtFksbDataRtrMapper.updateWaterNumber(wtFksbDataRtrVO, fbTableVO, wtFksbDataRtrVOExample);
        }
        int rtrupdate = wtFksbDataRtrMapper.updateByExampleSelective(wtFksbDataRtrVO, wtFksbDataRtrVOExample);
       return fbupdate+rtrupdate;

    }
    //增加换表记录
 public int  hangeFksbRecords(FksbMainTainVO  fksbMainTainVO){
          //组装数据
     //查询设备mpr表中的数据
     WtEquiMprVO wtEquiMprVO = wtEquiMprMapper.selectByPrimaryKey(fksbMainTainVO.getMpcd());
     //得到传递过来的信息数据
     WxBdWaterVO wxBdWaterVOS = fksbMainTainVO.getWxBdWaterVOS();
     WtEquiMpRepairVO wtEquiMpRepairVO = new WtEquiMpRepairVO();
     wtEquiMpRepairVO.setMpCd(wtEquiMprVO.getMpCd());
     wtEquiMpRepairVO.setMpNm(wtEquiMprVO.getMpNm());
     wtEquiMpRepairVO.setCreatetime(new Date());
     wtEquiMpRepairVO.setEuqiId(new Long(13));
     wtEquiMpRepairVO.setAdCd(wtEquiMprVO.getAdCd());
     wtEquiMpRepairVO.setOrgCd(wtEquiMprVO.getOrgCd());
     wtEquiMpRepairVO.setRepType((short) 1);
     wtEquiMpRepairVO.setEquiCdn(fksbMainTainVO.getNewEquiid());
     wtEquiMpRepairVO.setEquiCdo(fksbMainTainVO.getOldEquiid());
     wtEquiMpRepairVO.setDeletestatus(new byte[0]);
     wtEquiMpRepairVO.setIsRegister(1);
     wtEquiMpRepairVO.setRepPer(wxBdWaterVOS.getWorkername());
     wtEquiMpRepairVO.setModifytime(new Date());
     wtEquiMpRepairVO.setRepDesc("云控水表设备更换:  新设备编号"+fksbMainTainVO.getNewEquiid()+" 旧设备编号"+fksbMainTainVO.getOldEquiid()+" 维护人手机号"+wxBdWaterVOS.getPhone());
     int i = wtEquiMpRepairMapper.insertSelective(wtEquiMpRepairVO);

     redisTemplate.opsForHash().delete("equuidTompcd",fksbMainTainVO.getOldEquiid());
     redisTemplate.opsForHash().put("equuidTompcd",fksbMainTainVO.getOldEquiid(),wtEquiMprVO.getMpCd());
     return i;
 }







}
