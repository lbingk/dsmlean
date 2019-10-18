package org.dsm.service;

import org.dsm.dao.Teacher;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:56
 */
public interface TeacherService {
    /**
     * 增加
     *
     * @param teacher
     * @return
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 更新
     *
     * @param teacher
     * @return
     */
    public int updateTeacher(Teacher teacher);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public void deleteTeacherById(Long id);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public Teacher selectById(Long id);
}
