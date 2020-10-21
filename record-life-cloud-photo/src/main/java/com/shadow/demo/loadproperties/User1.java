package com.shadow.demo.loadproperties;

import com.shadow.demo.factorybean.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 类 描 述：要注入的类
 * 创 建 人：Shadow
 * 创建时间：2020年10月19日 17时30分41秒
 */
@Getter
@Setter
public class User1 implements User{

    private String host;

    @Value("${rabbitmq.host}")
    private String port;

}
