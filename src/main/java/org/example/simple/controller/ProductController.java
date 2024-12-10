package org.example.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class ProductController {
    @GetMapping("/hello")
    public void helloWorld() {
        System.out.println(".............");
        System.out.println("commit 2 ");


    }
}