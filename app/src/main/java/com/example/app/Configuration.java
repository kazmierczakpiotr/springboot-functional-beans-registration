package com.example.app;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@org.springframework.context.annotation.Configuration
public class Configuration implements ApplicationContextInitializer<GenericApplicationContext> {


    @Override
    public void initialize(GenericApplicationContext context) {
        context.registerBean(Foo.class, Foo::new);
    }
}
