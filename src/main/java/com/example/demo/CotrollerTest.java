package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/home")
public class CotrollerTest {

    @RequestMapping
    public String bemvindo() {
        return "Bem vindo";
    }

}
