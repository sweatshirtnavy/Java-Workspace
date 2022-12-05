package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet();
		
		//값 추가 : add(추가할 값);
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(50);
		
		System.out.println(hs1);//중복 저장x , 저장 순서 유지x
		
		//크기 구하기 : size()
		System.out.println("hs1의 크기는 ? "+hs1.size());
		
		//값 삭제: remove(삭제할 값)
		hs1.remove("여러분");
		System.out.println(hs1);
		
		//모든 값 삭제 : clear();
		hs1.clear();
		System.out.println(hs1);
		
		System.out.println("----------------------------------------------");
		
		HashSet<Student> hs2 = new HashSet();
		
		hs2.add(new Student("민경민", 31, 100));
		hs2.add(new Student("홍길동", 41, 90));
		hs2.add(new Student("김갑생", 21, 80));
		hs2.add(new Student("민경민", 31, 100));
		
		System.out.println(hs2);
		//저장 순서 유지 x , 중복 저장 o -> 동일객체로 판단되지 않기 때문
		//값이 추가될때 equals(), hashCode()로 비교 후 둘다 결과가 true면 동일객체로 판단
		
		//HashSet에 객체 담을 때 내부적으로 equals()로 비교 + hashCode()값이 일치하는지도 비교
		//equals()한 결과가 true이고 hashCode()값이 일치하면 동일객체 판단(중복x)
		
		//Object클래스 equals():두 객체의 주소값을 가지고 비교해서 일치하면 true/ 않으면false
		//Object클래스 hashCode(): 두 객체의 주소값을 기반으로 해시코드값 만들어서 변환 비교
		
		//만약 위 2개의 메소드를 내가 원하는 형태로 바꿔서 중복저장이 안되게 하고 싶다면 오버라이딩
		
		//Student클래스 equals()오버라이딩: 세 필드값(name,age,score)일치하며 true 아니면 false
		//Student클래스 hashCode()오버라이딩: 세 필드값 기반으로 해시코드 만들어 반환
		
		System.out.println("------------------------------------------");
		
		//set => 무작위로 객체 저장되어있음.(index개념이 x) =>반복문 활용 불가
		//1. for문 사용 가능 (단, for each문(향상된for문)만 가능=>index접근이 불가하므로)
		
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------");
		//2.ArrayList에 담아준 후 ArrayList 반복문 수행
		ArrayList<Student>list = new ArrayList<>(hs2);//hs2 담겨있는 객체들이 추가된 채로 리스트 생성됨
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		System.out.println("-----------------------------------------");
		
		//3.HashSet클래스에서 제공하는 Iterator반복자를 이용한 방법
		//hs2에 담겨있는 객체들을 Iterator(반복자)에 담는 과정
		
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) {//it에 next로 빼올 값이 있는가? 라고 물어보는 메소드
			it.next();
		}//String의 StringTokenizer와 비슷한 개념
		
		// .iterator() : List계열과 Set계열에서만 사요가능
		
		}
		
		
		
		
	

	}

}
