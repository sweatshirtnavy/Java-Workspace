package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu{

	public void mainMenu() {
		while(true) {
		
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : "); 
		int num = Integer.parseInt(sc.nextLine());
		 //잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		switch(num) {
		case 1 : fileSave(); break;
		case 2 : fileOpen();
		case 3 : fileEdit();
		case 9 : System.out.println("프로그램을 종료합니다.");
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();


	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = sc.nextLine();
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it라고 입력하면 종료됩니다");
			System.out.println("내용 : ");
			String str = sc.nextLine();
					if(str.equals("ex끝it")) {
						break;
					}
			sb.append(str + "\n");
		}
		while(true) {
			
		}
		System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
		String file = sc.nextLine();
		if(fc.checkName(file)) {//file이라는 이름이 이미 존재하는 경우
			System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
			char yes = sc.nextLine().charAt(0);
			if(yes == 'y' || yes == 'Y') {//덮어씌우기
				fc.fileSave(file, sb);
			}else {//이어쓰기
				System.out.println("파일명을 다시 입력해주세요.");
				continue;
			}
			
		}else {//file의 파일명이 없는 경우
			fc.fileSave(file, sb);
			
		}
		break;
	}
//		파일에 저장할 내용을 입력하세요.
//		ex끝it 이라고 입력하면 종료됩니다.
//		내용 : 
//		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
//		 
		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김

	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {//파일이 있음
		System.out.println(fc.fileOpen(file)));
		}else { //파일이없음
			System.out.println("없는 파일입니다.");
		}

	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {//파일이 있는 경우
			
		}else {//파일 없는 경우
			System.out.println("없는 파일입니다.");
			
		}
		

	}
	

}


