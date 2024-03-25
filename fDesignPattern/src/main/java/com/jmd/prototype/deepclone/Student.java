package com.jmd.prototype.deepclone;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/25 025 12:17
 * File: Student
 * Description: 学生类
 */
public class Student implements Serializable {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
