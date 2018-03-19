package com.momo.learn.builder;

/**
 * @author majunjie
 * @date 2018/3/17 15:15
 */
public class Main {

    public static void main(String[] args) {

        People people = new People.PeopleBuilder("1", "2", "3").nestedVar4("4").build();

        System.out.println(people.getVar1());

        System.out.println(people);
    }


}
