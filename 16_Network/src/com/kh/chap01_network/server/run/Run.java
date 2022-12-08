package com.kh.chap01_network.server.run;

import com.kh.chap01_network.server.tcp.Server;

public class Run {

	/*
	 * TCP(Transmission control Protocol)
	 * -서버, 클라이언트간의 1:1 소켓 통신
	 * - 데이터를 교환하기에 앞서 서버, 클라이언트 연결되어있어야함(서버가 먼저 실행되면서 클라이언트 요청 기다림)
	 * -신뢰성 있는 데이터 전달 가능
	 * 
	 * ServerSocket
	 * -서버에서 클라이언트 요청을 하면 그 요청을 받을때까지 기다리는 클래스
	 * -사용법:ServerSocket server = new erverSocket server(int portNumber)
	 * -메소드
	 * >Socket client = server.accept() 메소드를 통헤 클라이언트 연결 기다리고 연결 오면 Socket객체 반환
	 * 
	 * Socket
	 * -클라이언트 서버에서 요청하거나 서버네서 클라이언트 요청 받았을때 사용 클래스
	 * -사용법 :Socket socket = new Socket(String IPAddress, int portNumber)
	 * -메소드
	 * >OutputStream out = client.OutputStream()메소드 통해 내보낼수있는 출력스트림
	 * >InputStream in = client.inputStream()데이터 읽을 수 있는 입력스트림
	 */
	public static void main(String[] args) {
		new Server().serverStart();
		

	}

}
