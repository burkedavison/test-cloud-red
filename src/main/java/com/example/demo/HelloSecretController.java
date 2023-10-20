package com.example.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloSecretController {
    @Value("${sm://petclinic-db-password}")
    String greeting;

  @GetMapping("/")
  public String hello() {
    return greeting + " World!";
  }
    
}
