package com.example.emtbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class EmtBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmtBackendApplication.class, args);
    }

}
