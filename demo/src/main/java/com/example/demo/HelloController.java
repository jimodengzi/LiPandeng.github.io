package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static void main(String[] args) {
        System.out.println("helloworld");
    }
    @RequestMapping("/hi")
    public String index(){
        return "hi sb";
    }
}
