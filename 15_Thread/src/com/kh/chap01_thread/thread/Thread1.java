package com.kh.chap01_thread.thread;

//스레드 생성방법
/*
 * 1.Thread클래스 상속 받는 방법
 * -Thread클래스 상속후에 run()메소드 오버라이딩
 * -Thread객체를 생성 후 start()메소드 호출
 */

public class Thread1 extends Thread {
	
	/*
	 * 스레드 실행시 Run메소드 호출됨
	 * 따라서 작업하고자 하는 코드를 반드시 Run메소드 안에 재정의 해줘야한다
	 * 즉, Thread클래스 안에 있는 Run메소드를 재정의 해줘야한다
	 * 
	 */
	
	@Override
	public void run() {
		//내가 작업할 코드 작성
		
		for(int i = 1; i<=100; i++) {
			System.out.println(getName()+"["+i+"]");
			//getName() : 스레드의 이름 반환, 순차적으로 Thread-0, Thread-2,3..이름 붙는다
		}
	}

}
