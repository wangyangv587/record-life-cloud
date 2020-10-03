package com.shadow.common.annotation;

import com.shadow.common.config.DynamicDataSourceConfig;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年10月03日 23时44分
 */
@Aspect
@Component
public class DSAspect {

    @Pointcut("@annotation(DS)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void process(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        DS ds = method.getAnnotation(DS.class);
        if(ds != null){
            String value = ds.value();
            System.out.println(value);
            DynamicDataSourceConfig.setDatasource(value);
        }
    }
}
