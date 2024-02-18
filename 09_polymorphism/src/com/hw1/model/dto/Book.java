package com.hw1.model.dto;

public abstract class Book {

//	- title : String // 제목
//	- author : String // 저자
	
	private String title;
	private String author;
	
//	+ Book()
//	+ Book(String title, String author)
//	+ abstract displayInfo() : void
	
	public Book() {}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public abstract void displayInfo();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
}
