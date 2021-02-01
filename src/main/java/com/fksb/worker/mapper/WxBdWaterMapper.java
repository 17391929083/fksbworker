package com.fksb.worker.mapper;

import com.fksb.worker.model.WxBdWaterVO;
import com.fksb.worker.model.WxBdWaterVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxBdWaterMapper {
    long countByExample(WxBdWaterVOExample example);

    int deleteByExample(WxBdWaterVOExample example);

    int insert(WxBdWaterVO record);

    int insertSelective(WxBdWaterVO record);

    List<WxBdWaterVO> selectByExample(WxBdWaterVOExample example);

    int updateByExampleSelective(@Param("record") WxBdWaterVO record, @Param("example") WxBdWaterVOExample example);

    int updateByExample(@Param("record") WxBdWaterVO record, @Param("example") WxBdWaterVOExample example);
}