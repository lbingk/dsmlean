package org.dsm.service;

import org.dsm.dao.CasUser;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
public interface CasUserService {
    /**
     * 增加
     *
     * @param casUser
     * @return
     */
    public int insertCasUser(CasUser casUser) throws InterruptedException;

    /**
     * 更新
     *
     * @param casUser
     * @return
     */
    public int updateCasUser(CasUser casUser);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public void deleteCasUserById(Long id);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public CasUser selectById(Long id) throws InterruptedException;
}

