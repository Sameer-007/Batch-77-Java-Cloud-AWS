package com.wipro.bookstore;

public class Book {

	private String isbn;
	private String bookName;
	private String genre;
	private double price;
	// Book Has A Author
	private Author author;
	public void displayBookDetails() {
		System.out.println("Book Details:");
		System.out.println("Isbn Number " + getIsbn());
		System.out.println("Book Name " + getBookName());
		System.out.println("Genre " + getGenre());
		System.out.println("Price " + getPrice());
		System.out.println("Author Detail");

		Author author = getAuthor();   // private Author author;
		System.out.println("Author Name " + author.getAuthorName());
		System.out.println("Email " + author.getEmail());
		System.out.println("Gender " + author.getGender());
		System.out.println("Mobile " + author.getMobile());

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
