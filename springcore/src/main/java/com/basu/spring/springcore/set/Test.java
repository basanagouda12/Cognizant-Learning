package com.basu.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basu/spring/springcore/set/setconfig.xml");
		CarDealer car = (CarDealer) context.getBean("cardealer");
		
		System.out.println(car.getName());
		System.out.println(car.getModels());

	}

}
