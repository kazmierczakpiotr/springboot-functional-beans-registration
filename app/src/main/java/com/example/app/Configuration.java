package com.example.app;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@org.springframework.context.annotation.Configuration
public class Configuration implements ApplicationContextInitializer<GenericApplicationContext> {


    @Override
    public void initialize(GenericApplicationContext context) {

        Foo foo = new Foo();
        Bar bar = new Bar(foo);

        context.registerBean(Foo.class, () -> foo);
        context.registerBean(Bar.class, () -> bar);
    }
}
