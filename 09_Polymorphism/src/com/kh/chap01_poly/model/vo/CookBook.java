package com.kh.chap01_poly.model.vo;

public class CookBook extends Book {
	
	private boolean coupon;
	
	public CookBook() {
		
	}

	public CookBook(String title, String author, String publisher) {
	
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}


}