package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class DemoApplication {
    @GetMapping("/")
    public String message(Principal principal){
        return "Hi " + principal.getName() + " Welcome to nguyen tien dong yeu hoang thi bich hong";

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
