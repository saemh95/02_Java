package edu.kh.network.server.model.service;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerService {

//	TCP Socket programming
	
//	TCP 
//	-server , client 1:1 socket network
//	-client can connect if server is running
	
	public void serverStart() {
		
//		port 0~65535
//		port 0~1023 probable is alreadt in use
		int port = 9000;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			serverSocket = new ServerSocket(port);
			
			System.out.println("<Server>");
			System.out.println("Recieving connection from Client \n <please wait>");
			
			clientSocket = serverSocket.accept();
			
			System.out.println("<Connected>");
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			br = new BufferedReader(new InputStreamReader(is));
//			String based BufferedReader -> byte based InputStream
//			need InputStreamReader to connect each other
			
			pw = new PrintWriter(os);
			
//			send message from server to client
			
//			2024년 02월 27일 10:32:21 [Confirmed connection to server]
			
			Date now = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			String str = sdf.format(now) + " [Confirmed connection to server]";
			
			pw.println(str);
//			print from server to client
			pw.flush();
			
//			Server -> Client message sent
			
			String clientMessage = br.readLine();
			System.out.println(clientMessage);
			
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println(clientIP);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Message sending to Client : ");
			String str2 = sc.nextLine();
			
			pw.println(str2);
			pw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (pw != null) pw.close();
				if (serverSocket != null) serverSocket.close();
				if (clientSocket != null) clientSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
