package com.jmd.singleton.type8;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/17 017 0:16
 * File: SingletonTest08
 * Description: 枚举
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.method();
    }
}

enum Singleton {
    INSTANCE;

    public void method() {
        System.out.println("OK!!!");
    }
}
