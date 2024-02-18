package com.hw1.model.dto;

public class Textbook extends Book{

//	- subject : String // 과목
	
	private String subject;
	
//	+ Textbook()
//	+ Textbook(String title, String author, String
//	subject)
//	+ displayInfo() : void
	
	public Textbook() {}

	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	

	public String getSubject() {
			return subject;
		}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] " + getTitle() + "/ 저자 : " + getAuthor() + " / " + "과목 : " + subject);
	}
	
}
