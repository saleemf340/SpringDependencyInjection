package com.spring.spring_dependency_injection;

import com.spring.spring_dependency_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

}
