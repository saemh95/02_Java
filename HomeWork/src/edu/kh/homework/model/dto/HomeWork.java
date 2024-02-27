package edu.kh.homework.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class HomeWork implements Serializable{

	private String title;
	private boolean done;
	private LocalDateTime regDate;
	private String detail;
	private int important;
	
	public HomeWork() {
		
	}
	
	public HomeWork(String title, boolean done, LocalDateTime regDate, String detail, int important) {
		super();
		this.title = title;
		this.done = done;
		this.regDate = regDate;
		this.detail = detail;
		this.important = important;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getImportant() {
		return important;
	}

	public void setImportant(int important) {
		this.important = important;
	}

	@Override
	public String toString() {
		return "Title : " + title + ", Status : " + done + ", Registerd Date : " + regDate + ", Detail : " + detail
				+ ", Importance : " + important;
	}

	@Override
	public int hashCode() {
		return Objects.hash(detail, done, important, regDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeWork other = (HomeWork) obj;
		return Objects.equals(detail, other.detail) && done == other.done && important == other.important
				&& Objects.equals(regDate, other.regDate) && Objects.equals(title, other.title);
	}
	
	
	
	
}
