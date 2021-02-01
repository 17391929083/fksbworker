package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.WtEquiMpUserinfoVO;
import com.fksb.supportmothord.model.WtEquiMpUserinfoVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtEquiMpUserinfoMapper {
    long countByExample(WtEquiMpUserinfoVOExample example);

    int deleteByExample(WtEquiMpUserinfoVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WtEquiMpUserinfoVO record);

    int insertSelective(WtEquiMpUserinfoVO record);

    List<WtEquiMpUserinfoVO> selectByExample(WtEquiMpUserinfoVOExample example);

    WtEquiMpUserinfoVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WtEquiMpUserinfoVO record, @Param("example") WtEquiMpUserinfoVOExample example);

    int updateByExample(@Param("record") WtEquiMpUserinfoVO record, @Param("example") WtEquiMpUserinfoVOExample example);

    int updateByPrimaryKeySelective(WtEquiMpUserinfoVO record);

    int updateByPrimaryKey(WtEquiMpUserinfoVO record);
}