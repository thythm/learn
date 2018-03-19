package com.momo.learn.observer;

public interface ISubject {

    public void regiter(IObserver observer);

    public void remove(IObserver observer);

    public void notify(IObserver observer);

}
