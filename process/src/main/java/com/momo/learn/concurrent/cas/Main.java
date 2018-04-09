package com.momo.learn.concurrent.cas;

import sun.misc.Unsafe;

/**
 * @author majunjie
 * @date 2018/4/9 16:33
 */
public class Main {



    public static void main(String[] args) {



    }

    private static class People{

        static volatile String name;
        static volatile int age;

        private static final Unsafe UNSAFE;
        private static final long itemOffset;
        private static final long nextOffset;

        static {
            try {
                UNSAFE = sun.misc.Unsafe.getUnsafe();
                Class<?> k = People.class;
                itemOffset = UNSAFE.objectFieldOffset
                        (k.getDeclaredField("name"));
                nextOffset = UNSAFE.objectFieldOffset
                        (k.getDeclaredField("age"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

    }

}
