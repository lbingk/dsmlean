package org.dsm.filter.providerfilter;

import com.alibaba.dubbo.rpc.*;
import org.dsm.constant.TXConstant;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:28
 */
public class TxProviderFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String attachment = RpcContext.getContext().getAttachment(TXConstant.WHOLE_TXMANAGER_ID);
        System.out.println(Thread.currentThread().getName());
        System.out.println("TxProviderFilter " + attachment);
        return invoker.invoke(invocation);
    }
}
