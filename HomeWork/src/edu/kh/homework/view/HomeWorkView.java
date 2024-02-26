package edu.kh.homework.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Invalid input please retry");
			}
		} while (input != 0);
	}
	
	
	
}
