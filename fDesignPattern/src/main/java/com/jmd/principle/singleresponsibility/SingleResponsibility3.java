package com.jmd.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/23 14:41
 * File: SingleResponsibility3
 * Description: 单一职责原则，方式3
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("汽车");
        vehicle.runFlight("飞机");
        vehicle.runSea("轮船");
    }
}

/**
 * 方式3：
 * 1. 将所有方法都放到一个类中，每个方法都实现一个职责
 * 2. 类级别没有遵守单一职责原则，但是方法级别遵守单一职责原则
 */

// 交通工具类
class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }

    public void runSea(String vehicle) {
        System.out.println(vehicle + "在海上行驶");
    }

    public void runFlight(String vehicle) {
        System.out.println(vehicle + "在空中行驶");
    }
}
