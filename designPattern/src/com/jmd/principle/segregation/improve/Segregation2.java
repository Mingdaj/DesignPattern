package com.jmd.principle.segregation.improve;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/23 17:05
 * File: Segregation1
 * Description: 接口隔离原则
 */
public class Segregation2 {

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

// 接口1
interface Interface1 {
    void operation1();
}

// 接口2
interface Interface2 {
    void operation2();
    void operation3();
}

// 接口3
interface Interface3 {
    void operation4();
    void operation5();
}

// B类
class B implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("B operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B operation3");
    }
}

// D类
class D implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("D operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D operation5");
    }
}

/**
 * A类通过接口Interface1、Interface2依赖（使用）B类，但是只会使用operation1()、operation2()、operation3()方法
 */
class A {
    public void method1(Interface1 i) {
        i.operation1();
    }

    public void method2(Interface2 i) {
        i.operation2();
    }
    public void method3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1、Interface3依赖（使用）D类，但是只会使用operation1()、operation4()、operation5()方法
 */
class C {

    public void method1(Interface1 i) {
        i.operation1();
    }

    public void method4(Interface3 i) {
        i.operation4();
    }

    public void method5(Interface3 i) {
        i.operation5();
    }
}
