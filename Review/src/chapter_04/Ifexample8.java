package chapter_04;
import java.util.*;
public class Ifexample8 {
	public static void main(String[] args) {
		int cash = 20000; // 입금시 감소, 출금시 증가
		int balance = 30000; // 입금시 증가, 출금시 감소
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int menu1 = scan.nextInt(); // 메뉴 입력 1 (로그인 or 종료)
		
		
		if(menu1==1) { // 로그인 선택
			
			System.out.println("계좌번호와 비밀번호를 입력하세요");
			int inputAccount = scan.nextInt(); // 계좌번호 입력
			int inputPassword = scan.nextInt(); // 비밀번호 입력
			
			if(account == inputAccount && password == inputPassword) {
				// 계좌번호와 비밀번호 모두 일치 → 입금,출금,조회 중 선택
				System.out.println("1.입금 2.출금 3.조회");
				int menu2 = scan.nextInt(); // 메뉴 입력 2 (입금 or 출금 or 조회)
				
				if(menu2==1) { // 입금 선택
					System.out.println("입금할 금액을 입력하세요");
					int depositCash = scan.nextInt();
					if(depositCash > cash) {
						// 입금 불가 (입금할 금액이 내 현금 잔액보다 많음
						System.out.println("입금 불가(입금 금액이 내 현금 잔액보다 많음)");
					}
					
					else {
						cash -= depositCash; // 내 현금 잔액 - 입금할 금액
						balance += depositCash; // 통장잔액 + 입금할 금액
						System.out.println("입금 후 통장잔액: "+balance+"원");
						System.out.println("입금 후 내 현금 잔액: "+cash+"원");
					}
				}
				
				else if(menu2==2) { // 출금 선택
					System.out.println("출금할 금액을 입력하세요");
					int withdrawCash = scan.nextInt();
					if(withdrawCash > balance) {
						// 입금 불가 (출금할 금액이 통장잔액보다 많음
						System.out.println("출금 불가(출금 금액이 통장잔액보다 많음)");
					}
					else {
						balance -= withdrawCash; // 통장잔액 - 출금할 금액
						cash += withdrawCash; // 내 현금 금액 + 출금할 금액
						System.out.println("출금 후 통장잔액: "+balance+"원");
						System.out.println("출금 후 내 현금 잔액: "+cash+"원");
					}
				}
				
				else if(menu2==3) { // 조회 선택
					System.out.println("통장잔액: "+balance+"원");
					System.out.println("내 현금 잔액: "+cash+"원");
				}
				
				else { // 유효하지 않은 메뉴(2) 입력
					System.out.println("유효하지 않은 메뉴입니다.");
				}
			}
			
			else { // 계좌번호 or 비밀번호 불일치
				System.out.println("아이디와 패스워드를 확인해주세요.");
			}
		}
		
		else if(menu1==2) {
			System.out.println("종료");
		}
		
		else { // 유효하지 않은 메뉴(1) 입력
			System.out.println("유효하지 않은 메뉴입니다.");
		}
		scan.close();
	}
}
