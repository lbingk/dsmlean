package org.dsm.filter.consumerfilter;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.rpc.*;
import org.dsm.TxManagerIdResolver;
import org.dsm.constant.TXConstant;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:28
 */
public class TxConsumerFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String attachment = RpcContext.getContext().getAttachment(TXConstant.WHOLE_TXMANAGER_ID);
        if (StringUtils.isBlank(attachment)) {
            attachment = TxManagerIdResolver.get().get(TXConstant.WHOLE_TXMANAGER_ID);
            RpcContext.getContext().set(TXConstant.WHOLE_TXMANAGER_ID, attachment);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("TxConsumerFilter " + attachment);
        return invoker.invoke(invocation);
    }
}
