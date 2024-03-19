package com.jmd.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 22:33
 * File: Cilent
 * Description: 测试类
 */
public class Cilent {
    public static void main(String[] args) {
        // 创建咖啡店类对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("Latte");
        System.out.println(coffee.getName());
    }
}
