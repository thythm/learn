package com.momo.learn.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 23:22
 */
public class CustomObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("监听到了事件状态的变化");
    }
}
