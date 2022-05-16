package com.badyaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketManagementSystem {
    public static void main(String[] args) {
        System.out.println("ticket-management-system Hello world!");
        SpringApplication.run(TicketManagementSystem.class, args);
        System.out.println("------------------------start---------------------------");

        System.out.println("------------------------end---------------------------");
    }
}