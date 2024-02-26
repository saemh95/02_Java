package edu.kh.todolist.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

// dto (data transfer object) : 값 전달용
// vo (value object) :객채 == object
public class ToDo implements Serializable{

	private String title;
	private String detail;
	private boolean complete;
	private LocalDateTime regDate;
	
//	LocalDateTime : 날짜, 시간 나타내는 class
//	LocalDateTime.now();
	
	
//	contsructor
	public ToDo() {
		
	}

	public ToDo(String title, String detail, boolean complete, LocalDateTime regDate) {
		super();
		this.title = title;
		this.detail = detail;
		this.complete = complete;
		this.regDate = regDate;
	}

//	getter/setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

//	to string
	@Override
	public String toString() {
		return "ToDo [title=" + title + ", detail=" + detail + ", complete=" + complete + ", regDate=" + regDate + "]";
	}
	
	
}
