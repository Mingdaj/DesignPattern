package com.jmd.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 19:23
 * File: CoffeeStore
 * Description: 咖啡店类
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    // 点咖啡
    public Coffee orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
