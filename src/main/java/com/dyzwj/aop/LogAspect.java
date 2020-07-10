package com.dyzwj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;


import java.util.Arrays;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName LogAspect.java
 * @Description TODO
 * @createTime 2020年07月08日 19:32:00
 */
@Aspect
public class LogAspect {

    /**
     * 抽取公共的切入点表达式
     * 1.本类引用 @Before("pointCut()")
     * 2.外部类引用 @After("com.dyzwj.aop.LogAspect.pointCut()")
     */
    @Pointcut("execution(public int com.dyzwj.aop.MathCaculate.*(..))")
    public void pointCut(){}


    /**
     * 在目标方法之前切入 切入点表达式（指定在哪个位置切入）
     */
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] joinPointArgs = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature() + "运行...参数是：{"+ Arrays.asList(joinPointArgs) +"}");

    }

    @After("com.dyzwj.aop.LogAspect.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature() + "结束...");
    }

    /**
     * JoinPoint一定要出现在参数列表的第一位
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName() + "返回...结果是：{"+ result +"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint,Exception exception){
        System.out.println(joinPoint.getSignature().getName() + "异常...异常原因：{"+ exception +"}");
    }
}
