package com.cloudstation.javaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Books API", version = "1.0", description = "Books Information"))
public class JavaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaExampleApplication.class, args);
    }
}