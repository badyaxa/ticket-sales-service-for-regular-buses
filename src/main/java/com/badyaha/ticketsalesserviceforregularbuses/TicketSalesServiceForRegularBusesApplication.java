package com.badyaha.ticketsalesserviceforregularbuses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TicketSalesServiceForRegularBusesApplication {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = SpringApplication.run(TicketSalesServiceForRegularBusesApplication.class, args);
        System.out.println("------------------------start---------------------------");
		displayAllBeans();
		System.out.println("------------------------end---------------------------");
	}

    public static void displayAllBeans() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}
