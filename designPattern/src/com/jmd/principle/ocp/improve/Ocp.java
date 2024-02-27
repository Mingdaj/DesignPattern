package com.jmd.principle.ocp.improve;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/2/27 10:45
 * File: Ocp
 * Description: 开闭原则
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Line());
    }
}

// 绘图类（使用方）
class GraphicEditor {
    // 接收Shape对象，调用draw()方法
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// Shape基类
abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

// 新增三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}

// 新增一个其他的图形
class Line extends Shape {
    Line() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("draw line");
    }
}