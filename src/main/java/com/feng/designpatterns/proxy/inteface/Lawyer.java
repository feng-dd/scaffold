package com.feng.designpatterns.proxy.inteface;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/14 10:20
 * @Desc 律师
 * @Since 1.0
 */
public class Lawyer implements IDefend{

    private Party party;

    public Lawyer(Party party) {
        this.party = party;
    }

    @Override
    public void defend() {
        party.defend();
        System.out.println("律师帮忙辩护!");
        provideEvidence();
        appeal();
        appease();
    }

    public void provideEvidence() {
        System.out.println("律师提供证据!");
    }

    public void appeal() {
        System.out.println("律师提出上诉!");
    }

    public void appease() {
        System.out.println("律师安抚当事人!");
    }
}
