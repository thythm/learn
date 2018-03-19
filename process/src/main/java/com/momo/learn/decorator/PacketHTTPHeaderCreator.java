package com.momo.learn.decorator;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 22:48
 */
public class PacketHTTPHeaderCreator extends AbstractDecorator {
    public PacketHTTPHeaderCreator(IPackCreator iPackCreator) {
        super(iPackCreator);
    }

    @Override
    public String handleContent() {
        String http = "Cache-Control:no-cache;";
        http += iPackCreator.handleContent();
        return http;
    }

}
