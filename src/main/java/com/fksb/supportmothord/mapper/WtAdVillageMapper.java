package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.WtAdVillageVO;
import com.fksb.supportmothord.model.WtAdVillageVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtAdVillageMapper {
    long countByExample(WtAdVillageVOExample example);

    int deleteByExample(WtAdVillageVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WtAdVillageVO record);

    int insertSelective(WtAdVillageVO record);

    List<WtAdVillageVO> selectByExample(WtAdVillageVOExample example);

    WtAdVillageVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WtAdVillageVO record, @Param("example") WtAdVillageVOExample example);

    int updateByExample(@Param("record") WtAdVillageVO record, @Param("example") WtAdVillageVOExample example);

    int updateByPrimaryKeySelective(WtAdVillageVO record);

    int updateByPrimaryKey(WtAdVillageVO record);
}