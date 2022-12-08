package com.kh.chap01_network.server.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	/*
	 * 서버의 연결 순서
	 * 1.서버의 소켓 객체 생성
	 * 
	 * 2.클라이언트의 접속 요청 기다림
	 * 3.요청 오면 수락
	 * 4.클라이언트 정보 저장
	 * -:Socket
	 * 5.클라이언트 정보 통해서 outputStream
	 * 6.클라이언트 정보 통해서 inputStream
	 * 7.스트림 통해 입출력
	 * 8.통신 종료
	 * -inpurStream outputStream Socket을 전부 닫아줘야함(close())
	 */
	
	public void serverStart() {
		//0) 포트번호 지정
		// - 0~1023 시스템 포트번호
		// - 1024~65535까지의 포트번호를 사용하는것을 추천
		int port = 30027;
		int clientCnt = 0;
		
		//1)서버의 소켓 객체 생성(아직 생성전)
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//2)클라이언트 접속 요청 대기
		System.out.println("서버시작...");
		
		while(true) {
			//3)접속요청이 오면 요청 수락(accept())후 해당 클라이언트 대한 소켓객체 생성
			//4)클라이언트 정보 저장
			System.out.println("클라이언트 대기중...");
			try {
				Socket client = server.accept();
				System.out.println(++clientCnt + "번째 클라이언트 연결됨...");
			
				//5)6)연결 클라이언트와 입,출력 스트림 생성
				OutputStream os = client.getOutputStream();//클라이언트로 값을 출력하는 스트림
				InputStream is = client.getInputStream();//클라인언트로부터 값을 입력받는 스트림
				
				//5,6_2)보조스트림을 통헤 성능 개선
				//클라이언트로부터 전달된 값을 한줄단위로 읽어들이기위한 입력용 스트림
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				//클라이언트에게 값을 한줄단위로 출력하는 스트림
				PrintWriter pw = new PrintWriter(os, true);//데이터를 출력할때 print(),println()메소드 사용
				//7)스트림을 통해 읽고 쓰기
				while(true) {
					String message = br.readLine();//클라이언트로부터 입력이 있기 전까지 멈춤
					if(message == null || "exit".equals(message)) {
						System.out.println("접속 종료!!");
						
						break;
					}else {
						System.out.println(client.getInetAddress().getHostAddress()+"가 보낸 메시지 : "+ message);
						pw.println("메세지 받기 성공");
						pw.flush();//현재 스트림에 있는 데이터를 강제로 내보내는 메소드 close()메소드 호출되면 자동으로 flush호출
					
				}
				//8)통신종료
				br.close();
				pw.close();
				client.close();
			}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}//Socket ->클라이언트와 통신할수 있는 객체
		}
		
	}

}
