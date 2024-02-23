package com.jmd.principle.segregation;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/23 17:05
 * File: Segregation1
 * Description: 接口隔离原则
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();

        // A类通过接口去依赖B类
        a.method1(new B());
        a.method2(new B());
        a.method3(new B());

        C c = new C();
        // C类通过接口去依赖D类
        c.method1(new D());
        c.method4(new D());
        c.method5(new D());
    }
}

// 接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

// B类
class B implements Interface1 {
    public void operation1() {
        System.out.println("B operation1");
    }

    public void operation2() {
        System.out.println("B operation2");
    }

    public void operation3() {
        System.out.println("B operation3");
    }

    public void operation4() {
        System.out.println("B operation4");
    }

    public void operation5() {
        System.out.println("B operation5");
    }
}

// D类
class D implements Interface1 {
    public void operation1() {
        System.out.println("D operation1");
    }

    public void operation2() {
        System.out.println("D operation2");
    }

    public void operation3() {
        System.out.println("D operation3");
    }

    public void operation4() {
        System.out.println("D operation4");
    }

    public void operation5() {
        System.out.println("D operation5");
    }
}

/**
 * A类通过接口Interface1依赖（使用）B类，但是只会使用operation1()、operation2()、operation3()方法
 */
class A {
    public void method1(Interface1 i) {
        i.operation1();
    }

    public void method2(Interface1 i) {
        i.operation2();
    }
    public void method3(Interface1 i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1依赖（使用）D类，但是只会使用operation1()、operation4()、operation5()方法
 */
class C {

    public void method1(Interface1 i) {
        i.operation4();
    }

    public void method4(Interface1 i) {
        i.operation4();
    }

    public void method5(Interface1 i) {
        i.operation5();
    }
}
