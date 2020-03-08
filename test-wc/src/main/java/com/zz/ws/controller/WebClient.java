package com.zz.ws.controller;

import java.util.List;

public class WebClient {
	public static void main(String[] args) {
		BookService s=new BookServiceService().getBookServicePort();
		List<Book> res=s.sayHello("张三");
		
		for(Book b:res) {
			System.out.println(b);	
		}
	}
}
