package com.kh.chap_01_frame.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame {
	
	public MainFrame3() {
		
		this.setBounds(200, 200, 500 , 500);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setBounds(0, 0, 250, 500);
		panel2.setBounds(250, 0, 250, 500);
		
		//배경색 설정 > setBackground
		//기본 투명
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.PINK);
		
		//JPanel 객체 생성 설정까지 반드시 프레임 직접 추가(자동부착x)
		this.add(panel1);
		this.add(panel2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
