package com.kh.chap01_poly.view;

import java.util.Scanner;

import com.kh.chap01_poly.controller.LibraryController;
import com.kh.chap01_poly.model.vo.Book;
import com.kh.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름 : ");
		
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gen);
		lc.insertMember(mem);
		
		while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println(lc.myInfo());
			break;
			
		case 2:
			selectAll();
			break;
			
		case 3:
			searchBook();
			break;
			
		case 4:
			rentBook();
			break;
			
		case 9:
			return;
		}
		
		
	}
	
	public void selestAll() {
		Book[] bList = lc.selectAll();
		for(int i =0; i< bList.length; i++) {
			System.out.println(i+"번도서: "+bList[i]);
		}
	}
	
	public void searchBook() {
		sc.nextLine();
		
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i =0; i< searchList.length; i++) {//null
			if(searchList[i] != null) {
			System.out.println(i+"번도서: "+searchList[i]);
			
		
	}
		
	}
	}
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1)
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로");
		}
		
		
	}
	
	

}
