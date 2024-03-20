package com.jmd.principle.inversion;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/26 11:26
 * File: DependecyInversion
 * Description: 依赖倒转原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "email: hello!";
    }
}

/**
 * 完成Persion接收消息的功能
 * 方式1:
 * 1. 简单，容易实现
 * 2. 如果我们获取的对象是微信，短信等，则需新增类，同时Persion类也需要添加相应的接收方法
 * 3. 解决思路：引入一个抽象接口IReceive，表示接收者，这样Persion类与接口发生依赖关系。Email、微信、短信等各自实现IReceive接口，符合依赖倒转原则
 */
class Persion {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
