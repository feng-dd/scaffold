package com.feng.designpatterns.proxy.extend;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/14 11:04
 * @Desc 装修场景
 * @Since 1.0
 */
public class Decoration {

    public static void main(String[] args) {
        // 买房子
        House house = new House();

        // 房主要装修
        Homeowner homeowner = new Homeowner();

        // 房主找到装修公司，将装修包给了它们
        DecorationCompany company = new DecorationCompany(homeowner);

        // 开始装修
        company.decoration();
    }
}
