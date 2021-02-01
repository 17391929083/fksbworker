package com.fksb.fksbenrol.mapper;

import com.fksb.fksbenrol.model.WtOrgBVO;
import com.fksb.fksbenrol.model.WtOrgBVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtOrgBMapper {
    long countByExample(WtOrgBVOExample example);

    int deleteByExample(WtOrgBVOExample example);

    int deleteByPrimaryKey(Long orgId);

    int insert(WtOrgBVO record);

    int insertSelective(WtOrgBVO record);

    List<WtOrgBVO> selectByExample(WtOrgBVOExample example);

    WtOrgBVO selectByPrimaryKey(String orgCd);

    int updateByExampleSelective(@Param("record") WtOrgBVO record, @Param("example") WtOrgBVOExample example);

    int updateByExample(@Param("record") WtOrgBVO record, @Param("example") WtOrgBVOExample example);

    int updateByPrimaryKeySelective(WtOrgBVO record);

    int updateByPrimaryKey(WtOrgBVO record);
}