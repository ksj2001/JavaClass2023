package if_test;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		System.out.print("이체할 계좌번호를 입력하세요 : ");
		int inputAcc = scan.nextInt();
		if (yourAcc!=inputAcc) {
			System.out.println("계좌번호가 일치하지 않습니다.");
		}
		else {
			System.out.print("이체금액을 입력하세요 : ");
			int inputMoney = scan.nextInt();
			if (inputMoney > myMoney) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				System.out.println("이체를 완료하였습니다.");
				myMoney -= inputMoney;
				yourMoney += inputMoney;
				System.out.println("myMoney = "+myMoney+"원");
				System.out.println("yourMoney = "+yourMoney+"원");
			}
		}
		scan.close();
	}
}
