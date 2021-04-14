package com.feng.designpatterns.proxy.inteface;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/14 10:20
 * @Desc 当事人
 * @Since 1.0
 */
public class Party implements IDefend{
    @Override
    public void defend() {
        System.out.print("当事人自己辩护!");
    }
}
