package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.WtAdTownVO;
import com.fksb.supportmothord.model.WtAdTownVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtAdTownMapper {
    long countByExample(WtAdTownVOExample example);

    int deleteByExample(WtAdTownVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtAdTownVO record);

    int insertSelective(WtAdTownVO record);

    List<WtAdTownVO> selectByExample(WtAdTownVOExample example);

    WtAdTownVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtAdTownVO record, @Param("example") WtAdTownVOExample example);

    int updateByExample(@Param("record") WtAdTownVO record, @Param("example") WtAdTownVOExample example);

    int updateByPrimaryKeySelective(WtAdTownVO record);

    int updateByPrimaryKey(WtAdTownVO record);
}