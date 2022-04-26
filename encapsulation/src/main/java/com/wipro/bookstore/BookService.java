package com.wipro.bookstore;

// Service / BO(Business Object) - Do all Business Logic 
public class BookService {

	// CalCulate the Discount Price

	public double calculateDiscountPriceForBook(Book book) {

		double price = book.getPrice();
		double discount = price - (price * 0.25);
		return discount;
	}

	public double calculateDiscountPriceForBook(Book book, double percentage) {

		double price = book.getPrice();
		double discount = price - (price * percentage);
		return discount;
	}
}
