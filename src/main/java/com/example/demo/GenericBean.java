package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GenericBean<T> {
    public T someReturn(T t) {
        System.out.println(this);
        return t;
    }
}
