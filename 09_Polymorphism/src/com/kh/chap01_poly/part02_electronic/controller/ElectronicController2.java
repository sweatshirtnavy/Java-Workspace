package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

//다형성 적용시켰을때
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];
	
	// Electronic any  : 데스크탑, 노트북, 태블릿을 담을 수있는 다형성이 적용된 매개변수
	// int index : elec배열의 index위치에 ant변수를 넣기위한 매개변수
	public void insert(Electronic any , int index) {
		elec[index] = any;
		
	}
	
	public Electronic select(int index) {
		return elec[index];
	}

}
