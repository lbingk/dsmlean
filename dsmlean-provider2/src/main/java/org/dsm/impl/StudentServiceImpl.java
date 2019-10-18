package org.dsm.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dsm.annotation.Service;
import org.dsm.dao.Student;
import org.dsm.mapper.StudentMapper;
import org.dsm.service.StudentService;
import org.dsm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:58
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Reference
    private TeacherService teacherService;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private PlatformTransactionManager txManager;

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public void deleteStudentById(Long id) {

    }

    @Override
//    @Transactional
    public Student selectById(Long id) throws InterruptedException {
        TransactionStatus status = txManager.getTransaction(new DefaultTransactionDefinition());

        try {
            teacherService.selectById(id);
            Student student = new Student();
            student.setName("xxoo123");
            student.setAge(123);
            studentMapper.insert(student);
//            System.out.println(1/0);

            studentMapper.selectByPrimaryKey(12L);

            Student student1 = new Student();
            student1.setName("xxoo234");
            student1.setAge(234);

            studentMapper.insert(student1);

            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
        }
        return null;
    }
}
