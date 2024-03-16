package com.jmd.umlclass.association;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/15 15:14
 * File: Person1
 * Description: 关联（双向一对一）
 */
public class Person1 {
    private IDCard1 card;
}
class IDCard1 {
    private Person1 person;
}
