package com.momo.learn.observer;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 23:27
 */
public class Main {


    public static void main(String[] args) {

        Order order = new Order();
        order.addObserver(new CustomObserver());

        order.order();

    }

}
