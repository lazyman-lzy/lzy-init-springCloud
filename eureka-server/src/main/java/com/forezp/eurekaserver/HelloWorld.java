package com.forezp.eurekaserver;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
public class HelloWorld {
    @RequestMapping("hello")
    String hello(){
        return "Hello World!";
    }
}

