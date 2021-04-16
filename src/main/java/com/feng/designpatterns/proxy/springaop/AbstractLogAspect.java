package com.feng.designpatterns.proxy.springaop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author Murphy
 * @Version 1.0
 * @Date 2021/4/16 10:22
 * @Desc 切面基类
 * @Since 1.0
 */
@Aspect
@Component
public class AbstractLogAspect {

    private static Logger logger = LoggerFactory.getLogger(AbstractLogAspect.class);

    @Pointcut("execution(* com.feng.designpatterns.proxy.springaop.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void beginTransaction() {
        System.out.println("before beginTransaction");
    }

    @After("pointcut()")
    public void commit() {
        System.out.println("after commit");
    }

    @AfterReturning(pointcut = "pointcut()", returning = "returnObject")
    public void afterReturning(JoinPoint joinPoint, Object returnObject) {
        System.out.println("afterReturning");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing afterThrowing  rollback");
    }

    /**
     * 定义切入点的增强方式和具体增强
     * @param point
     */
//    @Before("execution (* com.feng.designpatterns.proxy.springaop.*.*(..))")
//    public void log(JoinPoint point) {

//        Signature signature = point.getSignature();
//        MethodSignature methodSignature = (MethodSignature)signature;
//        Method targetMethod = methodSignature.getMethod(); // 需要加强的目标类的方法对象
//        Method realMethod = point.getTarget().getClass().getDeclaredMethod(signature.getName(), targetMethod.getParameterTypes());

//        logger.info("日志统一打印 ===== {}.{}() start =====,参数:{}", new Object[]{
//                // 获取包+类名
//                point.getSignature().getDeclaringTypeName(),
//                // 获取了方法名
//                point.getSignature().getName(),
//                this.argsToString(point.getArgs())
//        });
//        System.out.println(1);
//    }

//    private String argsToString(Object object) {
//        try {
//            return JSON.toJSONString(object);
//        } catch (Exception e) {
//            logger.error("", e);
//            return String.valueOf(object);
//        }
//    }
}
