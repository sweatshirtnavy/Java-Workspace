package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	public Parent() {
	
		
	}

	private int y;

	public Parent(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Parent [y=" + y + "]";
	}
	
	//다형성 적용후 instanceof 연산자를 쓰지 않을 경우 활용방법
	
	public void Parent() {
		System.out.println("");
	}
	
	@Override
	public void print() {
		System.out.println(" ");
	}
}
