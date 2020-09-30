package com.shadow.common.util;

import lombok.Getter;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年09月30日 11时47分20秒
 */
@Getter
public class ShadowException extends RuntimeException {

    private int code;
    private String message;

}
