package com.river.flyweight;

import java.util.HashMap;

/**
 * @Author River
 * @Date 2022 11 10 17 23
 **/
public class SharedStringFactory {
    /**
     *  定义一个HashMap存储享元对象，实现享元池
     *  key: 内容
     *  value: 共享字符串对象
     */
    private HashMap<String, SharedString> pool;

    /**
     * 无参构造方法
     */
    public SharedStringFactory() {
        pool = new HashMap<>();
    }

    /**
     * 获取共享对象
     * @param content 内容
     * @return 共享对象
     */
    public SharedString getSharedString(String content) {
        if (pool.containsKey(content)) {
            // 如果享元池中已经有这个对象，则直接从享元池中获取
            return pool.get(content);
        } else {
            // 如果享元池中没有这个对象，则创建一个新的共享对象，并放入享元池中
            SharedString sharedString = new SharedString(content);
            pool.put(content, sharedString);
            return sharedString;
        }
    }


}
