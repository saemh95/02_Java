package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ByteService {

	
//	Stream : 데이터가 이동하는 통로 기본적으로 한 방향으로 흐름
//	Byte Stream~~
//	-IO print data per 1byte~~~~
//	-Highest hierarchy : InputStream, OutputStream => this is INTERFACE~~
//	-String, Image, Video, Audio, PDF ~~~~
//	(because 1byte stream it is slow)
	
	
//	VERY EXTREMLY IMPORTANTA
//	IO 관련 코드는 IOException Error veryvery high
//	->almost all method throws IOException~~~~
//	->ALWAYS solve IOException OK?
	
	public void fileByteOutput() {
		
//		FileOutputStream
		FileOutputStream fos = null;
		
		try {
//			fos = new FileOutputStream("");
//			-> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
//			-> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
//			(단, 폴더는 X)
//			-> 기존 파일이 존재하면 내용을 덮어쓰기함
			
//			new FileOutputStream("", true);
//			-> 기존 파일이 존재하면 내용을 이어쓰기
			
			fos = new FileOutputStream("C:\\io_test\\2024022\\byteStream_test.txt");
			
			StringBuilder sb = new StringBuilder();
			sb.append("HELLO WORLD!\n");
			sb.append("10692346\n");
			sb.append("!#@#$%^ㅁㄴ홈ㄴㄹㅇ&*()_\n");
			sb.append("'가나바라다라ㅏㅠㅏㅎ함ㄶ하하'\n");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
			
			String content = sb.toString();
			
//			출력 방법 1 : 한 글자(2byte) 씩 파일로 출력
//			->2byte 범주의 문자는 1byte 기반 스트림 통과시
//			데이토 손실이 발생해서 글자가 깨짐
			
//			for (int i=0; i<content.length();i++) {
//				
//				char ch = content.charAt(i);
//				fos.write(ch);
//				
//			}
			
//			System.nanoTime() : 1970.01.01 09:00:00 부터
//			현재 시간까지 차이를 ns(nano second 단위)로 반환
//			ms(milisecond) == 1/1000sec
//			us(microsecond) == 1/1000ms
//			ns(nanosecond) == 1/1000us
			
			long startTime = System.nanoTime();
			
//			출력 방법 2 : String을 byte[]변환 후 출력
			fos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			System.out.println("수행시간 : " + (endTime - startTime));
			
			fos.flush(); //스트림안에 남아있는 모든 데이터를 모두 밀어냄
			System.out.println("출력 완료");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void bufferedFileByteOutput() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
//		동영상 쟁생 중에 미리
//		앞에 재생될 부분을 다운받아놔서
//		영상을 끊김없이 볼 수 있게 함
//		-> 다운받아서 저장해놓는 공간 == buffer
		
		try {
//			bos = new FileOutputStream("");
//			-> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
//			-> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
//			(단, 폴더는 X)
//			-> 기존 파일이 존재하면 내용을 덮어쓰기함
			
//			new FileOutputStream("", true);
//			-> 기존 파일이 존재하면 내용을 이어쓰기
			
			fos = new FileOutputStream("C:\\io_test\\2024022\\byteStream_test.txt");
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("HELLO WORLD!\n");
			sb.append("10692346\n");
			sb.append("!#@#$%^ㅁㄴ홈ㄴㄹㅇ&*()_\n");
			sb.append("'가나바라다라ㅏㅠㅏㅎ함ㄶ하하'\n");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
//			sb.append("ASgdhOMG LET ME OUT");
			
			String content = sb.toString();
			
//			출력 방법 1 : 한 글자(2byte) 씩 파일로 출력
//			->2byte 범주의 문자는 1byte 기반 스트림 통과시
//			데이토 손실이 발생해서 글자가 깨짐
			
//			for (int i=0; i<content.length();i++) {
//				
//				char ch = content.charAt(i);
//				bos.write(ch);
//				
//			}
			
//			System.nanoTime() : 1970.01.01 09:00:00 부터
//			현재 시간까지 차이를 ns(nano second 단위)로 반환
//			ms(milisecond) == 1/1000sec
//			us(microsecond) == 1/1000ms
//			ns(nanosecond) == 1/1000us
			
			long startTime = System.nanoTime();
			
//			출력 방법 2 : String을 byte[]변환 후 출력
			bos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			System.out.println("수행시간 : " + (endTime - startTime));
			
			bos.flush(); //스트림안에 남아있는 모든 데이터를 모두 밀어냄
			System.out.println("출력 완료");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
	public void fileByteInput() {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("C:\\io_test\\2024022\\lyrics_test.txt");
//			방법 1) 파일 내부 내용을 1byte씩
//			byte hard to use -> convert to int
			
			int value = 0; // convert to int
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); //1byte stream
//				더이상 읽어올 값이 없으면 -1
				if(value == -1) break;
				sb.append((char)value);
			}
			System.out.println(sb.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileByteInput2() {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("C:\\io_test\\2024022\\lyrics_test.txt");
//			방법 2) 파일에 저장된 모든 byte 값을 다 읽어
//			byte[] 으로 반환받아
//			->use byte[] to create String type
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void bufferedFilesByteInput() {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("C:\\io_test\\2024022\\lyrics_test.txt");
			bis = new BufferedInputStream(fis);

			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileCopy () {
		
//		파일 내용 읽어오가
		
		BufferedReader br = null; //문자열 입력용
		
		FileInputStream fis = null; // 파일 입결
		BufferedInputStream bis =null; //입력 보조
		
		FileOutputStream fos = null; // 파일 출력
		BufferedOutputStream bos = null; //출력 보조
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일 경로 입력 : ");
			String target = br.readLine(); //입력된 1줄 읽어오기
			File file = new File(target);
			
			if (!file.exists()) {
				System.out.println("해당 경로에 파이이 존재하지 않음");
				return;
			}
			
//			targer 이 가리키는 파일을 입력받을수 있도록
//			입력용 스트링 생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
//			출력할 파일의 경로 + _copy가 붙은 파일 이름 create
//			target : C:\\io_test\\2024022\\lyrics_test.txt
//			copy : C:\\io_test\\2024022\\lyrics_tes_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); 
//			int String.lastIndexOf("String")
//			-String 뒤에서부터 검색해서  "String" == return index;
//			없으면 -1 return;
			
			int insterPoint = target.lastIndexOf(".");
			sb.insert(insterPoint, "_copy");
			
			String copy = sb.toString(); // 복사할 파일의 경로
			
//			출력용 스트림
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
//			읽어왔던 내용 
			bos.write(bytes);
			bos.flush(); //스트림 남아있는 data push
			
			System.out.println("복사완료 : " + copy);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( br != null ) {
					br.close();
				} 
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
