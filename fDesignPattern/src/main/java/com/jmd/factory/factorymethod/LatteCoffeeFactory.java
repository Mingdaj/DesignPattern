package com.jmd.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/20 14:11
 * File: LatteCoffeeFactory
 * Description: LatteCoffeeFactory: 拿铁咖啡工厂对象，用于生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
