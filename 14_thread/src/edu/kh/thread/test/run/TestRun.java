package edu.kh.thread.test.run;

import edu.kh.thread.model.service.ThreadWithClass;
import edu.kh.thread.model.service.ThreadWithRunnable;

public class TestRun {

	public static void main(String[] args) {
		
//		비동기적 작업
//		network connection [IO]
		ThreadWithClass run = new ThreadWithClass();
		run.start();
		
//		ThreadWithRunnable run2 = new ThreadWithRunnable();
//		run2.run();
		
		Thread thread = new Thread(new ThreadWithRunnable());
//		please pronounce correctly 러너블O 런에이블X
		thread.start();
		
	}
	
}
