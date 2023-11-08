package myCalendar;

import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		CalendarTest ct = new CalendarTest(year,month);
		ct.setCalendarForm();
		scan.close();
	}
}
