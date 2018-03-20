package com.momo.learn.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * @author majunjie
 * @date 2018/3/20 13:44
 */
public class EHCacheUtil {

    private static CacheManager cacheManager;

    static {
        cacheManager = CacheManager.create(EHCacheUtil.class.getClassLoader().getResourceAsStream("ehcache.xml"));
    }


    public static void main(String[] args) {

        test();

    }


    public static void test(){
        Cache test = cacheManager.getCache("test");
        System.out.println(test);
    }

}
