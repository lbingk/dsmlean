package org.dsm;

import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-18 14:03
 */
@Component
public class TransactionSynchronizationImpl implements TransactionSynchronization {

    @Override
    public void suspend() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void beforeCommit(boolean b) {
        System.out.println("beforeCommit " + TxManagerContext.threadLocal.get());
    }

    @Override
    public void beforeCompletion() {
        System.out.println("beforeCompletion " + TxManagerContext.threadLocal.get());
    }

    @Override
    public void afterCommit() {
        System.out.println("afterCommit " + TxManagerContext.threadLocal.get());
    }

    @Override
    public void afterCompletion(int i) {
        System.out.println("afterCompletion  " + TxManagerContext.threadLocal.get());
    }
}
