package org.dsm.service;

import org.dsm.dao.Student;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:56
 */
public interface StudentService {
    /**
     * 增加
     *
     * @param student
     * @return
     */
    public int insertStudent(Student student);

    /**
     * 更新
     *
     * @param student
     * @return
     */
    public int updateStudent(Student student);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public void deleteStudentById(Long id);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public Student selectById(Long id) throws InterruptedException;
}
