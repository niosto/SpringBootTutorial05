package com.example.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Welcome to Spring");
        model.addAttribute("Subtitle", "An Spring Boot Eafit App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About Us");
        model.addAttribute("description", "This is an about page...");
        model.addAttribute("author", "Nicolas Ospina");
        return "home/about";
    }

    @GetMapping("/contact")
    public String contac(Model model){
        model.addAttribute("title", "Contact - Online Store");
        model.addAttribute("phone", "310 590 84 79");
        model.addAttribute("email", "pringaos602@gmail.com");
        model.addAttribute("address", "Groove Street, 17 in front of CJ");
        return "home/contact";
    }
}
