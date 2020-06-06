package com.example.training.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;

@Aspect
@Component
public class CustomAdvice {

	@Before("execution(* com.example.training.service.*.*(..))")
	public void beforeAdviceForTransferMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.beforeAdviceForServicerMethods() " + jp.getSignature().getName());
	}

}
