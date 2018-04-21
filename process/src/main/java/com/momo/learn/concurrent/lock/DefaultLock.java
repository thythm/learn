package com.momo.learn.concurrent.lock;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 12:39
 */
public class DefaultLock extends AbstractLock {
    @Override
    public boolean tryLock(String key, String requestId, int seconds) {
        return true;
    }

    @Override
    public boolean lock(String key, String requestId) {
        return true;
    }

    @Override
    public boolean unlock(String key, String requestId) {
        return true;
    }
}
