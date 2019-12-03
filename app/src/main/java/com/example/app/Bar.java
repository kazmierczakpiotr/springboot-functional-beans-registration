package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bar {

    private final Foo foo;

    @Autowired
    public Bar(Foo foo) {
        this.foo = foo;
    }
}
