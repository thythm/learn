package com.momo.learn.proxy;

/**
 * @author majunjie
 * @date 2018/3/19 20:24
 */
public class RealSubject {

    public RealSubject(){
        System.out.println("初始化真正对象");
        System.out.println(this);
    }


    public void method(){
        System.out.println("真正对象的方法");
        System.out.println(this);
    }


}
