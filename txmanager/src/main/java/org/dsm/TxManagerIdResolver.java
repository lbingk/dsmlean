package org.dsm;

import org.dsm.constant.TXConstant;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:37
 */
public class TxManagerIdResolver {

    public static ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<>();

    public static Map<String, String> get() {
        Map<String, String> map = threadLocal.get();
        if (CollectionUtils.isEmpty(map)) {
            map = new HashMap<>();
            map.put(TXConstant.WHOLE_TXMANAGER_ID, UUID.randomUUID().toString());
            map.put(TXConstant.SINGLE_TXMANAGER_ID, UUID.randomUUID().toString());
        }
        return map;
    }
}
