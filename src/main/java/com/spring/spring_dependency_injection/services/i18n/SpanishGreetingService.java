package com.spring.spring_dependency_injection.services.i18n;

import com.spring.spring_dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Mundo -ES";
    }
}
