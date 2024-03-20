package com.jmd.factory.before;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 19:27
 * File: Client
 * Description: 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 1 创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("Latte");
        System.out.println(coffee.getName());
    }
}
