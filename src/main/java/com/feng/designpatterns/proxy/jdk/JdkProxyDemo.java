package com.feng.designpatterns.proxy.jdk;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/16 9:57
 * @Desc
 * @Since 1.0
 */
public class JdkProxyDemo {

    public static void main(String[] args) {
        // 真实类
        IUserService userService = new UserServiceImpl();
        // 获取代理处理器，并设置目标对象
        ServiceProxyInvocationHandler pih = new ServiceProxyInvocationHandler();
        pih.setTarget(userService);
        // 通过代理处理器动态获取代理对象，并执行方法
        IUserService proxy = (IUserService)pih.getProxy();
        proxy.add();
    }
}
