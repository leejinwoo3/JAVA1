package ch05.sec12;

import java.util.Calendar;

public class weekexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//week 타입 변수 선언
		Week today = null;
		
		//오늘의 요일 얻기
		Calendar cal =Calendar.getInstance();
		int week =cal.get(Calendar.DAY_OF_WEEK);//요일
		System.out.println(week);
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDMESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;

		}
	}

}
