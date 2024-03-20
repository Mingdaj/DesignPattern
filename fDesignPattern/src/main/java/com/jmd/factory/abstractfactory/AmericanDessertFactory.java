package com.jmd.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/20 16:16
 * File: AmericanDessertFactory
 * Description: 美式风味甜品工厂，生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
