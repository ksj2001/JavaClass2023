package if_test;
import java.util.*;
public class Switchexample {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("월을 입력하세요.");
	int month = scan.nextInt();
	int days = 0;
	switch(month) { 
	case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		days = 31;
		break;
	case 2:
		days = 28;
		break;
	case 4:case 6:case 9:case 11:
		days = 30;
		break;
	}
	System.out.println(days);
	scan.close();
	}
}
