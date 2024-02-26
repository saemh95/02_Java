package edu.kh.io.pack4.model.service;

import java.io.*;
public class CharacterService {

	public void fileInput() {
		
		FileReader fr = null;
//		FileWriter fw = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("/io_test/2024022/lyrics_test.txt");
			br = new BufferedReader(fr);
			String content = null;
			
			while(true) {
				content = br.readLine();
				if(content == null) break;
				System.out.println(content);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOutput() {
		
		FileWriter fr = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();
		
		sb.append("하하하허허허허호호홓\n");
		sb.append("hahahahhohohohuhuhu\n");
		sb.append("1234556789\n");
		sb.append("!@#$%^&*(\n");
		
		String content = sb.toString();
		
		try {
			
			fr = new FileWriter("/io_test/2024022/filewriter_test", true);
			bw = new BufferedWriter(fr);
			
			
			bw.write(content);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
