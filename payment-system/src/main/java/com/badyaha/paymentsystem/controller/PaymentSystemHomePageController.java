package com.badyaha.paymentsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentSystemHomePageController {

    @GetMapping
    public String welcomeMsg() {
        return  "<ul>" +
                "  <li><a href=\"http://127.0.0.1:8080\">Welcome. It is ticket sales service for regular buses</a><br></li>" +
                "  <li><a href=\"http://127.0.0.1:8088\">Ticket Management System</a><br></li>" +
                "  <li><a href=\"http://127.0.0.1:8099\"><mark><b>Payment System</b></mark></a></li>" +
                "</ul>" +
                "<br>" +
                "<a href=\"https://github.com/badyaxa/ticket-sales-service-for-regular-buses/tree/main/payment-system\" target=\"_blank\">github repo</a>";
    }
}
