package com.feng.designpatterns.proxy.springaop;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/16 11:17
 * @Desc
 * @Since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        userService.add();
    }
}
