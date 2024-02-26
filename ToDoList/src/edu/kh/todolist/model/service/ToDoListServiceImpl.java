package edu.kh.todolist.model.service;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import edu.kh.todolist.model.dao.ToDoListDAO;
import edu.kh.todolist.model.dao.ToDoListDAOImlp;
import edu.kh.todolist.model.dto.ToDo;

public class ToDoListServiceImpl implements ToDoListService{

//	field
	private ToDoListDAO dao = null; 
	
	public ToDoListServiceImpl() throws Exception {
		
//		ToDoListServiceImpl 객체가 생성될때
//		ToDoListDAOImple 객체 생성
		dao = new ToDoListDAOImlp();
		
		
		
	}

	@Override
	public Map<String, Object> toDoListFullView() {
		
//		1) todolist <- DAO
		List<ToDo> toDoList = dao.toDoListFullView();
//		2) checked -> ture -> count
		int checkedCount = 0;
		
		for (ToDo todo : toDoList) {
			if (todo.isComplete()) {
				checkedCount++;
			}
		}
		Map <String, Object> todoListMap = new HashMap<String, Object>();
		
		todoListMap.put("todoList", toDoList);
		todoListMap.put("checked", checkedCount);
		
		return todoListMap;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String formattedDateTime = regDate.format(formatter);
		
		return formattedDateTime;
	}
	
//	@Override
//	public Map<String, Object> todoListDetailView() {
//		
//		List<ToDo> toDoList = dao.todoListDetailView();
//		List<String> detailView = new ArrayList<String>();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		
//		for (int i=0;i<toDoList.size();i++) {
//			
//			for (ToDo todo : toDoList) {
//				String title = "Title : " + todo.getTitle();
//				todo.getRegDate().format(formatter);
//				String regDate = "Date : " + todo.getRegDate();
//				String checked = "Completed : " + todo.isComplete();
//				detailView.add(title);
//				detailView.add(regDate);
//				detailView.add(checked);
//				
//			}
//			
//		}
//		String detail = toDoList.isEmpty() ? "Empty" : toDoList.get(toDoList.size() - 1).getDetail();
//		Map <String, Object> detailMap = new HashMap<String, Object>();
//		detailMap.put("view", detailView);
//		detailMap.put("detail", detail);
//		
//		
//		return detailMap;
//		
//	}

	@Override
	public String todoListDetailView(int index){
		
		ToDo todo = dao.todoListDetailView(index);
		
//		2. 반환받은 todo가 null 인경우에 null 반환
		
		
		if (todo == null) return null;
		StringBuilder sb = new StringBuilder();
		sb.append("------------------------------------\n");
		sb.append(String.format(" Title : %s\n ", todo.getTitle()));
		sb.append(String.format("Date : %s\n ", dateFormat(todo.getRegDate())));
		sb.append(String.format("Completed : %s\n ", todo.isComplete() ? "O" : "X"));
		sb.append("------------------------------------\n");
		sb.append(String.format("[Detail]\n %s", todo.getDetail()));
		
		return sb.toString();
	}
	
	@Override
	public int todoListAdd(String title, String content) throws Exception{
		
		ToDo todo = new ToDo(title, content, false, LocalDateTime.now());
		
		int index = dao.todoListAdd(todo);
		return index;
		
	}
	
	@Override
	public boolean todoChecked(int index) throws Exception{
		return dao.todoChecked(index);
	}

	@Override
	public boolean todoUpdate(int index, String title, String content) throws Exception{
		return dao.todoUpdate(index, title, content);
	}
	
	@Override
	public String todoListDelete(int index) throws Exception{
		
		ToDo remove = dao.todoListDelete(index);
		if(remove == null) return null;
		
		return remove.getTitle();
		
	}
	
}
