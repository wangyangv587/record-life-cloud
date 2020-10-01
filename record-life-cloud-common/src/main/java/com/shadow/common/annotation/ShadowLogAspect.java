package com.shadow.common.annotation;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年10月01日 22时45分
 */
@Aspect
@Component
@Slf4j
public class ShadowLogAspect {

    /**
     * 定义切点，作用在使用了{@link ShadowLog}注解的地方
     */
    @Pointcut("@annotation(com.shadow.common.annotation.ShadowLog)")
    public void logPointCut() {

    }

    /**
     * 记录参数、返回值、方法调用时间
     * Around和logPointCut可写一起,如@Around("@annotation(com.shadow.common.annotation.ShadowLog)")
     */
    @Around("logPointCut()")
    public Object process(ProceedingJoinPoint point) throws Throwable {

        //获取方法参数
        Object[] args = point.getArgs();
        //获取方法名
        String methodName = point.getSignature().getName();
        //获取所在类名
        String className = point.getTarget().getClass().getName();
        //记录参数
        try {
            log.info("{} | args：{}", methodName, JSONUtil.toJsonStr(args));
        } catch (Exception e) {
            log.error("注解打印参数日志错误：{}.{}", className, methodName);
        }
        //记录方法调用时间
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        long end = System.currentTimeMillis();

        //记录返回值
        try {
            log.debug("{} | {}ms，return:{}", methodName, (end - start), JSONUtil.toJsonStr(result));
        } catch (Exception e) {
            log.error("注解打印返回值日志错误：{}.{}，e：{}", className, methodName, e);
        }
        return result;
    }
}
