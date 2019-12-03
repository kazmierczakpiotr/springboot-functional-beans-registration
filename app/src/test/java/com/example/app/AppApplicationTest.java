package com.example.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class AppApplicationTest {

    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {

        assert null != context.getBean(Configuration.class);
        assert null != context.getBean(Foo.class);
        assert null != context.getBean(Bar.class);
    }
}
