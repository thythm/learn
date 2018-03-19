package com.momo.learn.decorator;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 22:45
 */
public class PacketBodyCreator implements IPackCreator {
    @Override
    public String handleContent() {
        return "hello world!";
    }
}
