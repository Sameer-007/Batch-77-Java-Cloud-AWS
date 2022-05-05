package com.wipro.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	public static void main(String[] args) {
		ProductService service=new ProductService();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println( " --- Product App Store ---");
			System.out.println("Enter Number of Produts");
			int noOfProduct = Integer.parseInt(reader.readLine());
			Product[] productList = new Product[noOfProduct];
			for (int i = 0; i < noOfProduct; i++) {
				Product product = new Product();
				System.out.println("Product " + (i + 1));
				System.out.println("Enter Id");
				product.setId(Integer.parseInt(reader.readLine()));
				System.out.println("Enter Name");
				product.setName(reader.readLine());
				System.out.println("Enter Price");
				product.setPrice(Double.parseDouble(reader.readLine()));
				System.out.println("Enter Quantity");
				product.setQuantity(Integer.parseInt(reader.readLine()));
				productList[i] = product;
			}
			System.out.println("Produt Details");
			for (Product product : productList) {
				System.out.println(product);
			}
			System.out.println("Enter Product Id to Search");
			int key = Integer.parseInt(reader.readLine());
			Product product = service.searchProductDetails(productList, key);
			if (product == null) {
				throw new ProductNotFoundException("Product Id " + key + " is not found");
			} else {
				System.out.println(product.getId() +"--"+product.getName());
			}

		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("Enter Corret Input");
		} catch (IOException e) {

		}

	}
}
