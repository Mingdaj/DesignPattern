package com.jmd.factory.configfactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/20 16:48
 * File: Client
 * Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
        System.out.println("===========================");
        Coffee coffee2 = CoffeeFactory.createCoffee("american");
        System.out.println(coffee2.getName());
    }
}
