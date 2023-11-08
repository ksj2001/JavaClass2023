package chapter_05;

import java.util.Scanner;

public class LoopExample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bul = 8700; // 불고기버거 가격
		int sae = 6200; // 새우버거 가격
		int col = 1500; // 콜라 가격
		int menu = 0; // 메뉴 번호
		int countBul = 0; // 불고기버거 주문 개수
		int countSae = 0; // 새우버거 주문 개수
		int countCol = 0; // 콜라 주문 개수
		int total = 0; // 총 금액
		int cash = 0; // 현금

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : 8700원");
		System.out.println("2.새우 버거 : 6200원");
		System.out.println("3.콜라 : 1500원");
		
		for(int i=0;i<5;i++) { // 5번 반복 (주문받기)
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt(); // 메뉴 번호 입력
			if (menu != 1 && menu != 2 && menu != 3) { // 1,2,3이 아닌 메뉴번호를 입력했을 경우
				System.out.println("유효하지 않은 메뉴입니다.");
				scan.close();
				return; // 프로그램 종료
			} else if (menu == 1) {
				countBul++; // 불고기버거 주문 개수 추가
				total += bul; // 총 금액에 불고기버거 가격 추가
			} else if (menu == 2) {
				countSae++; // 새우버거 주문 개수 추가
				total += sae; // 총 금액에 새우버거 가격 추가
			} else {
				countCol++; // 콜라 주문 개수 추가
				total += col; // 총 금액에 콜라 가격 추가
			}
		}
		
		System.out.println("총 금액 = "+total+"원");
		System.out.print("현금 입력 : ");
		cash = scan.nextInt();
		if(cash<total) { // 현금이 총 금액보다 적을 경우
			System.out.println("결제 불가(현금 부족)");
			scan.close();
			return; // 프로그램 종료
		}
		cash -= total; // 현금 - 총금액 (= 잔돈)
		
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1.불고기 버거 : "+countBul+"개");
		System.out.println("2.새우 버거 : "+countSae+"개");
		System.out.println("3.콜라 : "+countCol+"개");
		System.out.println("4.총금액 : "+total+"원");
		System.out.println("4.잔돈 : "+cash+"원");
		
		scan.close();
	}
}
