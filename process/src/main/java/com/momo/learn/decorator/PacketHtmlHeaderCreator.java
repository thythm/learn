package com.momo.learn.decorator;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 22:48
 */
public class PacketHtmlHeaderCreator extends AbstractDecorator {
    public PacketHtmlHeaderCreator(IPackCreator iPackCreator) {
        super(iPackCreator);
    }

    @Override
    public String handleContent() {
        String html = "<html>";
        html += "<meta .../>";
        html += "<meta .../>";
        html += "<meta .../>";
        html += "<body>";
        html += iPackCreator.handleContent();
        html += "</body>";
        html += "</html>";
        return html;
    }
}
