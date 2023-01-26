package kz.esbolganov.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @Controller
    public class HelloController {

        @GetMapping("/hello-world")
        public String sayHello() {
            return "hello_world";
        }
    }
}