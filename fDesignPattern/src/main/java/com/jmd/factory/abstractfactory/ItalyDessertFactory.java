package com.jmd.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/20 16:19
 * File: ItalyDessertFactory
 * Description: 意大利式风味甜品工厂，生产拿铁咖啡和提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
