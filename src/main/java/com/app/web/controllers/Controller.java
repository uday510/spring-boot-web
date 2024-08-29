package com.app.web.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String home() {
        return "add";
    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam(name="num1", required=false) Integer num1,
//                            @RequestParam(name="num2", required=false) Integer num2,
//                            ModelAndView mv) {
//
//        int result = 0;
//        if (num1 != null && num2 != null) {
//            result = num1 + num2;
//        }
//
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String add(@ModelAttribute("alien") Alien alien) {


       return "result";
    }

    @ModelAttribute("planet")
    public String planetName() {
        return "mars";
    }
}
