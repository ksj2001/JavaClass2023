package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTestClass {

	public static void main(String[] args) {
		// CalenderClass�� getInstance��� �޼���� �ν��Ͻ��Ѵ�.
		// new�� �̿��� ��ü�� �������� �ʴ´�. (Calender�� �߻� Ŭ�����̱� ����)
		Calendar today = Calendar.getInstance();
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
	
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		System.out.println("������ "+year+"�� "+month+"�� "+date+"�� �Դϴ�.");
		
		int woYear = today.get(Calendar.WEEK_OF_YEAR);
		int woMonth = today.get(Calendar.WEEK_OF_MONTH);
		System.out.println("���� �⵵�� "+woYear+"° ��, ���� �� ���� "+woMonth+"° ��");
		
		int doYear = today.get(Calendar.DAY_OF_YEAR);
		int doMonth = today.get(Calendar.DAY_OF_MONTH);
		int doWeek = today.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println("������ ������ "+doYear+"���̰�, �̹� ���� "+doMonth+"���̴�.");
		System.out.println(year+"�� "+month+"�� "+date+"�� "+week[doWeek]+"����");
		
		int hour = today.get(Calendar.HOUR); // 12�ð���
		int hour2 = today.get(Calendar.HOUR_OF_DAY); // 24�ð���
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+":"+second);
		System.out.println(hour2+":"+minute+":"+second);
		
		int lastDay = today.getActualMaximum(Calendar.DATE);
		int firstDay = today.getActualMinimum(Calendar.DATE);
		System.out.println("������"+lastDay);
		System.out.println("ó��"+firstDay);
		
		System.out.println("��, ��, ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year1 = scan.nextInt();
		int month1 = scan.nextInt();
		int date1 = scan.nextInt();
		
		
		today.set(year1, month1-1, date1); // 2 -> 1 -> 2��
		int lastDay2 = today.getActualMaximum(Calendar.DATE);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); // ����� +1�� �ؾ� ���� ��¥ 
		System.out.println(today.get(Calendar.DATE));
		System.out.println(week[today.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("������ �� : "+lastDay2);
		
		
	}

}
