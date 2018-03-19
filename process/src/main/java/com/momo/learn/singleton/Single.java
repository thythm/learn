package com.momo.learn.singleton;

import java.io.Serializable;

/**
 * @author majunjie
 * @date 2018/3/19 20:00
 */
public class Single implements Serializable{

    private static Single single = new Single();

    private Single(){}

    public static Single instance(){
        return single;
    }

    private Object readResolve(){
        return single;
    }

}
