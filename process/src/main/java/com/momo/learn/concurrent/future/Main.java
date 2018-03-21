package com.momo.learn.concurrent.future;

/**
 * @author majunjie
 * @description
 * @date 2018/3/21 23:06
 */
public class Main {

    public static void main(String[] args) {

//        testFuture();

        testWait();

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
    public static void testFuture() {

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
