package com.jmd.umlclass.implementation;

/**
 * Created with IntelliJ IDEA.
 * User: Mingda
 * Time: 2024/3/15 14:51
 * File: UserService
 * Description: 实现
 */
public class UserService implements BaseService {
    @Override
    public void delete(Integer id) {
        System.out.println("delete......");
    }
}
