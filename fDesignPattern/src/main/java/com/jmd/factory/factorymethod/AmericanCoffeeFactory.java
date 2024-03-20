package com.jmd.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/20 14:10
 * File: AmericanCoffeeFactory
 * Description: AmericanCoffeeFactory: 美式咖啡工厂对象，用于生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
