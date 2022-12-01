package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		//java.io.File 클래스를 가지고 간단하게 파일 만드는 과정 실습
		
			//1. 별도의 경로 지정을 하진 않고 파일명(test.txt)만 제시해서 생성=>경로는 현재 디렉토리
		try {
			File file1 = new File("test.txt");
			file1.createNewFile();
		
			//2. 경로 지정을 한 파일명(C:\\aaa\\test.txt)을 제시해서 생성하기 => 이때 존재하는 경로를 제시
			File file2 = new File("C:\\aaa\\test.txt");
			file2.createNewFile();
			
			//3. 폴더를 생성하고나서 그 안에 파일을 생성하는 방법
			String dir = "C:\\bbb";
			File bbbFolder = new File(dir);
			if(!bbbFolder.isDirectory()) {
				bbbFolder.mkdir(); //makeDirectory
				
			}
			
			File file3 = new File(dir+"\\bbb\\test.txt");
			file3.createNewFile();
			
			//4. 별도의 경로 지정 없이 폴더 생성 후 파일 생성하기 => 프로젝트폴더 내에 생성될것.
			File folder = new File("test");
			folder.mkdir();
		
			File file = new File("test\\person.text");
			file.createNewFile();
			
			//File에서 제공하는 메소드들
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
			
			System.out.println("파일명 : "+file.getName());
			System.out.println("상위폴더 : "+file.getParent());
			System.out.println("파일용량 : "+file.length());
			System.out.println("절대경로 : "+file.getAbsolutePath());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램 상의 데이터를 외부매체 (모니터, 스피커, 자바프로그램, 파일 등등)로 출력하서나 입력장치(키보드, 마우스 등)로
		 * 입력받는 과정을 진행하고자 한다면 반드시 외부매체의 통로를 만들어야한다. ->통로 == 스트림
		 * 
		 * 스트림의 특징 :
		 * - 단방향 : 입력이면 입력, 출력이면 출력
		 * 			입력,출력용 스트림이 따로 존재
		 * 			동시에 입출력하고자 한다면 하나의 스트림으로 불가능
		 * 
		 * -선입선출 (FIFO) 먼저 전달한 값이 먼저 나오게됨
		 * -시간지연 문제가 발생할 수 있다
		 * 
		 * 스트림의 구분
		 * -통로의 사이즈
		 * 		바이트 스트림 : 1byte짜리가 이동할수있을 정도의 사이즈(좁은통로) => 입력(XXXInputStream)/출력(XXXOutputStream)
		 * 		문자 스트림: 2byte짜리가 이동할 수 있을 정도의 사이즈 (넓은톨로) => 입력(XXXReader) /출력(xxxWriter)
		 * 
		 * -외부매체와의 직접적인 연결여부
		 * 	기반스트림: 외부매체와 직접적으로 연결되는 통로
		 * 	보조스트림: 기반스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림(직접적으로 외부매체와 연결할수 없음 즉 단독사용이 불가)
		 * 			(보조해주는 기능 : 속도향상, 자료형 변환,객체단위의 입출력 보조)
		 * 			단 보조스트림은 단독적으로 사용이 불가능함으로 반드시 외부매체에 직접적으로 연결가능한 기반스트림과 사용
		 */
		

	}

}
