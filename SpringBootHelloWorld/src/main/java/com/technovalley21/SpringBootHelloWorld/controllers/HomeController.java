package com.technovalley21.SpringBootHelloWorld;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring Boot Application");
        return "index";
    }

    @RequestMapping("/subFolder")
    public String subFolder(Model model) {
        model.addAttribute("message", "Spring Boot - Sub Folder");
        return "subfolder/index";
    }
}