package com.feng.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/15 10:21
 * @Desc 业务层代理处理器
 * @Since 1.0
 */
public class ServiceProxyInvocationHandler implements InvocationHandler {

    /*
     * 被代理类（真实类）
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 获取 target 的代理类
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    /**
     * 代理运行 target 的 method 方法
     * @param proxy
     * @param method target 的 method 方法
     * @param args  target 的 method 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logBefor(method);
        //核心：本质利用反射实现！
        Object result = method.invoke(target, args);
        logAfter(method);
        return result;
    }

    private void logBefor(Method method){
        System.out.println(method.getName() + "() 开始执行!");
    }

    private void logAfter(Method method){
        System.out.println(method.getName() + "() 执行完毕!");
    }
}
