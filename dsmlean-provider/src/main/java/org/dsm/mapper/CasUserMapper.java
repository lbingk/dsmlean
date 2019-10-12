package org.dsm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dsm.dao.CasUser;

@Mapper
public interface CasUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CasUser record);

    int insertSelective(CasUser record);

    CasUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CasUser record);

    int updateByPrimaryKey(CasUser record);
}