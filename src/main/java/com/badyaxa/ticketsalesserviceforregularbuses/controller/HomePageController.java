package com.badyaxa.ticketsalesserviceforregularbuses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping
    public String welcomeMsg() {
        return  "<ul>" +
                "  <li><a href=\"http://127.0.0.1:8080\"><mark><b>Welcome. It is ticket sales service for regular buses</b></mark></a><br></li>" +
                "  <li><a href=\"http://127.0.0.1:8088\">Ticket Management System</a><br></li>" +
                "  <li><a href=\"http://127.0.0.1:8099\">Payment System</a></li>" +
                "</ul>" +
                "<br>" +
                "<a href=\"/swagger-ui.html\" target=\"_blank\">swagger-ui</a>" +
                "<br>" +
                "<br>" +
                "<a href=\"https://github.com/badyaxa/ticket-sales-service-for-regular-buses\" target=\"_blank\">github repo</a>";
    }
}
