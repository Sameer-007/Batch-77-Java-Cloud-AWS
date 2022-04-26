package com.wipro.product;


public class App 
{
    public static void main( String[] args )
    {
        
    	Product mobile =new Product(1, "Mobile", 25000, 10);
    	
    	ProductBo productBo=new ProductBo(); 
    	System.out.println("Product Details Before Discount");
    	mobile.displayProductDetails();
    	
     	double discount=productBo.discountedPrice(mobile);
    	mobile.setPrice(discount);
    	System.out.println("Product Details After Discount");
    	mobile.displayProductDetails();
  	
    	
    }
}
