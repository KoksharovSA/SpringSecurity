package ru.gb.SpringSecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class WebController {
    @GetMapping("/publicData")
    public String publicPage(){
        return "publicData";
    }

    @GetMapping("/privateData")
    public String privatePage(){
        return "privateData";
    }
    @GetMapping("/loginPage")
    public String loginPage(){
        return "loginPage";
    }

//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
}
