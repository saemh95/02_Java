package edu.kh.thread.model.service;

public class ThreadWithRunnable implements Runnable{

	@Override
	public void run() {
		
//		Thread thread = new Thread();
		
//		Runnable interface : solves using one class for inheritance
		for (int i=1;i<=20;i++) {
			System.out.println("HELLO " + i);
			
			try {
				Thread.sleep(500);
//				thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
}
