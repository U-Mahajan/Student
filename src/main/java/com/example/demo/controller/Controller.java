package com.example.demo.controller;

import com.sun.source.tree.ReturnTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/data")
    public String data() {
        return "Data";
    }
}
