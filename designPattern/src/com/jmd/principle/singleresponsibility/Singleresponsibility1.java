package com.jmd.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/21 021 22:35
 * File: Singleresponsibility1
 * Description:
 */
public class Singleresponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("小火车");
    }
}

// 交通工具类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在行驶!!!");
    }
}
