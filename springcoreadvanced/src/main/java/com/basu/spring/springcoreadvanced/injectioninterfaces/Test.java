package com.basu.spring.springcoreadvanced.injectioninterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/basu/spring/springcoreadvanced/injectioninterfaces/config.xml");
		 OrderBO bo = (OrderBO) context.getBean("bo");
		 bo.placeOrder();
		
		

	}
 
}
