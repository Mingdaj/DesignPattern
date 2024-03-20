package com.jmd.principle.liskov;

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
        // 本意是 1-2
        System.out.println("1 - 2 = " + b.func1(1, 2));
    }
}

// A类
class A {
    // 返回两数之差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类
// 增加了新功能：两数之和，再与9相加
class B extends A {
    // 这里重写了A类的func1方法，可能时无意识不小心的
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}
