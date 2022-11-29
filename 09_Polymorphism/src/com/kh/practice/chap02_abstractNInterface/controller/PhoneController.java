package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	
	private String[] result = new String[2];
			
			public String[] method() {
				Phone[] phones = new Phone[2];
				phones[0] = new GalexyNote9();
				phones[1] = new V40();
				int count = 0;
				for(Phone phone:phones) {
					if(phone instanceof V40) {
						result[count++] = ((v40) phone).printInformation();
					}else {
						result[count++] = ((GalexyNote9)phone).printInformation();
				}
		
				}
		return result;
	}
	

}
