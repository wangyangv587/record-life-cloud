package com.shadow.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 类 描 述：mybatis-plus配置
 * 创 建 人：Shadow
 * 创建时间：2020年10月02日 13时17分
 */
@Configuration
@MapperScan("com.shadow.*.dao")
public class MybatisPlusConfig {
}
