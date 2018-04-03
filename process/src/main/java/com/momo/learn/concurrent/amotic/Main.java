package com.momo.learn.concurrent.amotic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author majunjie
 * @date 2018/4/3 15:25
 */
public class Main {


    public static void main(String[] args) throws Exception{

        AtomicInteger ai = new AtomicInteger(0);

        ExecutorService service = Executors.newFixedThreadPool(5);

        TestRunnable runnable = new TestRunnable();

        for (int j = 0; j < 5; j++) {
            service.execute(runnable);
        }

        service.shutdown();

        Thread.sleep(30);
    }

    static class TestRunnable implements Runnable{

        private static AtomicInteger ai = new AtomicInteger(0);

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "：" + ai.addAndGet(1));
            }
        }
    }


}
