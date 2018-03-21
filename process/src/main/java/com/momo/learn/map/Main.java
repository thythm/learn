package com.momo.learn.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author majunjie
 * @date 2018/3/21 17:21
 */
public class Main {


    public static void main(String[] args) {

        treeMapTest();

    }

    public static void treeMapTest(){
        Map<Car, String> map = new TreeMap<>();

        map.put(new Car("保时捷", 1000000), "保时捷");
        map.put(new Car("奥迪", 100000), "奥迪");
        map.put(new Car("宝马", 500000), "宝马");

        for (Car car : map.keySet()) {
            System.out.println(map.get(car));
        }

    }


}
