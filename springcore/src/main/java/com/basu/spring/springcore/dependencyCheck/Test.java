package com.basu.spring.springcore.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basu/spring/springcore/dependencyCheck/setconfig.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		
		System.out.println(prescription);
		
		

	}

}
