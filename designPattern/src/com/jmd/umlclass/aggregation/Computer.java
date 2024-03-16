package com.jmd.umlclass.aggregation;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/15 15:23
 * File: Computer
 * Description: 聚合
 */
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
class Mouse {}
class Monitor {}
