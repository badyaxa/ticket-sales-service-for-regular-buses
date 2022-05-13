package com.badyaha.ticketsalesserviceforregularbuses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping
    public String welcomeMsg() {
        return "Welcome. It is ticket sales service for regular buses";
    }
}
