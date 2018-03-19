package com.momo.learn.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author majunjie
 * @date 2018/3/19 20:27
 */
public class CustomMethodIntercept implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object invoke = methodProxy.invokeSuper(o, objects);

        return invoke;
    }

}
