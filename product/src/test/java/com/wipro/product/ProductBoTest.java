package com.wipro.product;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductBoTest {

	Product product1;
	Product produtc2; // try
	ProductBo productBo;
	
	@Before
	public void setUp() {
		product1=new Product(1, "Laptop", 35000.50, 100);
		productBo=new ProductBo();
	}
	
	@Test
	public void getDiscountedPriceForProduct() {
	 // product1.getPrice()  - 35000.50 - 100 => 34900.50 
     double discountedPrice = productBo.discountedPrice(product1);
     assertEquals(34900.50, discountedPrice,2);
     
	}
		
	@After
	public void tearDown() {
		product1=null;
		productBo=null;
	}

}
