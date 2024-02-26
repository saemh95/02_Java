package edu.kh.todolist.model.dao;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import edu.kh.todolist.model.dto.ToDo;

public class ToDoListDAOImlp implements ToDoListDAO{

//	field
	
//	file
	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	
//	IO
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
//	파일에 IO list
	private List<ToDo> toDoList = null;

	public ToDoListDAOImlp() throws FileNotFoundException, IOException, ClassNotFoundException{
		
//		ToDoList.dat read
//		search for ToDoList.dat
		
		File file = new File(FILE_PATH);
		
		if (file.exists()) {
			
			try {
				
//				객체 입력 스트림을 이용해서 입력받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
//				읽어온 객체를 ArrayList<ToDo> 강제 형변환 (downcasting)
				toDoList = (ArrayList<ToDo>)ois.readObject();
				
			} finally {
				if( ois != null) ois.close();
			}
		} else {
//			폴더,파일 만들기
			File directory = new File("/io_test");
			if(!directory.exists())directory.mkdir();
			
//			객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
			toDoList = new ArrayList<ToDo>();
			
			toDoList.add( new ToDo("자바 공부", "수업 내용 복습하기", false, LocalDateTime.now()));
			toDoList.add( new ToDo("Hi", "say hi", false, LocalDateTime.now()));
			toDoList.add( new ToDo("get food", "ramen", false, LocalDateTime.now()));
			
			try {				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(toDoList); // todoList file 로 출력
				
			} finally {
				if(oos != null)oos.close();
			}
			System.out.println("***TodoList.dat 파일 생성 완료***");

		}
		
	}

	@Override
	public List<ToDo> toDoListFullView() {
		return toDoList;
	}
	
	@Override
	public void saveFile() throws Exception{
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(toDoList);
		} finally {
			oos.close();
		}
		
	}

	@Override
	public ToDo todoListDetailView(int index) {
		
		if (index >= toDoList.size() || index < 0) {
			return null;
		} 
		return toDoList.get(index);
	}

	@Override
	public int todoListAdd(ToDo todo) throws Exception{
		if (toDoList.add(todo)) {
			saveFile();
			return toDoList.size()-1;
		}	
		return -1;
	}

	@Override
	public boolean todoChecked(int index) throws Exception{
		if (index < 0 || index >= toDoList.size()) return false;
		
		boolean complete = toDoList.get(index).isComplete();
		toDoList.get(index).setComplete(!complete);
		saveFile();
		return true;
	}

	@Override
	public boolean todoUpdate(int index, String title, String content) throws Exception{
		
//		if (index < 0 || index >= toDoList.size()) return false;
		ToDo todo = new ToDo(title, content, toDoList.get(index).isComplete(), toDoList.get(index).getRegDate());
		
//		toDoList.get(index).setTitle(title);
//		toDoList.get(index).setDetail(content);
		if(toDoList.set(index, todo) != null) {
			saveFile();
			return true;
		}
		return false;
	}
	
	@Override
	public ToDo todoListDelete(int index) throws Exception{
		
		if (index < 0 || index >= toDoList.size()) return null;
		
		ToDo remove = toDoList.remove(index);
		saveFile();
		return remove;
		
	}

	
	
//	@Override
//	public List<ToDo> todoListDetailView() {
//		return toDoList;
//	}
//	
	
}
