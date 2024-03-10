package com.example

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

@Aspect
@Component
class SampleAspect {
  @Before("@annotation(CustomAnnotation)")
  void beforeServiceMethodExecution(JoinPoint joinPoint) {
    println joinPoint
    println Arrays.toString(((MethodSignature) joinPoint.getSignature()).getParameterNames() as String[])
  }
}
