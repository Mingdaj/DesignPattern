package com.jmd.principle.inversion.improve;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/26 11:26
 * File: DependecyInversion
 * Description: 依赖倒转原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        // 客户端无需改变
        Persion persion = new Persion();
        persion.receive(new Email());
        persion.receive(new WeChat());
    }
}

// 定义一个接口
interface IReceiver {
    public String getInfo();
}

// Email
class Email implements IReceiver {
    public String getInfo() {
        return "email: hello!";
    }
}

// 微信
class WeChat implements IReceiver {
    public String getInfo() {
        return "wechat: hello!";
    }
}

/**
 * 方式2
 */
class Persion {
    // 对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
