package org.dsm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dsm.aop.BaseMapper;
import org.dsm.dao.Student;

@Mapper
public interface StudentMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}