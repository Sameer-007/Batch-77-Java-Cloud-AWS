package com.wipro.store;

public class ProductService {
	
	public Product searchProductDetails(Product[] productList, int searchKey) {
		for (Product product : productList) {
			if (searchKey == product.getId()) {
				return product;
			}
		}
		return null;
	}

	// Complete problem /// Connect @11.10am

}
