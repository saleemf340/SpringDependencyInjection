package com.spring.spring_dependency_injection.controllers;

import com.spring.spring_dependency_injection.services.GreetingService;
import com.spring.spring_dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im in the controller");
        return greetingService.sayGreeting();
    }
}
