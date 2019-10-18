package org.dsm.aop;

import com.alibaba.dubbo.rpc.RpcContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.dsm.TxManagerIdResolver;
import org.dsm.constant.TXConstant;
import org.springframework.stereotype.Component;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 19:38
 */

@Component
@Aspect
public class TxManagerFlagAop {

    @Pointcut("@annotation(org.dsm.annotation.TxManagerFlag)")
    public void txManagerFlag() {
    }

    /**
     * 前置增强：在连接点之前执行的增强
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("txManagerFlag()")
    public void doBefore(JoinPoint joinPoint) {
        // 将全局事务Id存储到RpcContext
        String s = TxManagerIdResolver.get().get(TXConstant.WHOLE_TXMANAGER_ID);
        RpcContext.getContext().setAttachment(TXConstant.WHOLE_TXMANAGER_ID, s);
        System.out.println(Thread.currentThread().getName());
        System.out.println("aop  " + s);
    }
}
