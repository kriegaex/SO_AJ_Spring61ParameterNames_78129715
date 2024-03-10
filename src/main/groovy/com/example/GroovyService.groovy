package com.example

import org.springframework.stereotype.Service

@Service
class GroovyService {
  @CustomAnnotation(projectIdParameter = "projectId", userIdParameter = "#userEntity.id")
  void doSomething(int foo, String bar, Object zot) {
    println "Doing something in Groovy service method"
  }
}
