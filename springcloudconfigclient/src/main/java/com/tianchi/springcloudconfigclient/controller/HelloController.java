package com.tianchi.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @Value("${love}")
    private String loveer;

    @RequestMapping(value = "love")
    public String love() {
        try {
            return new String(name.getBytes("ISO8859-1"), "utf-8") + " love " + new String(loveer.getBytes("ISO8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "报错了";
    }
}
