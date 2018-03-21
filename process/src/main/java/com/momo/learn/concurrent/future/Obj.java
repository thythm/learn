package com.momo.learn.concurrent.future;

/**
 * @author majunjie
 * @description
 * @date 2018/3/21 23:30
 */
public class Obj {

    private boolean allow = false;

    public synchronized void setAllow() {
        if (this.allow) {
            return;
        }
        this.allow = true;
        notify();
    }

    public synchronized String get(){
        while (!allow) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "hello world";
    }

}
