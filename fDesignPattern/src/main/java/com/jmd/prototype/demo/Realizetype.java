package com.jmd.prototype.demo;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:03
 * File: Realizetype
 * Description: 具体原型类
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型对象创建成功！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
