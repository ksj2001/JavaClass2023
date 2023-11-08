package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTestClass {

	public static void main(String[] args) {
		// CalenderClass를 getInstance라는 메서드로 인스턴스한다.
		// new를 이용한 객체를 생성하지 않는다. (Calender는 추상 클래스이기 때문)
		Calendar today = Calendar.getInstance();
		String[] week = {"일","월","화","수","목","금","토"};
		
	
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 입니다.");
		
		int woYear = today.get(Calendar.WEEK_OF_YEAR);
		int woMonth = today.get(Calendar.WEEK_OF_MONTH);
		System.out.println("올해 년도의 "+woYear+"째 주, 현재 월 중의 "+woMonth+"째 주");
		
		int doYear = today.get(Calendar.DAY_OF_YEAR);
		int doMonth = today.get(Calendar.DAY_OF_MONTH);
		int doWeek = today.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println("오늘은 올해의 "+doYear+"일이고, 이번 달의 "+doMonth+"일이다.");
		System.out.println(year+"년 "+month+"월 "+date+"일 "+week[doWeek]+"요일");
		
		int hour = today.get(Calendar.HOUR); // 12시간제
		int hour2 = today.get(Calendar.HOUR_OF_DAY); // 24시간제
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+":"+second);
		System.out.println(hour2+":"+minute+":"+second);
		
		int lastDay = today.getActualMaximum(Calendar.DATE);
		int firstDay = today.getActualMinimum(Calendar.DATE);
		System.out.println("마지막"+lastDay);
		System.out.println("처음"+firstDay);
		
		System.out.println("연, 월, 일을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int year1 = scan.nextInt();
		int month1 = scan.nextInt();
		int date1 = scan.nextInt();
		
		
		today.set(year1, month1-1, date1); // 2 -> 1 -> 2월
		int lastDay2 = today.getActualMaximum(Calendar.DATE);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); // 출력은 +1을 해야 원래 날짜 
		System.out.println(today.get(Calendar.DATE));
		System.out.println(week[today.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("마지막 일 : "+lastDay2);
		
		
	}

}
