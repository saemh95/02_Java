package com.hw1.model.dto;

public class Novel extends Book{

//	- genre : String // 장르
	
	private String genre;
	
//	+ Novel()
//	+ Novel(String title, String author, String genre)
//	+ displayInfo() : void
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("[소설] 제목 : " + getTitle() + "/ 저자 : " + getAuthor() + "/ 장르 : " + genre);		
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
