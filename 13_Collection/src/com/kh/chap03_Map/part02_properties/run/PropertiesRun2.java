package com.kh.chap03_Map.part02_properties.run;

import java.io.IOException;
import java.util.Properties;
import java.util.PropertiesRun2;

public class Run {

	public static void main(String[] args) {
		
		Properties prop = new PropertiesRun2();
		
		try {
		//5. p
		prop.load(new FileInputStream("test.properties"));
		
	}catch (IOException e) {
		e.printStackTrace();
	}
		//System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("List"));

	}

}
