package com.momo.learn.concurrent.collection;

/**
 * @author majunjie
 * @date 2018/3/22 19:49
 */
public class Main {

    public static void main(String[] args) {

        final People people = new People();
        final People people2 = new People();

        new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            people.playPhone();
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            people.walk();
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            people2.walk();
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            people.water();
        }).start();

    }


}
