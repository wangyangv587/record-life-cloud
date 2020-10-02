package com.shadow.common.util;

import lombok.Getter;

import java.util.HashMap;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年09月30日 11时45分02秒
 */
@Getter
public class R extends HashMap<String,Object> {


    public R() {
        put("code",200);
        put("msg","ok");
    }

    public static R ok(){
        return new R();
    }

    public static R error(ShadowException e){
        R r = new R();
        r.put("code",e.getCode());
        r.put("msg",e.getMessage());
        return r;
    }

    public R error(){
        R r = new R();
        r.put("code",500);
        r.put("msg","error");
        return r;
    }

    public R data(Object data){
        R r = new R();
        r.put("data",data);
        return r;
    }
}
