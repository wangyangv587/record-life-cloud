package com.shadow.demo.loadproperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类 描 述：spring加载properties文件示例
 * 创 建 人：Shadow
 * 创建时间：2020年10月19日 17时40分49秒
 */
public class LoadPropertiesDemoApplication {

    public static void main(String[] args) {

        //采用xml方式启动
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring.xml");
        User1 user = (User1)context.getBean("user");
        System.out.println(user.getHost());
        System.out.println(user.getPort());

    }
}
