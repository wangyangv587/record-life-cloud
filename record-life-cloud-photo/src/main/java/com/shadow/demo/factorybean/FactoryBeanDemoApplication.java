package com.shadow.demo.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 类 描 述：FactoryBean示例
 * 创 建 人：Shadow
 * 创建时间：2020年10月19日 17时40分49秒
 */
public class FactoryBeanDemoApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.shadow.demo.factorybean");
        //取getObject方法返回的对象，这样可以动态指定返回的bean，如mybatis里面的mapper
        System.out.println(applicationContext.getBean("userService"));
        //取原生的bean
        System.out.println(applicationContext.getBean("&userService"));

    }
}
