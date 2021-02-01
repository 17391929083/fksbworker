package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.FbTableVO;
import com.fksb.supportmothord.model.FbTableVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbTableMapper {
    long countByExample(FbTableVOExample example);

    int deleteByExample(FbTableVOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FbTableVO record);

    int insertSelective(FbTableVO record);

    List<FbTableVO> selectByExample(FbTableVOExample example);

    FbTableVO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FbTableVO record, @Param("example") FbTableVOExample example);

    int updateByExample(@Param("record") FbTableVO record, @Param("example") FbTableVOExample example);

    int updateByPrimaryKeySelective(FbTableVO record);

    int updateByPrimaryKey(FbTableVO record);
}