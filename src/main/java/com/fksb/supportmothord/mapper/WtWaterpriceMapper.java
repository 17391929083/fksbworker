package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.WtWaterpriceVO;
import com.fksb.supportmothord.model.WtWaterpriceVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtWaterpriceMapper {
    long countByExample(WtWaterpriceVOExample example);

    int deleteByExample(WtWaterpriceVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WtWaterpriceVO record);

    int insertSelective(WtWaterpriceVO record);

    List<WtWaterpriceVO> selectByExample(WtWaterpriceVOExample example);

    WtWaterpriceVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WtWaterpriceVO record, @Param("example") WtWaterpriceVOExample example);

    int updateByExample(@Param("record") WtWaterpriceVO record, @Param("example") WtWaterpriceVOExample example);

    int updateByPrimaryKeySelective(WtWaterpriceVO record);

    int updateByPrimaryKey(WtWaterpriceVO record);
}