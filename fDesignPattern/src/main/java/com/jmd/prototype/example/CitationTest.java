package com.jmd.prototype.example;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/3/24 024 10:24
 * File: CitationTest
 * Description: 测试
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1 创建原型对象
        Citation citation = new Citation();

        // 2 克隆奖状对象
        Citation citation1 = citation.clone();
        citation.setName("张三");
        citation1.setName("李四");

        // 3 调用show()方法
        citation.show();
        citation1.show();
    }
}
