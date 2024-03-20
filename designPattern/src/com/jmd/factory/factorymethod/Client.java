package com.jmd.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/20 14:15
 * File: Client
 * Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        // 创建对象
        CoffeeStore coffeeStore = new CoffeeStore();
        // 拿铁咖啡美式咖啡
//        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        // 拿铁咖啡
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);

        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("Latte");
        System.out.println(coffee.getName());
    }
}
