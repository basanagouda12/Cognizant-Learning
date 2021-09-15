package com.basu.spring.springcoreadvanced.injectioninterfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("inside OrderDAOimpl2 createOrder()");

	}

}
