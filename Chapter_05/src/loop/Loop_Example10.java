package loop;
import java.util.*;
public class Loop_Example10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		int menu;
		int inputAcc;
		int inputPw;
		int currentAcc = 0; // 로그인 된 계좌번호 정보
		int currentPw = 0; // 로그인 된 비밀번호 정보
		int currentMoney = 0; // 로그인 된 계좌 잔액
		int depMoney; // 입금할 금액
		int witMoney; // 출금할 금액
		int transAcc; // 이체할 계좌번호
		int transMoney; // 이체할 금액 
		String status = "로그아웃";
		boolean run = true;
		while(run) {
			System.out.println("dbMoney1 = "+dbMoney1+"원");
			System.out.println("dbMoney2 = "+dbMoney2+"원");
			System.out.println("*상태 : "+status);
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");	
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(currentAcc != 0) { // 로그인 상태에서는 재로그인 불가
					System.out.println("이미 로그인 중...");
				}
				else {
					System.out.print("계좌번호 입력 : ");
					inputAcc = scan.nextInt();
					System.out.print("비밀번호 입력 : ");	
					inputPw = scan.nextInt();
					if((inputAcc==dbAcc1 && inputPw==dbPw1)||(inputAcc==dbAcc2 && inputPw==dbPw2)) {
						currentAcc = inputAcc;
						currentPw = inputPw;
						if(currentAcc==dbAcc1) {
							currentMoney = dbMoney1;
						}
						else {							
							currentMoney = dbMoney2;  // 계좌 정보가 2개만 있어서 else문으로 처리함
						}
						System.out.println(currentAcc+"님, 환영합니다.");
						status = currentAcc+"로그인";
					}
					else {
						System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
					}
				}
				break;
			case 2:
				if(currentAcc == 0) { // 로그인 후 이용 가능
					System.out.println("로그인 후 이용 가능합니다.");
				}
				else {
					currentAcc = 0;
					currentPw = 0;
					currentMoney = 0;
					System.out.println("로그아웃 되었습니다.");
					status = "로그아웃";
				}
				break;
			case 3:
				if(currentAcc == 0) { // 로그인 후 이용 가능
					System.out.println("로그인 후 이용 가능합니다.");
				}
				else {
					System.out.print("입금할 금액 입력 : ");
					depMoney = scan.nextInt();
					System.out.println("입금을 완료하였습니다.");
					if(currentAcc == dbAcc1) {
						currentMoney += depMoney;
						dbMoney1 = currentMoney;
					}
					else {
						currentMoney += depMoney;
						dbMoney2 = currentMoney;
					}
				}
				break;
			case 4:
				if(currentAcc == 0) { // 로그인 후 이용 가능
					System.out.println("로그인 후 이용 가능합니다.");
				}
				else {
					System.out.print("출금할 금액 입력 : ");
					witMoney = scan.nextInt();
					if(witMoney > currentMoney) {
						System.out.println("잔액이 부족합니다.");
					}
					else {
						System.out.println("출금을 완료하였습니다.");
						if(currentAcc == dbAcc1) {
							currentMoney -= witMoney;
							dbMoney1 = currentMoney;
						}
						else {
							currentMoney -= witMoney;
							dbMoney2 = currentMoney;
						}
					}
				}
				break;
			case 5: 
				if(currentAcc == 0) { // 로그인 후 이용 가능
					System.out.println("로그인 후 이용 가능합니다.");
				}
				else {
					System.out.print("이체할 계좌번호 입력 : ");
					transAcc = scan.nextInt();
					if(transAcc == currentAcc) {
						System.out.println("본인 계좌에는 이체할 수 없습니다.");
					}
					else if(transAcc == dbAcc1) {
						System.out.print("이체할 금액 입력 : ");
						transMoney = scan.nextInt();
						if(transMoney > currentMoney) {
							System.out.println("잔액이 부족합니다.");
						}
						else {
							System.out.println("이체를 완료하였습니다.");
							currentMoney -= transMoney;
							dbMoney2 = currentMoney;
							dbMoney1 += transMoney;
						}
					}
					else if(transAcc == dbAcc2) {
						System.out.print("이체할 금액 입력 : ");
						transMoney = scan.nextInt();
						if(transMoney > currentMoney) {
							System.out.println("잔액이 부족합니다.");
						}
						else {
							System.out.println("이체를 완료하였습니다.");
							currentMoney -= transMoney;
							dbMoney1 = currentMoney;
							dbMoney2 += transMoney;
						}
					}
					else {
						System.out.println("유효하지 않은 계좌번호입니다.");
					}
				}
				break;
			case 6:
				if(currentAcc == 0) { // 로그인 후 이용 가능
					System.out.println("로그인 후 이용 가능합니다.");
				}
				else {
					// 반복문이 반복될 때마다 dbMoney1과 dbMoney2의 값을 계속 보여주는데 조회 기능이 필요한가요?
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
		scan.close();
	}
}
