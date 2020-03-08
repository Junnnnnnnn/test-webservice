package com.zz.ws.domain;

public class Book {
	private String bookName;
	private int price;
	private String writer;
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", writer=" + writer + "]";
	}
	public Book(String bookName, int price, String writer) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.writer = writer;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
