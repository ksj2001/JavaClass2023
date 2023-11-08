package loop;
import java.util.*;
public class Loop_Example09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myMoney = 50000;
		int yourMoney = 70000;
		int yourAcc = 2222;
		int depMoney; //입금할 금액
		int witMoney; //출금할 금액
		int transAcc; //이체할 계좌번호
		int transMoney; //이체할 금액
		int menu;
		boolean run = true;
		while(run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("입금할 금액 입력 : ");
				depMoney = scan.nextInt();
				myMoney += depMoney;
				System.out.println("입금을 완료하였습니다.");
				break;
			case 2:
				System.out.print("출금할 금액 입력 : ");
				witMoney = scan.nextInt();
				if(witMoney>myMoney) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					myMoney -= witMoney;
					System.out.println("출금을 완료하였습니다.");
				}
				break;
			case 3:
				System.out.print("이체할 계좌번호 입력 : ");
				transAcc = scan.nextInt();
				if (transAcc == yourAcc) {
					System.out.print("이체할 금액 입력 : ");
					transMoney = scan.nextInt();
					if(transMoney>myMoney) {
						System.out.println("잔액이 부족합니다.");
					}
					else {
						myMoney -= transMoney;
						yourMoney += transMoney;
						System.out.println("이체를 완료하였습니다.");
					}
				}
				else {
					System.out.println("잘못된 계좌번호입니다.");
				}
				break;
			case 4:
				System.out.println("myMoney = "+myMoney+"원");
				System.out.println("yourMoney = "+yourMoney+"원");
				break;
			case 0:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 접근입니다.");
				break;
			}		
		}
		scan.close();
	}
}
