package com.zz.ws;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zz.ws.controller.BookService;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Endpoint.publish("http://localhost:8888/server",new BookService());
	}
	
} 
