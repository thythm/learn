package com.momo.learn.concurrent.future;

/**
 * @author majunjie
 * @description
 * @date 2018/3/21 22:52
 */
public class RealData implements Data {

    protected final String result;

    public RealData(String para) {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.result = "真实数据";
    }

    @Override
    public String getResult() {
        return result;
    }
}
