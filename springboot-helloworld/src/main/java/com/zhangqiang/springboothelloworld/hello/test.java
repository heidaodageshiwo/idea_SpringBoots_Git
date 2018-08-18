package com.zhangqiang.springboothelloworld.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/hello")
    public String say(){
        return "say";
    }
}
