package com.scm.smartContactManager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @GetMapping("/hom")
    public String home() {
        System.out.println("Welcome on our home page");
        return "home";
    }
    
}
