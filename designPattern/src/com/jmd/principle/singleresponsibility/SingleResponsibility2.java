package com.jmd.principle.singleresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/23 14:27
 * File: SingleResponsibility2
 * Description: 单一职责原则，方式2
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        FlightVehicle flightVehicle = new FlightVehicle();
        flightVehicle.run("飞机");

        SeaVehicle seaVehicle = new SeaVehicle();
        seaVehicle.run("轮船");
    }
}

/**
 * 方式2：
 * 1. 遵守单一职责原则
 * 2. 但是这样改动很大，将类分解，需要修改客户端
 * 3. 改进：直接修改Vehicle类，改动很小（相较于方式2）
 */

// 公路交通工具类
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }
}

// 飞行交通工具类
class FlightVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在空中飞行");
    }
}

// 海上交通工具类
class SeaVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在海上行驶");
    }
}
