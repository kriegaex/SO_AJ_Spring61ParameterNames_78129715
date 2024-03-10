package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    try (ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args)) {
      applicationContext.getBean(SampleService.class).doSomething(11, "dummy", new Integer(42));
      applicationContext.getBean(GroovyService.class).doSomething(11, "dummy", new Integer(42));
    }
  }
}
