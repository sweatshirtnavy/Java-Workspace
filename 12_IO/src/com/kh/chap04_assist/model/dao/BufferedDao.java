package com.kh.chap04_assist.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader / BufferedWriter
	
	//프로그램 --> 파일
	public void fileSave() {
		
		BufferedWriter bw = null;
	
		
		try {
			/*
			 * 1. 기반 스트림(FileWriter) 객체 먼저 생성
			 * 보조 스트림도 Reader / Writer 계열이면 기반 스트림도 Reader / Writer
			 * 보조 스트림도 Input / Output 계열에 맞게 기반 스트림도 Input / Output 계열
			 */
			
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕하세요.");
			bw.newLine();
			bw.write("안녕하세요. \n");
			bw.write("안녕히 가세요.");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally
		try {
		bw.close();
		}
		
	}

////try ~ with ~ resource 구문 (jdk 7
//
//try(스트림 객체 생성; ){
//	//예외가 발생할수 있는 구문
//}catch(예외클래스명 e) {
//	//예외발생시 실행할 구문
//}
//
//스트림 객체를 try(여기)에 넣어버리면
//스트림객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원 반납
}
