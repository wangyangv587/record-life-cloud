package com.shadow.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 类 描 述：全局异常处理类
 * 创 建 人：Shadow
 * 创建时间：2020年10月13日 17时04分26秒
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ShadowException.class)
    public R shadowExceptionHandler(ShadowException e){

        log.error(e.getMessage(),e);
        return R.error(e);
    }

    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Throwable e){
        log.error(e.getMessage(),e);
        return R.error();
    }
}
