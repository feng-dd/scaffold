package com.feng.designpatterns.proxy.inteface;

import com.feng.designpatterns.proxy.inteface.IDefend;
import com.feng.designpatterns.proxy.inteface.Judge;
import com.feng.designpatterns.proxy.inteface.Lawyer;
import com.feng.designpatterns.proxy.inteface.Party;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/14 10:22
 * @Desc 法庭
 * @Since 1.0
 */
public class Court {
    public static void main(String[] args) {
        // 法官
        Judge judge = new Judge();

        // 有请当事人及其律师
        Party party = new Party();
        IDefend defend = new Lawyer(party);

        // 法官审问当事人
        judge.interrogation();

        // 律师帮忙辩护
        defend.defend();
    }
}
