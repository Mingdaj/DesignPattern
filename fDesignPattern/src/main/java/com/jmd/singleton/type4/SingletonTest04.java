package com.jmd.singleton.type4;

/**
 * Created with IntelliJ IDEA.
 * User: JiangMingda
 * Time: 2024/3/16 016 23:06
 * File: SingletonTest04
 * Description: 懒汉式（线程安全，同步方法）
 */
public class SingletonTest04 {
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
    // 加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}