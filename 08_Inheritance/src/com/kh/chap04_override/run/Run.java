package com.kh.chap04_override.run;

import com.kh.chap04_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 모든 클래스는 object클래스의 후손이다. 즉, 최상위 클래스는 항상 object
		 * => 즉, Objectdp에 있는 모든 메소드들은 다! 가져다 쓸 수 있음
		 * 	  맘에 들지 않으면 오버라이딩에서 재정의 가능
		 */
		
		Book bk = new Book("수학의 정석","민경민",7000);
		
		/*
		 * 출력문 안에 레퍼런스 변수를 제시해서 출력하고자 할때
		 * 내부적으로 JVM이 자동으로 toString()메소드를 호출함
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()
		 * 해당 래퍼런스탕비의 풀클래스명 + @ + 해당객체의 주소값의 16진수
		 * 
		 * 자식클래스의 Book클래스애서 toString()메소드를 재정의
		 * 해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려주는 메소드로 재정의
		 * 
		 */
		
		System.out.println(bk);
		// 메소드 변경전
		// com.kh.chap04_override.model.vo.Book@53bd815b
		// 메소드 변경후
		// 책 제목 : 수학의 정석, 책 저자 : 민경민, 책 가격 : 7000

	}

}
