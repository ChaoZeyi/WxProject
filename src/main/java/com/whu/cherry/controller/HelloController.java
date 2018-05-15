package com.whu.cherry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cherry
 * @date 2018/5/12 16:17
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";
    }
}
