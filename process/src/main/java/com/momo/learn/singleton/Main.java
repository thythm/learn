package com.momo.learn.singleton;

import java.io.*;

/**
 * @author majunjie
 * @date 2018/3/19 20:01
 */
public class Main {


    public static void main(String[] args) throws Exception{

        File file = new File("C:\\Users\\PC\\Desktop\\single.out");

        Single instance = Single.instance();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(instance);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Single single = (Single) inputStream.readObject();

        System.out.println(instance);
        System.out.println(single);
    }


}
