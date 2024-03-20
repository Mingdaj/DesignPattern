package com.jmd.factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/19 019 19:18
 * File: Coffee
 * Description: 咖啡类
 */
public abstract class Coffee {

    // 获取咖啡名
    public abstract String getName();

    // 加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
