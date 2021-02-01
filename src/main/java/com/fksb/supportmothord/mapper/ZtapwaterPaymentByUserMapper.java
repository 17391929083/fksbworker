package com.fksb.supportmothord.mapper;

import com.fksb.supportmothord.model.ZtapwaterPaymentByUserVO;
import com.fksb.supportmothord.model.ZtapwaterPaymentByUserVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZtapwaterPaymentByUserMapper {
    long countByExample(ZtapwaterPaymentByUserVOExample example);

    int deleteByExample(ZtapwaterPaymentByUserVOExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(ZtapwaterPaymentByUserVO record);

    int insertSelective(ZtapwaterPaymentByUserVO record);

    List<ZtapwaterPaymentByUserVO> selectByExample(ZtapwaterPaymentByUserVOExample example);

    ZtapwaterPaymentByUserVO selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") ZtapwaterPaymentByUserVO record, @Param("example") ZtapwaterPaymentByUserVOExample example);

    int updateByExample(@Param("record") ZtapwaterPaymentByUserVO record, @Param("example") ZtapwaterPaymentByUserVOExample example);

    int updateByPrimaryKeySelective(ZtapwaterPaymentByUserVO record);

    int updateByPrimaryKey(ZtapwaterPaymentByUserVO record);
}