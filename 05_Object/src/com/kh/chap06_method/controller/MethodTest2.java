package com.kh.chap06_method.controller;

public class MethodTest2 {
	//필드부
	static int count = 80;  
		   int count2 = 0;
	/*
	 * static 메소드
	 * [표현법]
	 * 접근제한자 static(예약어) 반환형 메소드명(매개변수) {
	 *  수행내용
	 * 	return 반환값;
	 * }
	 * 
	 * - 호출시 객채 생성할 필요가 없음
	 * - 프로그램 시작시에 정적 메모리 영역에 메소드가 저장되어 있을것이기 떄문.
	 * - 클래스명.메소드명(전달값);으로 호출이 가능.
	 * - 예약어, 매개변수, return은 생략 가능함.
	 * 
	 * 
	 */
	
	//메소드부
	public static void method1() {
		System.out.println("매개변수와 반환값이 없는메소드입니다.");
	}
	
	public static String method2() {
		
		return "매개변수는 없고요, 반환값은 있는메소드입니다.";
	}
	
	public static void method3(String name, int age) {
		
		System.out.println(age+"살의"+name+"님 환영합니다. ^^");
	}
	
	public static int method4(int num1) {
		// * / - + %
		/*
		 * static메소드안에서는 static이 아닌 field멤버가 접근이 불가능하다.
		 * 스태틱 메소드는 프로그램 시작시 정적메모리영역에 들어가게되는데 
		 * 이떄, 스태틱으로 선언된 필드(전역변수)도 함께 정적메모리 영역에 들어갈것.
		 * 하지만 스태틱으로 선언되지 않은 전역변수는 스태틱메모리에 롤라가는 시점에 사용이 불가능하므로 에러가 발생함.
		 */
		
		//static 메소드에는 static필드만 사용이 가능하다.
		return num1 * count;
		
	}
}
