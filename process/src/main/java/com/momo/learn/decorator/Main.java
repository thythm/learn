package com.momo.learn.decorator;

import java.io.*;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 22:55
 */
public class Main {

    public static void main(String[] args) {

        IPackCreator iPackCreator = new PacketHTTPHeaderCreator(
                new PacketHtmlHeaderCreator(
                        new PacketBodyCreator()));
        String content = iPackCreator.handleContent();

        System.out.println(content);

    }

    /**
     * jdk中典型的装饰者模式，OutputStream
     * @throws Exception
     */
    public static void outputStream() throws Exception{
        OutputStream outputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(new File(""))));


    }




}
