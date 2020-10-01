package com.shadow.photo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年09月29日 17时51分53秒
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class
,scanBasePackages = {"com.shadow.common","com.shadow.photo"})
public class PhotoBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(PhotoBootstrap.class);
    }
}
