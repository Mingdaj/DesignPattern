package com.jmd.singleton.type6;

/**
 * Created with IntelliJ IDEA.
 * User: JiangMingda
 * Time: 2024/3/16 016 23:06
 * File: SingletonTest06
 * Description: 双重检查（双重校验锁）
 */
public class SingletonTest06 {
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
    private static volatile Singleton instance;

    private Singleton() {
    }

    // 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，也保证了效率
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}