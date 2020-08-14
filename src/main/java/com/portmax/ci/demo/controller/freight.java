package com.portmax.ci.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bill Jiang
 * @Date: 2020/8/14 10:40
 */
@RestController
public class freight {
    @RequestMapping(value = "/")
    public String list() {
        System.out.println("Hello World!");
        return "Freight 20GP 40GP 40HC";
    }
}
