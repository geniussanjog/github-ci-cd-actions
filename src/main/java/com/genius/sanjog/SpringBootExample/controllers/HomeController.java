package com.genius.sanjog.SpringBootExample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping ("/home")
    @ResponseBody
    public String home(){
        return "HOME CONTROLLER FIRED OF SPRING BOOT APP";
    }
}
