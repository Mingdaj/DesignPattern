package com.jmd.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/20 16:14
 * File: DessertFactory
 * Description: 抽象工厂类
 */
public interface DessertFactory {

    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜点的功能
    Dessert createDessert();
}
