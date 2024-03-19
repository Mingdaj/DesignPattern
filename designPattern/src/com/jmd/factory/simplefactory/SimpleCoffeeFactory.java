package com.jmd.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 22:26
 * File: SimpleCoffeeFactory
 * Description: 简单咖啡工厂类，用来生产咖啡
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        // 声明咖啡类型
        Coffee coffee = null;

        // 根据类型创建咖啡实例
        if("Latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        else if("Americano".equals(type)) {
            coffee = new AmericanCoffee();
        }
        else {
            System.out.println("Sorry, we don't have this kind of coffee.");
        }

        return coffee;
    }
}
