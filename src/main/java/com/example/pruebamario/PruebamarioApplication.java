package com.example.pruebamario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PruebamarioApplication {

    @RequestMapping("/")
    String suma(){
        return "Holiiiii i love aleman";
    }

    public static void main(String[] args) {
        SpringApplication.run(PruebamarioApplication.class, args);
    }

}
