package org.dsm.impl;

import org.dsm.annotation.Service;
import org.dsm.dao.CasUser;
import org.dsm.mapper.CasUserMapper;
import org.dsm.service.CasUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@Service
public class CasUserServiceImpl implements CasUserService {

    @Autowired
    private CasUserMapper casUserMapper;

    @Override
    public int insertCasUser(CasUser casUser) {
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
    public CasUser selectById(Long id) {
        return casUserMapper.selectByPrimaryKey(id);
    }
}

