package edu.kh.todolist.model.dao;

import java.util.List;

import edu.kh.todolist.model.dto.ToDo;

// dao (data access object)
// 데이터가 저장된 파일/DB/외부 장치에 접근하는 역할
public interface ToDoListDAO {

	List<ToDo> toDoListFullView();

	ToDo todoListDetailView(int index);

	int todoListAdd(ToDo todo) throws Exception;
	
	void saveFile() throws Exception;

	boolean todoChecked(int index) throws Exception;

	boolean todoUpdate(int index, String title, String content) throws Exception;

	ToDo todoListDelete(int index) throws Exception;

//	List<ToDo> todoListDetailView();

}
