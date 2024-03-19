package com.jmd.factory.before;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 19:23
 * File: CoffeeStore
 * Description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        // 声明咖啡类型
        Coffee coffee = null;

        // 根据类型创建咖啡实例
        if("Latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        else if("Americano".equals(type)) {
            coffee = new AmericanCoffee();
        }
        else {
            System.out.println("Sorry, we don't have this kind of coffee.");
        }

        // 加糖和奶
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
