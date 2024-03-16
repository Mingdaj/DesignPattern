package com.jmd.singleton.type1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/16 016 21:58
 * File: SingletonTest01
 * Description: 单例模式（饿汉式，静态变量）
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        // 测试，instance1和instance2是同一个对象实例，其hashcode也相同
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 饿汉式（静态变量）
class Singleton {
    // 1. 构造器私有化，外部不能new
    private Singleton() {
    }

    // 2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3. 提供一个公共的静态方法，供外部获取对象实例
    public static Singleton getInstance() {
        return instance;
    }
}