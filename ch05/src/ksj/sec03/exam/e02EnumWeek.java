package ksj.sec03.exam;

import java.util.Calendar;

public class e02EnumWeek {
	public static void main(String[] args) {
		e01Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = e01Week.SUNDAY; break;
			case 2:
				today = e01Week.MONDAY; break;
			case 3:
				today = e01Week.TUESDAY; break;
			case 4:
				today = e01Week.WEDNESDAY; break;
			case 5:
				today = e01Week.THURSDAY; break;
			case 6:
				today = e01Week.FRIDAY; break;				
			case 7:
				today = e01Week.SATURDAY; break;		
		}
		
		System.out.println("오늘 요일 : "+ today);
		
		if(today == e01Week.SUNDAY) {
			System.out.println("일요일에는 집에 있습니다. ");
		} else {
			System.out.println("열심히 자바 공부 합니다.");
		}
	}
}

