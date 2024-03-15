package com.jmd.umlclass.generalization;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/15 14:40
 * File: DaoSupport
 * Description: 泛化
 */
public abstract class DaoSupport {

    public void save(Object o){
        System.out.println("save");
    }
    public void delete(Object o){
        System.out.println("delete");
    }
}

class UserDao extends DaoSupport{
}
