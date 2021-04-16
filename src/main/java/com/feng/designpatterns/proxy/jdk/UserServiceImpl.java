package com.feng.designpatterns.proxy.jdk;

import org.springframework.stereotype.Service;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/15 10:19
 * @Desc 用户业务接口实现
 * @Since 1.0
 */
public class UserServiceImpl implements IUserService {

    @Override
    public void add() {
        System.out.println("新增用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}
