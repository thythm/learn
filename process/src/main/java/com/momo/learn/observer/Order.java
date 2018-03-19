package com.momo.learn.observer;

import java.util.Observable;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 23:24
 */
public class Order extends Observable {

    public void order(){
        System.out.println("完成了订单");
        setChanged();
        notifyObservers(this);
    }

}
