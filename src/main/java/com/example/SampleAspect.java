package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class SampleAspect {
  @Before("@annotation(CustomAnnotation)")
  public void beforeServiceMethodExecution(JoinPoint joinPoint) {
    System.out.println(joinPoint);
    System.out.println(
      Arrays.toString(
        ((MethodSignature) joinPoint.getSignature()).getParameterNames()
      )
    );
  }
}
