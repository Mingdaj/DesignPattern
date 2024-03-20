package com.jmd.principle.ocp;

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
    }
}

// 绘图类（使用方）
class GraphicEditor {
    // 接收Shape对象，根据Type来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        }else if (s.m_type == 2) {
            drawCircle(s);
        }else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    // 绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println("draw rectangle");
    }

    // 绘制圆形
    public void drawCircle(Shape c) {
        System.out.println("draw circle");
    }

    // 绘制三角形
    public void drawTriangle(Shape t) {
        System.out.println("draw triangle");
    }
}

// Shape基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

// 新增三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}