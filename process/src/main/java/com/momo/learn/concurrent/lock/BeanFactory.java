package com.momo.learn.concurrent.lock;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 12:58
 */
public class BeanFactory {

    private static ConcurrentHashMap beanMap = new ConcurrentHashMap(100);

    /**
     * 默认单例模式bean
     * @param clz
     * @param <T>
     * @return
     */
    public static  <T> T getBean(Class<T> clz){
        return getBean(clz, true);
    }

    public static  <T> T getBean(Class<T> clz, boolean singleton){
        try {
            if (!singleton) {
                return clz.newInstance();
            }
            if (beanMap.get(clz)==null) {
                T t = clz.newInstance();
                beanMap.put(clz, t);
                return t;
            }
            return (T) beanMap.get(clz);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
