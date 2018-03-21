package com.momo.learn.concurrent.future;

/**
 * @author majunjie
 * @description
 * @date 2018/3/21 23:02
 */
public class Client {

    public Data request(final String queryStr){
        final FutureData future = new FutureData();

        new Thread(() -> {
           RealData realData = new RealData(queryStr);
           future.setRealData(realData);
        }).start();

        return future;
    }

}
