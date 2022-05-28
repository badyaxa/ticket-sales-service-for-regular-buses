package com.badyaxa.ticketmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketManagementSystemHomePageController {

    @GetMapping
    public String welcomeMsg() {
        return  "<ul>" +
                "   <li><a href=\"http://127.0.0.1:8080\">Welcome. It is ticket sales service for regular buses</a></li>" +

                "   <li><a href=\"http://127.0.0.1:8088\"><mark><b>Ticket Management System</b></mark></a>" +
                "       <ul>" +
                "           <li><a href=\"http://127.0.0.1:8088/swagger-ui.html\" target=\"_blank\">swagger-ui.html</a></li>" +
                "       </ul>" +
                "   </li>" +

                "   <li><a href=\"http://127.0.0.1:8099\">Payment System</a>" +
                "       <ul>" +
                "           <li><a href=\"http://127.0.0.1:8099/swagger-ui.html\" target=\"_blank\">swagger-ui.html</a></li>" +
                "       </ul>" +
                "   </li>" +
                "</ul>" +

                "<br>" +

                "<a href=\"https://github.com/badyaxa/ticket-sales-service-for-regular-buses/tree/main/ticket-management-system\" target=\"_blank\">github repo</a>";
    }
}
