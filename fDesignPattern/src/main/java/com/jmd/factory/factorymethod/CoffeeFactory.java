package com.jmd.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/20 14:08
 * File: CoffeeFactory
 * Description: CoffeeFactory：抽象工厂
 */
public interface CoffeeFactory {

    // 创建咖啡对象的方法
    Coffee createCoffee();
}
