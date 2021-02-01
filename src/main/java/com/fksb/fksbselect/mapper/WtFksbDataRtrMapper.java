package com.fksb.fksbselect.mapper;

import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVOExample;
import java.util.List;

import com.fksb.supportmothord.model.FbTableVO;
import org.apache.ibatis.annotations.Param;

public interface WtFksbDataRtrMapper {
    long countByExample(WtFksbDataRtrVOExample example);

    int deleteByExample(WtFksbDataRtrVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WtFksbDataRtrVO record);

    int insertSelective(WtFksbDataRtrVO record);

    List<WtFksbDataRtrVO> selectByExample(WtFksbDataRtrVOExample example);

    WtFksbDataRtrVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WtFksbDataRtrVO record, @Param("example") WtFksbDataRtrVOExample example);

    int updateByExample(@Param("record") WtFksbDataRtrVO record, @Param("example") WtFksbDataRtrVOExample example);

    int updateByPrimaryKeySelective(WtFksbDataRtrVO record);

    int updateByPrimaryKey(WtFksbDataRtrVO record);


    WtFksbDataRtrVO selectMprFksbRtr(@Param("equiid")String  equiid,@Param("orgCd")String orgCd);

    int updateWaterNumber(@Param("record") WtFksbDataRtrVO record, @Param("table") FbTableVO table, @Param("example") WtFksbDataRtrVOExample example);
}