package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    GenericBean<String> genericBean;

    @Autowired
    GenericBean<Integer> genericInteger;

    @GetMapping("check")
    public String check() {
        return genericBean.someReturn("checked");
    }

    @GetMapping("check-int")
    public int checkInt() {
        return genericInteger.someReturn(10);
    }
}
