package com.fksb.fksbuser.mapper;

import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtEquiMpZncdMapper {
    long countByExample(WtEquiMpZncdVOExample example);

    int deleteByExample(WtEquiMpZncdVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WtEquiMpZncdVO record);

    int insertSelective(WtEquiMpZncdVO record);

    List<WtEquiMpZncdVO> selectByExampleWithBLOBs(WtEquiMpZncdVOExample example);

    List<WtEquiMpZncdVO> selectByExample(WtEquiMpZncdVOExample example);

    WtEquiMpZncdVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WtEquiMpZncdVO record, @Param("example") WtEquiMpZncdVOExample example);

    int updateByExampleWithBLOBs(@Param("record") WtEquiMpZncdVO record, @Param("example") WtEquiMpZncdVOExample example);

    int updateByExample(@Param("record") WtEquiMpZncdVO record, @Param("example") WtEquiMpZncdVOExample example);

    int updateByPrimaryKeySelective(WtEquiMpZncdVO record);

    int updateByPrimaryKeyWithBLOBs(WtEquiMpZncdVO record);

    int updateByPrimaryKey(WtEquiMpZncdVO record);
}