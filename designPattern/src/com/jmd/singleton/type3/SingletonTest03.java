package com.jmd.singleton.type3;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/16 016 22:48
 * File: SingletonTest03
 * Description: 懒汉式（线程不安全）
 */
public class SingletonTest03 {

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
    private static Singleton instance;

    private Singleton() {
    }

    // 提供一个静态的公有方法，当使用到该方法时，才去创建实例，即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
