package chapter_04;
import java.util.*;
public class Ifexample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("이체할 계좌번호를 입력하세요 : ");
		int transAcc = scan.nextInt(); // 이체할 계좌번호
		if(transAcc!=yourAcc) { // 계좌번호 불일치
			System.out.println("계좌번호가 일치하지 않습니다.");
			scan.close();
			return;
		}	
		
		System.out.print("이체금액을 입력하세요 : ");
		int transMoney = scan.nextInt(); // 이체할 금액
		if(transMoney>myMoney) { // 이체금액 > 나의 예금액 : 이체불가
			System.out.println("이체할 수 없습니다. (잔액부족)");
			scan.close();
			return;
		}
		
		myMoney -= transMoney;
		yourMoney += transMoney; 
		System.out.println("이체를 완료하였습니다.");
		System.out.println("myMoney = "+myMoney+"원");
		System.out.println("yourMoney = "+yourMoney+"원");
		
		scan.close();
	}
}
