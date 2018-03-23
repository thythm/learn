package com.momo.learn.concurrent.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author majunjie
 * @description
 * @date 2018/3/21 23:06
 */
public class Main {

    public static void main(String[] args) throws Exception{

//        testCustomFuture();

//        testWait();

        testFuture();

    }

    public static void testWait() {
        final Obj obj = new Obj();

        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.setAllow();
        }).start();

        System.out.println(obj.get());

    }

    public static void testFuture() throws Exception{

        ExecutorService pool = Executors.newFixedThreadPool(1);

        Callable<String> callable = () -> {
            Thread.sleep(3000);
            return  "hello world";
        };

        /*Future future = pool.submit(callable);
        System.out.println(future.get());*/

        /*FutureTask<String> task = new FutureTask(callable);
        task.run();
        System.out.println(task.get());*/

        List<Future<String>> futures = pool.invokeAll(Arrays.asList(callable));
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        pool.shutdown();
    }

    public static void testCustomFuture() {

        Client client = new Client();

        Data data = client.request("hello world!");
        System.out.println("请求完毕");

        try {
            Thread.sleep(6000);
            System.out.println("处理其他事物完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(data.getResult());
    }


}
