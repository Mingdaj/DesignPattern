package com.jmd.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/28 15:22
 * File: Demeter1
 * Description: 迪米特法则（改进）
 */
public class Demeter1 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        // 输出学校总部和学院员工信息
        schoolManager.printAllEmployee(new CollegeEmployeeManager());
    }
}

// 学校总部员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工管理类
class CollegeEmployeeManager {
    public List<CollegeEmployee> getAllEmployee() {
        // 返回学院的所有员工
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工ID：" + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    // 输出学院员工信息
    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("学院员工信息：" + list1);
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

// 学校员工管理类
// 分析：
// 直接朋友：Employee、CollegeEmployeeManager
// CollegeEmployee不是直接朋友，违反了迪米特法则（以局部变量的形式出现在SchoolManager类）
class SchoolManager {
    // 返回学校总部的所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工ID：" + i);
            list.add(employee);
        }
        return list;
    }

    // 输出学校总部和学院员工信息
    void printAllEmployee(CollegeEmployeeManager sub) {
        /*// 获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("学院员工信息：" + list1);
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }*/

        // 分析问题：将输出学院员工方法，封装到CollegeEmployeeManager类中
        sub.printEmployee();

        // 获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("学校总部员工信息：" + list2);
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
