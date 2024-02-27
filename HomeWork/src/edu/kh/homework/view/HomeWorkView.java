package edu.kh.homework.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import edu.kh.homework.model.dto.HomeWork;
import edu.kh.homework.model.service.HomeWorkService;
import edu.kh.homework.model.service.HomeWorkServiceImpl;

public class HomeWorkView {

	private BufferedReader br = null;
	private HomeWorkService service = null;
	
	public HomeWorkView() {
		
		try {	
			service = new HomeWorkServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
	}
	
	public void startMenu() {
		int input = 0;
		
		do {
//			CRUD가 전부 포함될 것
			try {
				input = selectMenu();
				
				
				switch (input) {
				case 1 : createHw();
				break;
				case 2 : System.out.println(viewHw());
				break;
				case 3 : updateHw();
				break;
				case 4 : deleteHw();
				break;
				case 5 : sortByImportance();
				break;
				case 6 : completeHw();
				break;
				case 0 : System.out.println("------------Exit program------------");
				break;
				default : System.out.println("------------Select only from 0~6------------");
				break;
				
				}
				
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Invalid input please retry");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (input != 0);
	}
	

	public int selectMenu() throws Exception{
		System.out.println("\n---------- [Select Menu] ----------");
		System.out.println("\n---------- 1. Create New Homework ----------");
		System.out.println("\n---------- 2. View all Homework ----------");
		System.out.println("\n---------- 3. Update Homework ----------");
		System.out.println("\n---------- 4. Delete Homework ----------");
		System.out.println("\n---------- 5. View List by Importance ----------");
		System.out.println("\n---------- 6. Complete Homework ----------");
		System.out.println("\n---------- 0. Exit ----------");
		System.out.print("\nSelect Menu >>>>>>>>> ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		
		return input;
	}
	
	
	public void createHw() throws Exception{

		System.out.println("------------1. Create New Homework------------");
		
		System.out.print("[Title] : ");
		String title = br.readLine();
		System.out.print("[Detail] : ");
		String detail = br.readLine();
		System.out.print("[Important] : ");
		String important = br.readLine();
		int input = Integer.parseInt(important);
		
		int index = service.createHw(title, detail, input);
		
	}
	
	public String viewHw() {
		System.out.println("------------ 2. View all Homework ------------");
		Map<String, Object> map = service.viewHw();
		
		List <HomeWork> hw = (List<HomeWork>)map.get("hwList");
		int checkedCount = (int)map.get("checked");
		
		System.out.printf("Homework List View / done [%d / %d]\n", checkedCount, hw.size());
		StringBuilder sb = new StringBuilder();
		for (int i=0, len = hw.size(); i<len; i++) {
			
			String title = hw.get(i).getTitle();
			String done = hw.get(i).isDone() ? "Y" : "N";
			String detail = hw.get(i).getDetail();
			int important = hw.get(i).getImportant();
			String regDate = service.dateFormat(hw.get(i).getRegDate());
			String result = "[ " + i + " No ]" + "Title : " + title + " / Done : " + done + " / Detail : " + detail + " / Important : " + important + " / Created Date : " + regDate;
			sb.append(result + "\n");
		}
		return sb.toString();
		
	}
	public String viewHw(int index) {
		Map<String, Object> map = service.viewHw();
		
		List <HomeWork> hw = (List<HomeWork>)map.get("hwList");
		String result = "";
		for (int i=0, len = hw.size(); i<len; i++) {
			
			String title = hw.get(index).getTitle();
			String done = hw.get(index).isDone() ? "Y" : "N";
			String detail = hw.get(index).getDetail();
			int important = hw.get(index).getImportant();
			String regDate = service.dateFormat(hw.get(index).getRegDate());
			result = "[ " + index + " No ]" + "Title : " + title + " / Done : " + done + " / Detail : " + detail + " / Important : " + important + " / Created Date : " + regDate;
		}
		return result;
		
	}

	public void updateHw() throws Exception{
		 System.out.println("------------ 3. Update Homework ------------");
		 System.out.print("\nIndex Number to Update >>> ");
		 String input = br.readLine();
		 int index = Integer.parseInt(input);
		 String inputResult = viewHw(index);
		 
		 if (inputResult == null) {
			 System.out.println("Invalid Index Number");
			 return;
		 }
		 
		 System.out.println("\n------------ Before ------------\n");
		 System.out.println(inputResult);
		 System.out.println("\n--------------------------------\n");
		 System.out.print("[Title] : ");
		 String title = br.readLine();
		 System.out.print("[Important] : ");
		 String important = br.readLine();
		 int inputImp = Integer.parseInt(important);
		 System.out.println("press ':wq' to finish");
		 System.out.print("[Detail] : ");
		 
		 StringBuilder sb = new StringBuilder();
		 while (true) {
			 String detail = br.readLine();
			 if (detail.equals(":wq")) break;
			 sb.append(detail + " ");
			 
		 }
		System.out.println("");
		 
		boolean result = service.updateHw(index, title, sb.toString(), inputImp);
		 
		if (result) {
			System.out.println("\n------------ Completed ------------\n");
		}
		 
	}

	public void deleteHw() throws Exception{
		 System.out.println("------------ 4. Delete Homework ------------");
		 
//		 String list = viewHw();
		 
		 
		 String list = service.deleteHw();
		 System.out.println("\n------------ List ------------\n");
		 System.out.println(list);
		 System.out.println("------------------------------");
		 
		 System.out.print("\nIndex Number to Delete >>> ");
		 String input = br.readLine();
		 int index = Integer.parseInt(input);
		 
		 String delete = service.deleteHw(index);
		 
		 if (delete == null) System.out.println("\nInvalid Input Number");
		 else System.out.println("Deleted");
		
	}

	public void sortByImportance() {

		System.out.println("------------ 5. View List by Importance ------------");
		
		String importance = service.sortByImportance();

		System.out.println(importance);
	}
	
	
	public void completeHw() throws Exception{
		System.out.println("------------ 6. Complete Homework ------------");
		System.out.print("\nIndex Number to Complete >>> ");
		String input = br.readLine();
		int index = Integer.parseInt(input);
		
		boolean completed = (boolean)service.completeHw(index);
		if (completed) {
			System.out.println("\n------------ Completed ------------\n");
		} else {
			System.out.println("Invalid Index Number\n");
		}
	}

	
}
