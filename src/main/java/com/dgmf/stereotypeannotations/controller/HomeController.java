package com.dgmf.stereotypeannotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String hello() {
        return "Hello Controller";
    }
}
