package com.spring.spring_dependency_injection.controllers.i18n;

import com.spring.spring_dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class My18NController {
    final private GreetingService greetingService;

    public My18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
