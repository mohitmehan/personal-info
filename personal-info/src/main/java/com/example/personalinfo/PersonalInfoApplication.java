package com.example.personalinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Personal Info Spring WebFlux application.
 */
@SpringBootApplication
public class PersonalInfoApplication {
    /**
     * Starts the Spring Boot application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(PersonalInfoApplication.class, args);
    }
} 