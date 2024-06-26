package com.spring.spring_dependency_injection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class My18NControllerTestES {

    @Autowired
    My18NController myi18NController;

    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}