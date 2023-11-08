package if_test;
import java.util.*;
public class Example4 {
	public static void main(String[] args) {
		int cash = 20000; // 입금시 감소 , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int input1 = scan.nextInt();
		switch(input1) {
			//로그인
			case 1:
				System.out.println("계좌와 비밀번호를 입력하세요");
				int input_Acc = scan.nextInt();
				int input_Pw = scan.nextInt();
				if ((input_Acc==account)&&(input_Pw==password)) {
					System.out.println("1.입금 2.출금 3.조회");
					int input2 = scan.nextInt();
					switch(input2) {
					//입금
					case 1:
						System.out.println("입금할 금액을 입력하세요");
						int dep_cash = scan.nextInt();
						if (dep_cash>cash) {
							System.out.println("현금 잔액이 부족합니다.");
						}
						else {
							cash -= dep_cash;
							balance += dep_cash;
							System.out.println("입금 후 통장잔액 : "+balance+"원");
							System.out.println("입금 후 내 현금 잔액 : "+cash+"원");
						}
						break;
					//출금
					case 2:
						System.out.println("출금할 금액을 입력하세요");
						int wit_cash = scan.nextInt();
						if (wit_cash>balance) {
							System.out.println("통장 잔액이 부족합니다.");
						}
						else {
							cash += wit_cash;
							balance -= wit_cash;
							System.out.println("출금 후 통장잔액 : "+balance+"원");
							System.out.println("출금 후 내 현금 잔액 : "+cash+"원");
						}
						break;
					//조회
					case 3:
						System.out.println("현재 통장잔액 : "+balance+"원");
						System.out.println("현재 내 현금 잔액 : "+cash+"원");
						}
						break;
				}
				else {
					System.out.println("아이디와 패스워드를 확인해주세요.");
				}
				break;
			//종료
			case 2:
				System.out.println("종료");
				break;
		}
		scan.close();
	}
}
