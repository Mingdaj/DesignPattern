package com.jmd.prototype.deepclone;

import com.jmd.prototype.deepclone.Citation;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:24
 * File: CitationTest
 * Description: 测试
 */
public class CitationTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation();
        Student student = new Student("张三", 18);
        citation.setStudent(student);

        // 复制奖状
        Citation citation1 = citation.clone();

        // 获取citation1奖状所属学生对象
        Student student1 = citation1.getStudent();
        student1.setName("李四");

        // 判断student和student1是否为同一个对象
        System.out.println("student和student1是否为同一个对象： " + (student == student1));

        // 调用show()方法
        citation.show();
        citation1.show();
    }
}
