package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");//circleMenu();
		System.out.println("2. 사각형");//rectangleMenu();
		System.out.println("9. 끝내기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: circleMenu(); break;
		case 2: rectangleMenu(); break;
		case 9: return;
			default: System.out.println("잘못 입력했습니다. 다시 입력해주세요");
		}
		
	}
	}
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원둘레");
		System.out.println("2.원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: calcCircum(); break;
		case 2: calcCircle(); break;
		case 9:
		default : return;
		}
	}
		
	

	public void rectangleMenu() {
		while(true) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 둘레");
		System.out.println("3. 메인으로");
		System.out.println("메뉴번호 : ");
		int(num) =sc.nextInt();
		
		switch(num) {
		case 1: calcPerimeter(); break;
		case 2: calcPestArea(); break;
		case 3:
		default: return;
			}
		}
	
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.CalcCircum(x, y, radius));
		
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
		
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
		
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
	

}
	
