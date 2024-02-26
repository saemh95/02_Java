package edu.kh.todolist.model.service;

import java.time.LocalDateTime;
import java.util.Map;

import edu.kh.todolist.model.dto.ToDo;

// Service : data 가공 / buisness logic
public interface ToDoListService {
	/**
	 * Todolist List 
	 * @return todoList + completed
	 */
	public Map<String, Object> toDoListFullView();

	public String dateFormat(LocalDateTime regDate);

	public String todoListDetailView(int index);
	
	public int todoListAdd(String title, String content) throws Exception;

	public boolean todoChecked(int index) throws Exception;

	public boolean todoUpdate(int index, String title, String content) throws Exception;

	public String todoListDelete(int index) throws Exception;
}
