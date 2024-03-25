package com.jmd.prototype.deepclone;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:19
 * File: Citation
 * Description: 奖状类
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2024学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
