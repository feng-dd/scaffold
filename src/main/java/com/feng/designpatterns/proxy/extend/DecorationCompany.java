package com.feng.designpatterns.proxy.extend;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/14 10:52
 * @Desc 装修公司
 * @Since 1.0
 */
public class DecorationCompany extends Homeowner{

    private Homeowner homeowner;

    // 装修谁的房子,所以要注入房主
    public DecorationCompany(Homeowner homeowner) {
        this.homeowner = homeowner;
    }

    void decoration() {
        measuringRoom();
        design();
        homeowner.decoration();
        receivePayment();
    }

    void measuringRoom() {
        System.out.println("工人量房");
    }

    void design() {
        System.out.println("设计师设计室内");
    }

    void receivePayment() {
        System.out.println("收款");
    }
}
