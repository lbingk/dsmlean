package org.dsm.aop;

import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.dsm.TransactionSynchronizationImpl;
import org.dsm.TxManagerContext;
import org.dsm.TxManagerIdResolver;
import org.dsm.util.SqlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-16 12:52
 */
@Aspect
@Component
public class MybatisMapperSqlAop {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private TransactionSynchronizationImpl TransactionSynchronizationImpl;

    @Pointcut("execution(* org.dsm.aop.BaseMapper+.*(..))")
    private void pc() {

    }

    @Before("MybatisMapperSqlAop.pc()")
    public void before() {
    }

    @AfterReturning("MybatisMapperSqlAop.pc()")
    public void afterReturning() {
    }

    @Around("MybatisMapperSqlAop.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //2.调用目标方法
        Object proceed = pjp.proceed();
        System.out.println(Thread.currentThread().getName());
        //判断是否开启的分布式事务
        if (!CollectionUtils.isEmpty(TxManagerIdResolver.get())) {
            //3.获取SQL
            TxManagerContext.set(SqlUtils.getMybatisSql(pjp, sqlSessionFactory));
            //4.注册事务监听器
            TransactionSynchronizationManager.registerSynchronization(TransactionSynchronizationImpl);
        }

        return proceed;
    }

    @AfterThrowing("MybatisMapperSqlAop.pc()")
    public void afterException() {
    }

    @After("MybatisMapperSqlAop.pc()")
    public void after() {
    }

}
