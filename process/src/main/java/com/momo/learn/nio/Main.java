package com.momo.learn.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author majunjie
 * @date 2018/3/21 18:19
 */
public class Main {

    public static void main(String[] args) throws Exception{

//        bufferTest();

        channelBuffer();
    }

    public static void bufferTest(){
        ByteBuffer buffer = ByteBuffer.allocate(15);
        System.out.println("position=" + buffer.position() + "，limit=" + buffer.limit() + "，capacity=" + buffer.capacity());
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }
        System.out.println("position=" + buffer.position() + "，limit=" + buffer.limit() + "，capacity=" + buffer.capacity());
        buffer.flip();
        for (int i = 0; i < 5; i++) {
            System.out.println(buffer.get(i));
        }
        System.out.println("position=" + buffer.position() + "，limit=" + buffer.limit() + "，capacity=" + buffer.capacity());
        buffer.flip();
        System.out.println("position=" + buffer.position() + "，limit=" + buffer.limit() + "，capacity=" + buffer.capacity());
    }

    public static void channelBuffer() throws Exception{
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\PC\\Desktop\\test.txt"));
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\PC\\Desktop\\test2.txt"));

        FileChannel readChannel = fis.getChannel();
        FileChannel writeChannel = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while(true) {
            buffer.clear();
            if (readChannel.read(buffer)==-1) {
                break;
            }
            buffer.flip();
            writeChannel.write(buffer);
        }
        writeChannel.close();
        readChannel.close();
    }

}
