package com.momo.learn.concurrent.lock;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 11:58
 */
public class LockProxy implements MethodInterceptor{

    private static LockProxy lockProxy = new LockProxy();

    private LockProxy(){}

    public static <T> T getProxy(T source){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(lockProxy);
        enhancer.setSuperclass(source.getClass());
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        ConcurrentLock lockConf = method.getAnnotation(ConcurrentLock.class);
        if (lockConf==null) {
            Object invoke = methodProxy.invokeSuper(o, objects);
            return invoke;
        }
        LockInterface lock = BeanFactory.getBean(lockConf.lockConfig());
        System.out.println("执行方法前，加锁，" + lock.lock("", ""));
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("执行方法后，解锁" + lock.unlock("", ""));
        return invoke;
    }

}
