package com.jmd.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/20 16:21
 * File: Client
 * Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        // 创建意大利风味的甜品工厂对象
//        DessertFactory dessertFactory = new ItalyDessertFactory();
        // 创建美式风味的甜品工厂对象
        DessertFactory dessertFactory = new AmericanDessertFactory();
        // 生产对应的咖啡和甜点
        Coffee coffee = dessertFactory.createCoffee();
        Dessert dessert = dessertFactory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
