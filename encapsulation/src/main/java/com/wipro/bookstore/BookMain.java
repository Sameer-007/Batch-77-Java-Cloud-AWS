package com.wipro.bookstore;

public class BookMain {
	
	public static void main(String[] args) {
		BookService bookService=new BookService();
		Author author=new Author();
		author.setAuthorName("Sathish G");
		author.setEmail("sathish.g@stackroute.in");
		author.setGender("Male");
		author.setMobile(956259956);
		
		Book book=new Book();
		book.setBookName("Java Programming");
		book.setGenre("Technology");
		book.setIsbn("JAVA1234");
		book.setPrice(300);
		
		// Book Has A Author
		book.setAuthor(author);
		book.displayBookDetails();
		
		System.out.println("---Book Details After Discount---");
		double discountPrice=
				bookService.calculateDiscountPriceForBook(book,0.20);
		book.setPrice(discountPrice);
		book.displayBookDetails();
		
	}

}
