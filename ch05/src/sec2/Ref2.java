package sec2;

import java.util.Calendar;

public class Ref2 {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int w = cal.get(Calendar.DAY_OF_WEEK);	// 오늘 날짜의 요일번호 가져오기
		System.out.println(w);	//1~7(일~토)
		switch(w){
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WENDSDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		System.out.println("오늘의 요일 : "+today);	//------------------------------------------------------------ 
		System.out.println("name : " +today.name());	//name : 멤버의 이름을 불러옴
		System.out.println("original : " +today.ordinal());	//
		Week day1 = Week.SATURDAY;
		System.out.println("요일비교 : "+today.compareTo(day1));	//1 : true, 1이 아닌값 : false
		
		Week[] days = Week.values();
		for(Week day : days){
			System.out.println(day);
		}
		
		
	}

}
