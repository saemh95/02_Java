package edu.kh.io.pack3.model.service;

import java.io.*;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

//	ObjectInputStream
//	ObjectOutputStream
	
//	byte 기반 "보조"Stream
//	직렬화 (Serializable)
//	-객체를 직선 형태로 변환
	
	public void objectOutput() {
		
//		객체를 외부 파일로 출력
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		BufferedOutputStream bos = null;
		
		try {
		
			fos = new FileOutputStream("/io_test/2024022/Member.dat");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			oos.writeObject(member);
//			bos.write(null);
			
			System.out.println("회원 출력 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null)
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void objectInput() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("/io_test/2024022/Member.dat"); 
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			long startTime = System.nanoTime();
//			System.out.println(startTime);
			
//			byte[] bytes = fis.readAllBytes();
//			String content = new String(bytes);
			Member member = (Member)ois.readObject();
			
			long endTime = System.nanoTime();
			System.out.println(endTime - startTime);
//			17386800/19034100/18414700
//			17299900/16891500/18580200
			
			System.out.println(member);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
