package com.spring.spring_dependency_injection.services;

import org.springframework.stereotype.Service;

@Service("PropInjectService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property injection";
    }
}
