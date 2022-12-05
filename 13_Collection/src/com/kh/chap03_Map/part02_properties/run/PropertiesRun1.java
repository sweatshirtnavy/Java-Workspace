package com.kh.chap03_Map.part02_properties.run;

import java.io.FileOutputStream;
import java.util.Properties;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
	
		// Properties : Map 계열 => key, value 세트로 저장
		//				단 Properties 특징: key, value 모두 String 제한

		
//		Properties prop = new Properties();
//		
//		//String이 아닌 값을 넣게 될 경우
//		//Map계열이기 때문에 put메소드 활용 가능
//		prop.put("다이제", new Snack("초코맛", 1000));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		//단 주로 Properties를 사용하는 경우는 Properties에 담겨있는 key+value세트를 파일로 기록하기 위해 사용
//		
//		Prop.store(new FileOutputStream("test.properties"), "Properties test");
//	}catch (IOE)
//		
		
		//Properties에 값을 추가할때 보통
		//1. setProperty(String key, String value)
		prop.setProperty("List","AerrayList");
		prop.setProperty()"set", "HashSet");
		prop.setProperty()"Map", "HashSet");
		prop.setProperty()"sMap, properties")

//값 가져오기
//2.getProperty(String key) : Srting
	System.out.println();("set"	)
	try{
	//3.store(PutputStream os, String Commets : Properties에 담긴 key-value
	prop.store(new FileOutStream("testproperties"), "Properties Test");
	
	//4.PutputStream os, String Commet
		
		
	}

}
