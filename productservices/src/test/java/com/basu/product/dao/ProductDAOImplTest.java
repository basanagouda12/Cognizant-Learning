package com.basu.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.basu.product.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Its aqsome");
		product.setPrice(1000);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Iphone", result.getName());;
	}

}
