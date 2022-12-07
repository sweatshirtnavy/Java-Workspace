package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.scheduling.Car;
import com.kh.chap02_scheduling.scheduling.Plane;
import com.kh.chap02_scheduling.scheduling.Tank;

public class Run {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		//우선순위 변경전
		//스레드는 기본적으로 1~10의 우선순위중 5의 우선순위를 가지고 있습니다
		//메모리가 모자랄때 우선순위를 정할수 있음
		//스레드위 우선순위를 정하지 않으면 OS(운영체제)임의로 수행
		System.out.println("------ 우선순위 변경 전 ------");
		System.out.println(Thread.currentThread().getName()+"의 우선순위"+Thread.currentThread().getPriority());
		System.out.println(t1.getName()+"의 우선순위 : "+t1.getPriority());
		System.out.println(t2.getName()+"의 우선순위 : "+t2.getPriority());
		System.out.println(t3.getName()+"의 우선순위 : "+t3.getPriority());
		
		//setPriority() :우선순위를 지정해주는 메소드
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setPriority(Thread.MAX_PRIORITY); // 10
		
		System.out.println("------ 우선순위 변경 후 ------");
		System.out.println(Thread.currentThread().getName()+"의 우선순위"+Thread.currentThread().getPriority());
		System.out.println(t1.getName()+"의 우선순위 : "+t1.getPriority());
		System.out.println(t2.getName()+"의 우선순위 : "+t2.getPriority());
		System.out.println(t3.getName()+"의 우선순위 : "+t3.getPriority());
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * 메인 스레드가 종료되더라도 수행중인 스레드사 하나라도 있다면 프로세스는 종료되지 않는다
		 * 해결책 : start()시키기 전에 우선순위ㅡ 주종관계 설정
		 * 
		 * 주종관계 설정
		 * main스레드가 종료시 다른스레드도 종료시키기 위해서 반드시 setDaemon사용
		 * 주의점은 스레드중 한개라도 setDaemon으로 설정시 스레드에 setDaemon설정
		 */
		
		System.out.println("메인 스레드의 끝부분");
		//시작 순서는 우선순위와 다를 수 있지만 종료 순서는 우선순위(priority)가 높은순으로 끝나게 됨(항상그렇지 않음)
		
		
	}

}
