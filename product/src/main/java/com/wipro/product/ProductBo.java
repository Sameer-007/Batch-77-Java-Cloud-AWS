package com.wipro.product;

// Business Logic for Application - Business Object
public class ProductBo {

	public double discountedPrice(Product product) {
		// product.getId() product.getName() product.getPrice() product.getQuantity()
    	double discount = product.getPrice() - 100;
		return discount;
	}

}
