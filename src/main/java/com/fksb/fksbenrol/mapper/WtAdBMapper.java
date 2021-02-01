package com.fksb.fksbenrol.mapper;

import com.fksb.fksbenrol.model.WtAdBVO;
import com.fksb.fksbenrol.model.WtAdBVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtAdBMapper {
    long countByExample(WtAdBVOExample example);

    int deleteByExample(WtAdBVOExample example);

    int deleteByPrimaryKey(String adCd);

    int insert(WtAdBVO record);

    int insertSelective(WtAdBVO record);

    List<WtAdBVO> selectByExample(WtAdBVOExample example);

    WtAdBVO selectByPrimaryKey(String adCd);

    int updateByExampleSelective(@Param("record") WtAdBVO record, @Param("example") WtAdBVOExample example);

    int updateByExample(@Param("record") WtAdBVO record, @Param("example") WtAdBVOExample example);

    int updateByPrimaryKeySelective(WtAdBVO record);

    int updateByPrimaryKey(WtAdBVO record);

     /*查询区域*/
    WtAdBVO selectAdAre(String orgCd);



}