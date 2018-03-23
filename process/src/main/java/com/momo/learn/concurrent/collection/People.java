package com.momo.learn.concurrent.collection;

/**
 * @author majunjie
 * @date 2018/3/22 19:48
 */
public class People {

    private String hand;
    private String foot;

    public People() {
        this.hand = "hand";
        this.foot = "foot";
    }

    public  void playPhone(){
        synchronized (this){
            try {
                System.out.println("玩手机前");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我在玩手机");
        }
    }

    public void playBasketball(){
        synchronized (this){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我在打篮球");
        }
    }

    public void walk(){
        synchronized (this){
            System.out.println("我在走路");
        }
    }

    public void water(){
        System.out.println("喝水前");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我在喝水");
    }

}
