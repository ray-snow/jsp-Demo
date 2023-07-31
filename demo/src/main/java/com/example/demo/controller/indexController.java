package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class indexController {
    @GetMapping("/jspPage")
    public String jspPage() {
        return "index";
    }

    @GetMapping("/jspPage2")
    public ModelAndView jspPage2() {
        return new ModelAndView("index");
    }
}
