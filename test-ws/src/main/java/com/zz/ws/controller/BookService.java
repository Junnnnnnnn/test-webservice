package com.zz.ws.controller;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.zz.ws.domain.Book;

@WebService
public class BookService {
	@WebMethod
	@WebResult(name="returnVal")
	public List<Book> sayHello(@WebParam(name="userName")String userName) {
		List<Book> res=new ArrayList<Book>(5);
		res.add(new Book(userName,12,"jkjks"));
		res.add(new Book(userName+"33",13,"jkjks333"));
		res.add(new Book(userName+"44",18,"jkjks444"));
		return res;
	}

}
