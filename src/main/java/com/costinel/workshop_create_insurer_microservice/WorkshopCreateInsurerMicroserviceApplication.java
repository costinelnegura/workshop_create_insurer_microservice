package com.costinel.workshop_create_insurer_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.costinel.workshop_create_insurer_microservice.repo")
public class WorkshopCreateInsurerMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopCreateInsurerMicroserviceApplication.class, args);
    }

}
