package com.momo.learn.collection;

/**
 * @author majunjie
 * @description
 * @date 2018/3/20 23:05
 */
public class Main {


    public static void main(String[] args) {

//        testArrayCopy();

        System.out.println(4<<3);

    }

    public static void testArrayCopy() {

        String[] strs = new String[]{"1","2","3","4","5","6","7","8","9"};

        String[] newStrs = new String[6];
        System.arraycopy(strs, 2, newStrs, 0, 3);
        System.out.println(newStrs);
    }


}
