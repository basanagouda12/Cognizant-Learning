package com.basu.spring.springcoreadvanced.injectioninterfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	
	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO createOrder");
	}

}
