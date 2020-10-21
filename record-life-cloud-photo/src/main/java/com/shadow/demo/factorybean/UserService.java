package com.shadow.demo.factorybean;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 类 描 述：
 * 创 建 人：Shadow
 * 创建时间：2020年10月19日 17时19分03秒
 */
@Component
@Scope("singleton")
public class UserService implements SmartFactoryBean {

    @Autowired
    private User user;

    public void test(User user) {
        System.out.println(user);
    }

    @Override
    public Object getObject() throws Exception {
        return new User2();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public boolean isEagerInit() {
        return true;
    }
}
