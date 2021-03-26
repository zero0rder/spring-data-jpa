package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProfileRepository profileRepository) {
        return args -> {

            // Look into Faker object
            Profile jessie = new Profile(
                    "Jessie",
                    "Warnock",
                    22,
                    "M",
                    "Accountant"
            );

            profileRepository.save(jessie);
        };
    }

}
