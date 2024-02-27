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
				case 2 : viewHw();
				break;
				case 3 : updateHw();
				break;
				case 4 : deleteHw();
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
		System.out.println("\n----------[Select Menu]----------");
		System.out.println("\n----------1. Create New Homework ----------");
		System.out.println("\n----------2. View all Homework ----------");
		System.out.println("\n----------3. Update Homework ----------");
		System.out.println("\n----------4. Delete Homework ----------");
		System.out.println("\n----------0. Exit ----------");
		System.out.print("\nSelect Menu >>>>>>>>> ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		
		return input;
	}
	
	
	private void createHw() {

		System.out.println("------------1. Create New Homework------------");
		
		
		
	}

	private void viewHw() {
		System.out.println("------------2. View all Homework------------");
		Map<String, Object> map = service.viewHw();
		
		List <HomeWork> hw = (List<HomeWork>)map.get("hwList");
		int checkedCount = (int)map.get("checked");
		
		System.out.printf("Homework List View / done [%d / %d]\n", checkedCount, hw.size());
		
		for (int i=0, len = hw.size(); i<len; i++) {
			
			String title = hw.get(i).getTitle();
			String done = hw.get(i).isDone() ? "Y" : "N";
			String detail = hw.get(i).getDetail();
			int important = hw.get(i).getImportant();
			String regDate = service.dateFormat(hw.get(i).getRegDate());
			System.out.println("[ " + i + " No ]" + "Title : " + title + " / Done : " + done + " / Detail : " + detail + " / Important : " + important + " / Created Date : " + regDate);
		}
		System.out.println();
		
	}

	private void updateHw() {
		// TODO Auto-generated method stub
		
	}

	private void deleteHw() {
		// TODO Auto-generated method stub
		
	}

	
	
}
