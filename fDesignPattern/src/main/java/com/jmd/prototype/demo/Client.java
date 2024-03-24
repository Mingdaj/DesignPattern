package com.jmd.prototype.demo;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:09
 * File: Client
 * Description: 测试
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        // 调用原型类中的clone()方法进行对象克隆
        Realizetype cloneRealizetype = realizetype.clone();

        System.out.println("原型类对象的地址：" + realizetype);
        System.out.println("克隆出来的对象的地址：" + cloneRealizetype);
        System.out.println("原型类对象和克隆出来的对象是否相同：" + (realizetype == cloneRealizetype));
    }
}