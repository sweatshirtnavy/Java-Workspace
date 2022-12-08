package com.kh.enumBasic;

//1)기본사용법
public enum Day1 {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY


}

//2)enum안에 각 상수요소마다 값을 더 추가 싶은 경우
//	비슷한 상수필드끼리 매칭시킬때 사용함
enum Day2{
	//1)각 요소마다 우측에 매칭시킬값을 추가함
	MONDAY("MON"),
	TUESDAY("TUE"),
	WEDNESDAY("WED"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURDAY("SAT"),
	SUNDAY("SUN");
	
	//2) 매칭시킬값의 자료형 필드값 추가
	private final String shortName;
	
	//3)생성자 추가
	Day2(String shortName){
		this.shortName = shortName;
	}
	
	//4)getter메서드 작성
	public String shortName() {
		return shortName;
	}
	
}
//매핑 시킬 값이 여러개인 경우
enum Day3{
	
	MONDAY("MON",1),
	TUESDAY("TUE",2),
	WEDNESDAY("WED",3),
	THURSDAY("THU",4),
	FRIDAY("FRI",5),
	SATURDAY("SAT",6),
	SUNDAY("SUN",7);
	
	//2) 매칭시킬값의 자료형 필드값 추가
	private final String shortName;
	private final int day;
	
	//3)생성자 추가
	Day3(String shortName , int day){
		this.shortName = shortName;
		this.day = day;
	}
	
	//4)getter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	
	//필드값을 통해 enum을 찾는 메소드 추가
	public static Day3 valueOfShortName(String shortName) {
		Day3 days[] = Day3.values();
		for(int i=0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
		
	}
	
	public static Day3 valueOfDay(int day) {
		Day3 days[] = Day3.values();
			for(Day3 d : days) {
				if(d.day == day) {
					return d;
			
		}
	}
	return null;
	
	}
}

//
enum Day4{
	//1) 요소마다 우측 매칭시킬값
	MONDAY("MON",1){
		@Override
		public void printDay() {System.out.println("월요일입니다.");}	
	},
	//함수추가 2단계) 추상메서드 상수필드에서 오버라이딩
	TUESDAY("TUE",2){
		@Override
		public void printDay() {System.out.println("월요일입니다.");}
		
	},
	WEDNESDAY("WED",3){
		@Override
		public void printDay() {System.out.println("월요일입니다.");}
		
	},
	THURSDAY("THU",4){
		@Override
		public void printDay() {System.out.println("월요일입니다.");}
	},
	FRIDAY("FRI",5){
		@Override
		public void printDay() {System.out.println("토요일입니다.");}
	},
	SATURDAY("SAT",6){
		@Override
		public void printDay() {System.out.println("일요일입니다.");}
	},
	SUNDAY("SUN",7){
		@Override
	public void printDay() {System.out.println("일요일입니다.");}
	};
	
	//2) 매칭시킬값의 자료형 필드값 추가
	private final String shortName;
	private final int day;
	
	//3)생성자 추가
	Day4(String shortName , int day){
		this.shortName = shortName;
		this.day = day;
	}
	
	//4)getter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	public static Day4 valueOfShortName(String shortName) {
		Day4 days[] = Day4.values();
		for(int i=0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
		
	}
	
	public static Day4 valueOfDay(int day) {
		Day4 days[] = Day4.values();
			for(Day4 d : days) {
				if(d.day == day) {
					return d;
			
		}
	}
	return null;
	
	}
	public void printDay1() {
		switch(this) {
		case MONDAY : System.out.println("월요일입니다"); break;
		case TUESDAY: System.out.println("화요일입니다"); break;
		case WEDNESDAY : System.out.println("수요일입니다"); break;
		case THURSDAY : System.out.println("목요일입니다"); break;
		case FRIDAY : System.out.println("금요일입니다"); break;
		case SATURDAY : System.out.println("토요일입니다"); break;
		case SUNDAY : System.out.println("일요일입니다"); break;
		}
	}
	
	public abstract void printDay(); 
	
	
	
	
	
	
}
