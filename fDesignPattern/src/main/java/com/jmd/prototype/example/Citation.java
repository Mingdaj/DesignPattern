package com.jmd.prototype.example;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:19
 * File: Citation
 * Description: 奖状类
 */
public class Citation implements Cloneable {

    // 三好学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学：在2024学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
