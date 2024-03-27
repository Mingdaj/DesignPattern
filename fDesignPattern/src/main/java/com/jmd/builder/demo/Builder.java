package com.jmd.builder.demo;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/27 027 23:53
 * File: Builder
 * Description:
 */
public abstract class Builder {

    // 声明Bike类型的变量，进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 构建自行车的方法
    public abstract void createBike();
}
