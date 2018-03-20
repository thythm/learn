package com.momo.learn.pool;

import org.apache.commons.pool2.impl.GenericObjectPool;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author majunjie
 * @date 2018/3/20 15:04
 */
public class Main {


    public static void main(String[] args) throws Exception{

        GenericObjectPool<Connection> pool = new GenericObjectPool<>(new ObjectPoolFactory());

        AtomicInteger counter = new AtomicInteger(0);

        for (int i = 0; i < 1; i++) {
            new Thread( () -> {
                try {
                    for (int j = 0; j < 100; j++) {
                        Connection connection = pool.borrowObject();
                        System.out.println("使用对象：" + connection);
                        pool.returnObject(connection);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    counter.getAndIncrement();
                }
            }).start();
        }

        while (true){
            if (counter.get() == 3) {
                break;
            }
        }
    }


}
