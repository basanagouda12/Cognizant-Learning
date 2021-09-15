package com.basu.product;

import com.basu.product.bo.ProductBO;
import com.basu.product.dao.ProductDAO;
import com.basu.product.dao.ProductDAOImpl;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
