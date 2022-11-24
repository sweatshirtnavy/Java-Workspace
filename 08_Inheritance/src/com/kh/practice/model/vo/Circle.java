package com.kh.practice.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String information() {
		return super.information()+" radius : "+radius;
	}
	

}
