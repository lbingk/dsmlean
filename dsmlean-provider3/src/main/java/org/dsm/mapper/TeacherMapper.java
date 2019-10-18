package org.dsm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dsm.aop.BaseMapper;
import org.dsm.dao.Teacher;

@Mapper
public interface TeacherMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}