package myCalendar;

import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int year = scan.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int month = scan.nextInt();
		CalendarTest ct = new CalendarTest(year,month);
		ct.setCalendarForm();
		scan.close();
	}
}
