package com.kh.practice.point.controller;

import com.kh.practice.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle() {
			
		public String calcArea(int x, int y, int height, int width) {
			r = new Rectangle(x, y, height, width);
			return r.toString()+ " / "+ height * width;
		}
			
			
		public String calcPerimeter(int x, int y, int height, int width) {
			r = new Reactangle(x, y, height, width);
			return r.toString()+ " / " +2 *(width + height);
		}
	}
}

		
	
			
			


