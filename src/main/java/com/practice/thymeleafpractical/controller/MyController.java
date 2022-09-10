package com.practice.thymeleafpractical.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Dhwaj");
        return "about";
    }

    // handling iteration
    @GetMapping("/iterate")
    public String iterateHandler(Model m) {
        List<String> names = List.of("Ankit", "Laxmi", "Dhwaj", "Sharma");
        m.addAttribute("names", names);
        return "iterate";
    }

    // handler for conditional statements
    @GetMapping("/condition")
    public String conditionalHandler(Model m) {
        int age = 20;
        m.addAttribute("isActive", "true");
        return "condition";
    }

    // handler for including
    @GetMapping("/service")
    public String servicesHandler(Model m) {

        return "service";
    }
}
