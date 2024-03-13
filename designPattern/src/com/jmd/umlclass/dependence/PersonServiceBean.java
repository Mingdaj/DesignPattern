package com.jmd.umlclass.dependence;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/12 17:27
 * File: PersonServiceBean
 * Description: 依赖
 */
public class PersonServiceBean {

    // 类的成员属性
    private PersonDao personDao;

    // 方法接收的参数类型
    public void save(Person person) {
    }

    // 方法的返回类型
    public IDCard getIDCard(Integer personid) {
        return null;
    }

    // 方法中使用到
    public void modify() {
        Department department = new Department();
    }
}