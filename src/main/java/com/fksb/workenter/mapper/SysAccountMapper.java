package com.fksb.workenter.mapper;

import com.fksb.workenter.model.SysAccountVO;
import com.fksb.workenter.model.SysAccountVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAccountMapper {
    long countByExample(SysAccountVOExample example);

    int deleteByExample(SysAccountVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAccountVO record);

    int insertSelective(SysAccountVO record);

    List<SysAccountVO> selectByExample(SysAccountVOExample example);

    SysAccountVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAccountVO record, @Param("example") SysAccountVOExample example);

    int updateByExample(@Param("record") SysAccountVO record, @Param("example") SysAccountVOExample example);

    int updateByPrimaryKeySelective(SysAccountVO record);

    int updateByPrimaryKey(SysAccountVO record);
}