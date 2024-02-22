package edu.kh.io.pack1.model.service;


import java.io.*;
import java.text.SimpleDateFormat;
public class FileService {

	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *  
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *  
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	
//	[개발자 상식]
//	OS : 운영체제
//	(Windopw) / (Linux, Mac)
//	folder    /  directory
//	-경로 표기 방법(하위 폴더, 파일표시)
//	(/)       / (/)
	
//	-Java 언어의 특징 : 플랫폼(OS)에 독립적
	
//	-> OS 관계 없이 또같은 코드 작성 가능
//	-> 이 특징을 유지하기 위해 \,/ 둘다 호환 가능
//	(런타임 시 실행되는 OS에 맞게 자동으로 변경)
	
//	- 경로 표기 방법
	
//	1) 절대 경로 : 하나의(절대적인) 기준으로부터  목표까지 경로를 모두 표기
//	C:/workspace/02_Java/12_IO/src
//	-기분
//	[Widnows] : C:/ or D:/
//	[Linux, Mac] : /User, /
	
//	2) 상대 경로 : 현재 위치를 기죽으로 목표까지 경로를 모두 표기
//	../workspace
	
	/**
	 * file class -> 객체
	 * + folder X then create new folder
	 */
	public void method1() {
		
//		제일앞 "/" = 최상위 폴더 == root
//		C:/io_test/20240222 폴더를 지정
		File directory = new File("/io_test/2024022");
//		-> 처음 : 존재하지 않는폴더를 관리하는 File 객체 생성
		
		System.out.println("존재 여부 확인 : " + directory.exists());
		
		if (!directory.exists() ) {
			directory.mkdirs();
			System.out.println(directory.getName());
			System.out.println(directory.getPath());
		}
		System.out.println(directory.getName());
		System.out.println(directory.getPath());
		
	}
	
	/**
	 * File 객체를 이용해서
	 * 지정된 위치에 파일 생성하기
	 */
	public void method2() {
//		문자열에서 "\"표기방법 : "\\"
		File file = new File("\\io_test\\2024022\\test.txt");
		try {
			
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println(file.getName() + "파일이 생성됨");
					
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	/**
	 * File class method
	 */
	public void method3() {
		
		File directory = new File("\\workspace\\02_Java\\12_IO");
		
//		bring all files from director to File[]
		File files[] = directory.listFiles();
		
		for (File file : files) {
			
			String fileName = file.getName();
//			System.out.println(fileName);
			long updateDate = file.lastModified();
//			System.out.println(updateDate);
//			System.out.println(file.toString());
//			SimpleDateFormat
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			String time = sdf.format(updateDate);
//			System.out.println(time);
			
			String type = null;
			if (file.isFile()) type = "파일";
			else type = "폴더";
			
			String size = file.length() + "B";
			if (file.isDirectory()) size = "";
			
			String result = String.format("%-20s %-20s %-5s %10s", fileName, time, type, size);
			System.out.println(result);
		}
		
	}
	public void test() {
		File directory =new File ("C:\\workspace\\01_Webfront");
		File files[] = directory.listFiles();
		
		for (File file : files) {
			String fileName = file.getName();
			long update = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			String date = sdf.format(update);
			System.out.println(fileName);
			System.out.println(date);
		}
	}
	
	
	
	
}
