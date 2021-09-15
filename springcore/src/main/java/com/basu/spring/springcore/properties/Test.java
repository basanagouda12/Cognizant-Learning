package com.basu.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basu/spring/springcore/properties/mapconfig.xml");
		CuntryAndLanguage cuntryAndLanguage = (CuntryAndLanguage) context.getBean("cuntryAndLangs");
		
		System.out.println(cuntryAndLanguage);

	}

}
