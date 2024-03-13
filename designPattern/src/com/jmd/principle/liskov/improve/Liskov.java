package com.jmd.principle.liskov.improve;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/26 16:41
 * File: Liskov
 * Description: 里氏替换原则
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("1 - 2 = " + a.func1(1, 2));

        System.out.println("==============================");

        B b = new B();
        // B不再继承A类，b.func1不再是求减法
        // 本意是 1+2，调用功能明确
        System.out.println("1 + 2 = " + b.func1(1, 2));
        // 使用组合仍然可以使用到A的方法
        System.out.println("10 - 1 = " + b.func3(10, 1));
    }
}

// 创建一个更基础的类
class Base {
    // 将更基础的方法和成员写到Base类
}

// A类
class A extends Base{
    // 返回两数之差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类
// 增加了新功能：两数之和，再与9相加
class B extends Base {
    // 如果B需要使用A类的方法，使用组合关系
    private A a = new A();

    // 这里的func1方法，是B类的，与A类无关
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }

    // 仍然想使用A的方法
    public int func3(int num1, int num2) {
        return a.func1(num1, num2);
    }
}
