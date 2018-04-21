package com.momo.learn.concurrent.lock;

/**
 * @author majunjie
 * @description
 * @date 2018/4/21 11:55
 */
public class CardService {

    @ConcurrentLock
    public String makeCard(){
        System.out.println("开始出票");

        System.out.println("正在出票...");

        System.out.println("结束出票");

        return "666666";
    }

    public void makeQuery(){
        System.out.println("开始查询");

        System.out.println("正在查询...");

        System.out.println("结束查询");
    }

}
