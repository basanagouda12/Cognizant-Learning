package com.basu.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.basu.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("Inside Before calling method");
	}

	@After("execution(* com.basu.spring.springaop.ProductServiceImpl.multiply(..))")
	public void LogAfter(JoinPoint joinPoint) {

		System.out.println("after the method invocation");
	}
}
