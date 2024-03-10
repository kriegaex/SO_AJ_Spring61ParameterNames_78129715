package com.example;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
  @CustomAnnotation(projectIdParameter = "projectId", userIdParameter = "#userEntity.id")
  public void doSomething(int foo, String bar, Object zot) {
    System.out.println("Doing something in service method");
  }
}
