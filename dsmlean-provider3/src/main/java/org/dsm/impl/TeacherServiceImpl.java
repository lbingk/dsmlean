package org.dsm.impl;

import org.dsm.annotation.Service;
import org.dsm.dao.Teacher;
import org.dsm.mapper.TeacherMapper;
import org.dsm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-15 17:45
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int insertTeacher(Teacher teacher) {
        return 0;
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return 0;
    }

    @Override
    public void deleteTeacherById(Long id) {

    }

    @Override
    public Teacher selectById(Long id) {
        teacherMapper.selectByPrimaryKey(12);
        return null;
    }
}
