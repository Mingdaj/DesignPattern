package com.jmd.umlclass.composition;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/15 15:29
 * File: Computer
 * Description: 组合
 */
public class Computer {
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}

class Mouse {}

class Monitor {}
