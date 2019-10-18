package org.dsm;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-18 12:47
 */
public class TxManagerContext {
    public static ThreadLocal<TxManagerContext> threadLocal = new ThreadLocal<>();
    private List<String> executeSql = new ArrayList<>();

    public static void set(String sql) {
        TxManagerContext txManagerContext = threadLocal.get();
        if (txManagerContext == null) {
            txManagerContext = new TxManagerContext();
            threadLocal.set(txManagerContext);
        }
        txManagerContext.getExecuteSql().add(sql);
        System.out.println("TxManagerContext " + sql);
    }

    private List<String> getExecuteSql() {
        return this.executeSql;
    }

    @Override
    public String toString() {
        return executeSql.toString();
    }
}
