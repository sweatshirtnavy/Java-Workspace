package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	
	}
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String result = "";
//		//방법1. String클래스 이용
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken(); //
//		}
		
		//방법2. StringBuffer or StringBuilder를 이용
		StringBuilder sb = new StringBuilder();
		
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		//return result;
		return sb.toString();
		
	}
	
	public String firstCap(String input) {
		//apple -> Apple
		//a, pple -> a(A)+pple
		// substring(0, 1);
		String upper = input.substring(0, 1).toUpperCase(); //0이상 1미만 인덱스 범위를 잘라옴. 그후 대문자 변환
		
		return upper+ input.substring(1);//대문자로 변환한 문자 + 0번인덱스를 제외한 문자열을 합쳐서 반환
		
		
	}
	public int findChar(String input, char one) {
		int count = 0;
		//방법1. 
		for(int i = 0; i<input.length(); i++) {
			//apple
			if(input.charAt(i) == one) { // a p p l e
				count++;
			
		}
	
	}
	//방법2. toCharArray활용
		char[] arr = input.toCharArray();//apple -> {'a','p','p','l','e'}
		for(char c : arr) {
			if(c == one) {
				count++;
			}
			
			
		}
		
		
	return count;

}

}