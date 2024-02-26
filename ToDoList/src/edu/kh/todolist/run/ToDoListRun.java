package edu.kh.todolist.run;

import edu.kh.todolist.view.ToDoListView;

public class ToDoListRun {

	public static void main(String[] args) {
		
		System.out.println("<<<<<<<<<<<< Start Program >>>>>>>>>>>>");
		
//		프로젝트 흐름
//		Run <-> View <-> Service <-> DAO <-> DB(File)
		
		ToDoListView view = new ToDoListView();
		view.startView();
	}
	
}
