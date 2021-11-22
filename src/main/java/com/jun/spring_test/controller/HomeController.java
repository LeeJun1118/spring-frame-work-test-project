package com.jun.spring_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    @GetMapping("/") 둘다 된다.
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("data","Hello");
        return "index";
    }
}
