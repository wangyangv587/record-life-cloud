package com.shadow.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类 描 述：用于记录方法日志，包含请求参数、调用时间、调用次数
 * 创 建 人：Shadow
 * 创建时间：2020年10月01日 22时40分
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ShadowLog {
}
