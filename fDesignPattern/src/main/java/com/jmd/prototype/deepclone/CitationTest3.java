package com.jmd.prototype.deepclone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:24
 * File: CitationTest
 * Description: 测试
 */
public class CitationTest3 {
    public static void main(String[] args) throws Exception {
        // 创建原型对象
        Citation citation = new Citation();
        Student student = new Student("张三", 18);
        citation.setStudent(student);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\javaTest\\citation.txt"));
        // 将citation对象写入到文件中
        oos.writeObject(citation);
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\javaTest\\citation.txt"));
        // 从文件中读取奖状对象
        Citation citation1 = (Citation) ois.readObject();
        ois.close();
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
