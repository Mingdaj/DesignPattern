package com.jmd.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 19:23
 * File: CoffeeStore
 * Description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        // 实例化工厂
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();

        // 调用生产咖啡的方法
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        // 加糖和奶
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
