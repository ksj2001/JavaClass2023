package if_test;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 롯데리아 ===");
		int bulgogi = 8700;
		System.out.println("1.불고기 버거 : "+bulgogi+"원");
		int shrimp = 6200;
		System.out.println("2.새우 버거 : "+shrimp+"원");
		int coke = 1500;
		System.out.println("3.콜라 : "+coke+"원");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			menu = bulgogi;
			break;
		case 2:
			menu = shrimp;
			break;
		case 3:
			menu = coke;
			break;
		}
		System.out.print("현금을 입력하세요 : ");
		int cash = scan.nextInt();
		int change = 0;
		if (cash<menu) {
			System.out.println("현금이 부족합니다.");
		}
		else {
			change = cash - menu;
		}
		System.out.println("잔돈 : "+change);
		scan.close();
	}
}
