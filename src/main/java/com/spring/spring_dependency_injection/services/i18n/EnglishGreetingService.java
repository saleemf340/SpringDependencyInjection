package com.spring.spring_dependency_injection.services.i18n;

import com.spring.spring_dependency_injection.services.GreetingService;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there -EN";
    }
}
