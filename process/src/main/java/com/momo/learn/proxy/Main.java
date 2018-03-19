package com.momo.learn.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author majunjie
 * @date 2018/3/19 20:31
 */
public class Main {

    public static void main(String[] args) throws Exception{


        RealSubject realSubject = (RealSubject) Enhancer.create(RealSubject.class, new CustomMethodIntercept());

        realSubject.method();


    }

}
