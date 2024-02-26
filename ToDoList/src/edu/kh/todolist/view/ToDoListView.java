package edu.kh.todolist.view;

import java.io.*;
import java.util.*;


import edu.kh.todolist.model.dto.ToDo;
import edu.kh.todolist.model.service.ToDoListService;
import edu.kh.todolist.model.service.ToDoListServiceImpl;

// View : what user see (print/keybord input)
// UI
public class ToDoListView {

//	field
	private BufferedReader br = null; // keybord input (reference variable)
	private ToDoListService service = null; // service (reference variable)
	
//	constructor
	public ToDoListView() {
		
//		객체 생성시 발생되는 예외를 여기서 모아서 저리할 예정
		
		try {
			service = new ToDoListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} //finally {
//			try {
//				if ( br != null ) br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		
//		
//	}
	
		
	}	

	public void startView () {
		int input = 0;
		do {
			try {
				
				input = selectMenu();
				
				switch(input) {
				case 1 : todoListFullView(); break;
				case 2 : todoListDetailView(); break;
				case 3 : todoListAdd(); break;
				case 4 : todoListChecked(); break;
				case 5 : todoListUpdate(); break;
				case 6 : todoListDelete(); break;
				case 0 : System.out.println("------------Program Exit------------");break;
				default : System.out.println("-----------Select Only 0~6-----------\n");
				
				}
				System.out.println("-------------------------------------");
				
				
				
				
			} catch (NumberFormatException e) {
				System.out.println("Select Only Numbers");
				input = -1;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} while(input != 0);
	}
	
	
	public int selectMenu() throws NumberFormatException, IOException, Exception {
		
		System.out.println("\n------------ Todo List ------------\n");
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo List Detail View");
		System.out.println("3. Todo List Add");
		System.out.println("4. Todo List Checked");
		System.out.println("5. Todo List Update");
		System.out.println("6. Todo List Delete");
		System.out.println("0. Exit");
		
		System.out.print("Select menu number >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		
		return input;
		
	}
	
	private void todoListFullView() {

		System.out.println("\n------------ [1. Todo List Full View] ------------\n");
		
//		todoList + completed ->get
//		List          int
		
		Map<String, Object> map = service.toDoListFullView();
		
		List <ToDo> todoList = (List<ToDo>)map.get("todoList");
		int checkedCount = (int)map.get("checked");
		
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
				, checkedCount, todoList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %12s   %9s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = todoList.size(); i < len; i++) {
		
			String title = todoList.get(i).getTitle();
			
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			
			String regDate = service.dateFormat(todoList.get(i).getRegDate());
			
			System.out.printf("[%3d  ]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}
	}

	private void todoListDetailView() throws Exception{
		System.out.println("\n------------ [2. Todo List Detail View] ------------\n");
		System.out.print("Index number : ");
		String input = br.readLine();
		int index = Integer.parseInt(input);
		String detail = service.todoListDetailView(index);
		
		
		if(detail==null) {
			System.out.println("Invalid index number");
			return;
		}
		System.out.println(detail);
		
	}	
//		Map<String, Object> map = service.todoListDetailView();
//		List <ToDo> todoList = (List<ToDo>)map.get("view");
		
//		String view = (String)map.get("view");
//		String detail = (String)map.get("detail");
//		try {
//			
//			for (int i=0, len = todoList.size(); i < len; i++) {
//				
//				if (index >= 0 && index < todoList.size()) {
//					ToDo selectedItem = todoList.get(index);
//					System.out.println("Title : " + selectedItem.getTitle());
//					System.out.println("Date : " + selectedItem.getRegDate());
//					System.out.println("Date : " + selectedItem.isComplete());
//					
//					System.out.println("----------");
//					System.out.println("[Details]");
//					System.out.println(detail);
//				} else {
//					System.out.println("Invalid index number");
//				}
//			}
//					
//		} catch (NumberFormatException e) {
//			System.out.println("please enter a valid index number");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	

	private void todoListAdd() throws Exception{
		System.out.println("\n------------ [3. Todo List Add] ------------\n");
		System.out.print("Title : ");
		String title = br.readLine();
		System.out.print("press '!wq' to end\n");
		System.out.println("Detail : ");
//		String detail = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			
			String content = br.readLine();
			if(content.equals("!wq")) break;
			sb.append(content);
			sb.append("\n");
			
		}
		System.out.println("-------------------------------------");
		
	
		int index = service.todoListAdd(title, sb.toString());
		
		if (index == -1) {
			System.out.println("List add failed");
			return;
		
		}
		
	}

	private void todoListChecked() throws Exception {
		 
		System.out.println("\n------------ [4. Todo List Checked] ------------\n");
		System.out.print("Index Number to complete : ");
		String input = br.readLine();
		int index = Integer.parseInt(input);
		
		boolean result = (boolean)service.todoChecked(index);
		if(result) {			
			System.out.println("--------------Completed--------------\n");
		} else {
			System.out.println("Index Number invalid\n");
		}
	}

	private void todoListUpdate() throws Exception{

		System.out.println("\n------------ [5. Todo List Update] ------------\n");
		System.out.print("Index Number to update : ");
		String input = br.readLine();
		int index = Integer.parseInt(input);
		
		String result = service.todoListDetailView(index);; 
		
		if(result == null) {
			System.out.println("Invalid index number");
			return;
		}
		
		System.out.println("\n------------Before Update------------\n");
		System.out.println(result);
		System.out.println("\n-------------------------------------\n");
		
		System.out.print("Title : ");
		String title = br.readLine();
		System.out.print("press '!wq' to end\n");
		System.out.println("Detail : ");
//		String detail = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			
			String content = br.readLine();
			if(content.equals("!wq")) break;
			sb.append(content);
			sb.append("\n");
			
		}
		System.out.println("-------------------------------------\n");
		
		boolean result1 = service.todoUpdate(index, title, sb.toString());
		if (result1) {
			System.out.println("--------------Completed--------------\n");
		}
	}

	private void todoListDelete() throws Exception{
		System.out.println("\n------------ [5. Todo List Delete] ------------\n");
		System.out.print("Index Number to Delete : ");
		String input = br.readLine();
		int index = Integer.parseInt(input);
		
		
		String remove = service.todoListDelete(index);
		
		if(remove == null) System.out.println("Invalid index number");
		else System.out.printf("[%s] Todo list removed\n", remove);
	}

	


}
