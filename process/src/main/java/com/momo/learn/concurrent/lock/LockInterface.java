package com.momo.learn.concurrent.lock;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 12:32
 */
public interface LockInterface {

    boolean tryLock(String key, String requestId, int seconds);

    boolean lock(String key, String requestId);

    boolean unlock(String key, String requestId);

}
