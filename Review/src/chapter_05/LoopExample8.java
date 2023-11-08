package chapter_05;

import java.util.*;

public class LoopExample8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myMoney = 50000;
		int yourMoney = 70000;
		// int myAccount = 1111;
		int yourAccount = 2222;
		int menu = -1;
		int depositMoney = 0;
		int withdrawMoney = 0;
		int transferMoney = 0;
		int inputAccount = 0;
		
		while (true) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			if (menu == 1) { // 입금
				System.out.print("입금할 금액 입력 : ");
				depositMoney = scan.nextInt();
				System.out.println("입금을 완료하였습니다.");
				myMoney += depositMoney;
			}

			else if (menu == 2) { // 출금
				System.out.print("출금할 금액 입력 : ");
				withdrawMoney = scan.nextInt();
				if(withdrawMoney > myMoney) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				System.out.println("출금을 완료하였습니다.");
				myMoney -= withdrawMoney;
			}

			else if (menu == 3) { // 이체
				System.out.print("이체할 계좌번호 입력 : ");
				inputAccount = scan.nextInt();
				
				if(inputAccount != yourAccount) {
					System.out.println("없는 계좌번호입니다.");
					continue;
				}
				
				System.out.print("이체할 금액 입력 : ");
				transferMoney = scan.nextInt();
				
				if(transferMoney > myMoney) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				
				System.out.println("이체를 완료하였습니다.");
				myMoney -= transferMoney;
				yourMoney += transferMoney;
			}

			else if (menu == 4) { // 조회
				System.out.println("myMoney = "+myMoney+"원");
				System.out.println("yourMoney = "+yourMoney+"원");
			}
			
			else if (menu == 0) { // 종료
				System.out.println("프로그램 종료");
				break;
			}

			else {
				System.out.println("유효하지 않은 메뉴입니다.");
			}
		}
		
		scan.close();
	}
}
