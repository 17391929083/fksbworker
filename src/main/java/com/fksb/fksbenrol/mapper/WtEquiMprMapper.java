package com.fksb.fksbenrol.mapper;

import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtEquiMprMapper {
    long countByExample(WtEquiMprVOExample example);

    int deleteByExample(WtEquiMprVOExample example);

    int deleteByPrimaryKey(String mpCd);

    int insert(WtEquiMprVO record);

    int insertSelective(WtEquiMprVO record);

    List<WtEquiMprVO> selectByExample(WtEquiMprVOExample example);

    WtEquiMprVO selectByPrimaryKey(String mpCd);

    int updateByExampleSelective(@Param("record") WtEquiMprVO record, @Param("example") WtEquiMprVOExample example);

    int updateByExample(@Param("record") WtEquiMprVO record, @Param("example") WtEquiMprVOExample example);

    int updateByPrimaryKeySelective(WtEquiMprVO record);

    int updateByPrimaryKey(WtEquiMprVO record);


    String  selMaxMpcd(WtEquiMprVOExample example);
}