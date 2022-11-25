package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {

	public Child1() {
		super();
		
	}
	
	private int z;

	public Child1(int z) {
		super();
		this.z = z;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	@Override
	public String toString() {
		return "Child1 [z=" + z + "]";
	}
	public void printChild1() {
		System.out.println("호출됨");
	}
	
	@Override
	public void print() {
		System.out.println(" 자식");
	}

	

}
