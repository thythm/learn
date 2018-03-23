package com.momo.learn.concurrent.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author majunjie
 * @date 2018/3/23 13:18
 */
public class Main {

    public static void main(String[] args) {

        final ReentrantLock lock = new ReentrantLock();
        Runnable run = () -> {
            try {
                while (true) {
                    if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                        System.out.println(Thread.currentThread().getName() + "：获取到了锁");
                        Thread.sleep(1500);
                        lock.unlock();
                        System.out.println(Thread.currentThread().getName() + "：释放了锁");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable run2 = () -> {
            ReentrantLock lock2 = new ReentrantLock();
            try {
                Thread.sleep(100);
                while (true) {
                    if (lock2.tryLock(3000, TimeUnit.MILLISECONDS)) {
                        System.out.println(Thread.currentThread().getName() + "：获取到了锁");
                        Thread.sleep(1500);
                        lock2.unlock();
                        System.out.println(Thread.currentThread().getName() + "：释放了锁");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(run, "线程一");
        Thread thread2 = new Thread(run, "线程二");
        Thread thread3 = new Thread(run2, "线程三");

        thread.start();
        thread2.start();
        thread3.start();

    }



}
