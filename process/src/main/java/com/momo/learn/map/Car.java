package com.momo.learn.map;

import lombok.Data;

/**
 * @author majunjie
 * @date 2018/3/21 17:19
 */
@Data
public class Car implements Comparable<Car>{

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;

    @Override
    public int compareTo(Car o) {
        return price - o.price;
    }

}
