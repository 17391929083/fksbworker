package com.fksb.workenter.mapper;

import com.fksb.workenter.model.SysUserVO;
import com.fksb.workenter.model.SysUserVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserVOMapper {
    long countByExample(SysUserVOExample example);

    int deleteByExample(SysUserVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserVO record);

    int insertSelective(SysUserVO record);

    List<SysUserVO> selectByExampleWithBLOBs(SysUserVOExample example);

    List<SysUserVO> selectByExample(SysUserVOExample example);

    SysUserVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserVO record, @Param("example") SysUserVOExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUserVO record, @Param("example") SysUserVOExample example);

    int updateByExample(@Param("record") SysUserVO record, @Param("example") SysUserVOExample example);

    int updateByPrimaryKeySelective(SysUserVO record);

    int updateByPrimaryKeyWithBLOBs(SysUserVO record);

    int updateByPrimaryKey(SysUserVO record);
}