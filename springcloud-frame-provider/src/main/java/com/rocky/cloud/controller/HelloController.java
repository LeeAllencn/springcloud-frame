package com.rocky.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rocky on 2017-09-08.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}
