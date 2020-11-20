package com.fh.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("demo")
@RestController
public class Demo {

    @RequestMapping("test")
    public String test(){
        return "success";
    }
}
