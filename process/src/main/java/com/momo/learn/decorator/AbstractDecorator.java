package com.momo.learn.decorator;

/**
 * @author majunjie
 * @description
 * @date 2018/3/19 22:46
 */
public abstract class AbstractDecorator implements IPackCreator {

    protected IPackCreator iPackCreator;

    public AbstractDecorator(IPackCreator iPackCreator){
        this.iPackCreator = iPackCreator;
    }

}
