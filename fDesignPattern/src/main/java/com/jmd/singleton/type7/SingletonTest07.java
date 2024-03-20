package com.jmd.singleton.type7;

/**
 * Created with IntelliJ IDEA.
 * User: JiangMingda
 * Time: 2024/3/16 016 23:06
 * File: SingletonTest07
 * Description: 静态内部类
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        // 测试，instance1和instance2是同一个对象实例，其hashcode也相同
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {

    // 构造器私有化
    private Singleton() {
    }

    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的公有方法，直接返回Singleton.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}