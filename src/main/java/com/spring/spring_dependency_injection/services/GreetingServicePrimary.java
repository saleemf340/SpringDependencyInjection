package com.spring.spring_dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greeting from primary service";
    }
}
