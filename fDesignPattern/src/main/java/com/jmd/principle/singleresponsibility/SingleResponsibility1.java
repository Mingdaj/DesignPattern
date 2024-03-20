package com.jmd.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/21 021 22:35
 * File: SingleResponsibility1
 * Description: 单一职责原则，方式1
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("轮船");
        vehicle.run("高铁");
        vehicle.run("汽车");
    }
}

/**
 * 方式1：
 * 1. 在方式1的run方法中，违反了单一职责原则
 * 2. 解决方法：应根据交通工具运行方式的不同，分解成不同的类
 */

// 交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶!!!");
    }
}
