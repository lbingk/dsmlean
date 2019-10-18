package org.dsm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dsm.annotation.TxManagerFlag;
import org.dsm.dao.CasUser;
import org.dsm.service.CasUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@RestController
public class CasUserController {

    @Reference
    private CasUserService casUserService;

    @RequestMapping("getCasUserById")
    @TxManagerFlag
    public CasUser getCasUserById() throws InterruptedException {
        return casUserService.selectById(1L);
    }
}

