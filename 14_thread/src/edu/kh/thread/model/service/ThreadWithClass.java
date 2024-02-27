package edu.kh.thread.model.service;


public class ThreadWithClass extends Thread{

	public void run() {
		
//		thread 수행할 정의
		
		for(int i=1;i<=10;i++) {
			System.out.println("thread : " + i);
			
			try {
				Thread.sleep(1000);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
