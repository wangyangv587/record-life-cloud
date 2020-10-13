package com.shadow.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年10月03日 23时43分
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface DS {

    String value() default "first";
}
