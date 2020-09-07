package com.ekml.soln.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("course", "Soln");
        return "index";
    }
}
