package com.example.sweetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SweetsController {

    @GetMapping("/")
    public ModelAndView allSweets(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sweets");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }
}
