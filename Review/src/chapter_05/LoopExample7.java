package chapter_05;

import java.util.*;

public class LoopExample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111; // 계좌번호 1
		int dbPw1 = 1234; // 비밀번호 1
		int dbAcc2 = 2222; // 계좌번호 2
		int dbPw2 = 2345; // 비밀번호 2

		int menu = -1; // 메뉴번호
		int inputAcc = 0; // 입력한 계좌번호
		int inputPw = 0; // 입력한 비밀번호
		String status = "로그아웃"; // 현재 상태 (로그인 or 로그아웃)

		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();

			if (menu != 0 && menu != 1 && menu != 2) { // 메뉴번호가 0,1,2가 아닐 때
				System.out.println("잘못된 메뉴입니다.");
			}

			else if (menu == 1) { // 로그인
				if (status == "로그인") { // 상태: 로그인
					System.out.println("이미 로그인된 상태입니다.");
				} 
				else { // 상태 : 로그아웃
					System.out.print("계좌번호 입력 : ");
					inputAcc = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					inputPw = scan.nextInt();

					if ((inputAcc == dbAcc1 && inputPw == dbPw1) // 1의 계좌,비밀번호 정보와 일치
					|| (inputAcc == dbAcc2 && inputPw == dbPw2)) { // 또는 2의 계좌,비밀번호 정보와 일치
						System.out.println(inputAcc+"님, 환영합니다.");
						status = "로그인";
					}
					else { // 로그인 실패
						System.out.println("계좌번호 또는 비밀번호를 확인해주세요.");
					}
				}
			}
			
			else if (menu == 2) { // 로그아웃
				if (status == "로그아웃") { // 상태: 로그아웃
					System.out.println("이미 로그아웃된 상태입니다.");
				} 
				else { // 상태 : 로그인
					System.out.println("로그아웃 되었습니다.");
					status = "로그아웃";
				}
			}
			
			else { // 종료
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();
		
	}
}
