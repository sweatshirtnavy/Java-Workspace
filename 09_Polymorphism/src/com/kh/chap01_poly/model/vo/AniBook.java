package com.kh.chap01_poly.model.vo;

public class AniBook extends Book {
	
	private int accessAge;
	
	public AniBook() {
		
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		
	}

	public AniBook(String title, String author, String publisher) {
		super(title, author, publisher);
	
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + "]";
	}

	

}