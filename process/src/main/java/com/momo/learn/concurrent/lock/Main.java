package com.momo.learn.concurrent.lock;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 12:07
 */
public class Main {

    public static void main(String[] args) {

        CardService cardService = new CardService();
        CardService proxy = LockProxy.getProxy(cardService);

        proxy.makeQuery();

        System.out.println(proxy.makeCard());

    }

}

