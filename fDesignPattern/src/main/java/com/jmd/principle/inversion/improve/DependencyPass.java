package com.jmd.principle.inversion.improve;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/26 15:29
 * File: DependencyPass
 * Description:
 */
public class DependencyPass {

    public static void main(String[] args) {

        ChangHong tv = new ChangHong();

        // 方式1
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(tv);

        // 方式2
//        OpenAndClose openAndClose = new OpenAndClose(tv);
//        openAndClose.open();

        // 方式3
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(tv);
        openAndClose.open();

    }
}

//// 方式1：通过接口传递实现依赖
//// 开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv);
//}
//
//// ITV接口
//interface ITV {
//    public void play();
//}
//
//class ChangHong implements ITV {
//    public void play() {
//        System.out.println("ChangHong is playing");
//    }
//}
//
//// 实现接口
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//// 方式2：通过构造方法依赖传递
//interface IOpenAndClose {
//    public void open();
//}
//
//interface ITV {
//    public void play();
//}
//
//class ChangHong implements ITV {
//    public void play() {
//        System.out.println("ChangHong is playing");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    public void open() {
//        tv.play();
//    }
//}

// 方式3：通过setter方法传递
interface IOpenAndClose {
    public void open();
    public void setTv(ITV tv);
}

interface ITV {
    public void play();
}

class ChangHong implements ITV {
    public void play() {
        System.out.println("ChangHong is playing");
    }
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        tv.play();
    }
}
