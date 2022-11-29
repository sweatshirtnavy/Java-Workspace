package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker;
	
	public SmartPhone() {
		
		
	}
	
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", toString()=" + super.toString() + "]";
	}




	
}