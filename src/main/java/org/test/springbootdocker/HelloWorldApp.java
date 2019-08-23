package org.test.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApp {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World. This is a message out of a Docker container running Spring Boot with Java. The second time!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }

}