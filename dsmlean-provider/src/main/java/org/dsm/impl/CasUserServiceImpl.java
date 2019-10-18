package org.dsm.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dsm.annotation.TxManagerFlag;
import org.dsm.dao.CasUser;
import org.dsm.dao.Student;
import org.dsm.mapper.CasUserMapper;
import org.dsm.service.CasUserService;
import org.dsm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
public class CasUserServiceImpl implements CasUserService {

    @Autowired
    private CasUserMapper casUserMapper;
    @Reference
    private StudentService studentService;

    @Override
    @TxManagerFlag
    @Transactional
    public int insertCasUser(CasUser casUser) throws InterruptedException {
        Student student = studentService.selectById(10L);
        return casUserMapper.insert(casUser);
    }

    @Override
    public int updateCasUser(CasUser casUser) {
        return casUserMapper.updateByPrimaryKeySelective(casUser);
    }

    @Override
    public void deleteCasUserById(Long id) {
        casUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public CasUser selectById(Long id) throws InterruptedException {
        Student student = studentService.selectById(10L);
        return casUserMapper.selectByPrimaryKey(id);
    }
}

