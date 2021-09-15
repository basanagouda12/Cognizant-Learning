package com.basu.product.bo;

import com.basu.product.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);
}
