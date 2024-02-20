package com.hw3.run;

import com.hw3.model.dto.Book;
import com.hw3.model.service.*;
public class Run {

	public static void main(String[] args) {
		
		Book book = new Book();
		BookService service = new BookService();
		
		service.displayMenu();
	}
	
}
