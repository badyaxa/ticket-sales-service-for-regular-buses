package com.badyaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("payment-system Hello world!");
        SpringApplication.run(PaymentSystem.class, args);
        System.out.println("------------------------start---------------------------");

        System.out.println("------------------------end---------------------------");
    }
}