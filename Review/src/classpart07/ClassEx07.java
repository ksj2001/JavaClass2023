package classpart07;

import java.util.*;

public class ClassEx07 {
	Scanner scan = new Scanner(System.in);
	String[] arAcc = { "1111", "2222", "3333", "4444", "5555" };
	String[] arPw = { "1234", "2345", "3456", "4567", "5678" };
	int[] arMoney = { 87000, 34000, 17500, 98000, 12500 };

	int count = 5;

	// 3333 로그인 중
	int loginCheck = 2;

	int menu;

	boolean run = true;

	String inputAcc = ""; // 입력한 계좌번호
	String inputPw = ""; // 입력한 비밀번호
	int inputMoney = 0; // 입력한 금액
	int index = 0;

	// 메서드

	public void selectMenu() { // 메뉴 선택 메서드
		while (run) {
			System.out.println("-------------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("-------------------------");
			for (int i = 0; i < arAcc.length; i++) {
				System.out.println(arAcc[i] + "\t" + arPw[i] + "\t" + arMoney[i]);
			}
			System.out.println("-------------------------");
			if (loginCheck != -1)
				System.out.println("상태 : " + arAcc[loginCheck] + " 로그인");
			else
				System.out.println("상태 : 로그아웃");
			System.out.println("-------------------------");

			System.out.println("[Mega Bank]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			menu = -1;
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			if (menu == 1)
				signUp();
			else if (menu == 2)
				delete();
			else if (menu == 3)
				logIn();
			else if (menu == 4)
				logOut();
			else if (menu == 5)
				deposit();
			else if (menu == 6)
				transfer();
			else if (menu == 7)
				checkBalance();
			else if (menu == 0)
				endProgram();
			else
				System.out.println("유효하지 않은 메뉴입니다.");
		}
	}

	public void signUp() { // 회원가입 메서드
		System.out.print("[가입]계좌번호를 입력하세요 : ");
		inputAcc = scan.next();
		for (int i = 0; i < count; i++) {
			if (inputAcc.equals(arAcc[i])) {
				System.out.println("[메세지]중복되는 계좌번호 입니다.");
				index = -1;
			}
		}
		if (index != -1) {
			System.out.print("[가입]비밀번호 입력 : ");
			arAcc[count] = scan.next();
			count++;
			System.out.println("가입이 완료되었습니다.");
		}
		
		// 미완
	}

	public void delete() { // 회원탈퇴 메서드
		if (loginCheck != -1) {
			System.out.println("이미 로그인 된 상태입니다.");	
		} else {
			System.out.println("탈퇴되었습니다.");
			for(int i = loginCheck; i<count-1 ; i++) {
				arAcc[i] = arAcc[i+1];
				arPw[i] = arPw[i+1];
				arMoney[i] = arMoney[i+1];
			}
			arAcc[count] = "";
			arPw[count] = "";
			arMoney[count] = 0;
			count--;
			loginCheck = -1;
		}
	}

	public void logIn() { // 로그인 메서드
		if (loginCheck != -1) {
			System.out.println("이미 로그인 된 상태입니다.");	
		} else {
			System.out.print("ID입력 : ");
			inputAcc = scan.next();
			System.out.print("PW입력 : ");
			inputPw = scan.next();
			for (int i = 0; i < arAcc.length; i++) {
				if (arAcc[i].equals(inputAcc) && arPw[i].equals(inputPw)) {
					System.out.println(arAcc[i] + "님, 환영합니다.");
					loginCheck = i;
				}
			}
			if (loginCheck == -1) {
				System.out.println("ID와 PW를 확인해주세요.");
			}
		}
	}

	public void logOut() { // 로그아웃 메서드
		if (loginCheck == -1) {
			System.out.println("로그인 후 이용 가능합니다.");
		} else {
			System.out.println("로그아웃 되었습니다.");
			loginCheck = -1;
		}
	}

	public void deposit() { // 입금 메서드
		if (loginCheck == -1) {
			System.out.println("로그인 후 이용 가능합니다.");
		} else {
			System.out.println("입금할 금액 입력 : ");
			inputMoney = scan.nextInt();
			arMoney[loginCheck] += inputMoney;
		}
	}

	public void transfer() { // 이체 메서드
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.print("이체할 계좌번호를 입력하세요 : ");
			inputAcc = scan.next();
			index = -1;
			for(int i=0;i<count;i++) {
				if(inputAcc.equals(arAcc[i])) {
					index = i;
				}
			}
			if(index == -1) {
				System.out.println("유효하지 않은 계좌번호입니다.");
			}
			else {
				System.out.print("이체할 금액을 입력하세요 : ");
				inputMoney = scan.nextInt();
				if(inputMoney>arMoney[loginCheck]) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					arMoney[loginCheck] -= inputMoney;
					arMoney[index] += inputMoney;
				}	
			}		
		}
	}

	public void checkBalance() { // 잔액조회 메서드
		if (loginCheck == -1) {
			System.out.println("로그인 후 이용 가능합니다.");
		} else {
			System.out.println("계좌번호: " + arAcc[loginCheck]);
			System.out.println("현재 잔액: " + arMoney[loginCheck]);
		}
	}

	public void endProgram() { // 프로그램 종료 메서드
		System.out.println("프로그램 종료");
		run = false;
	}

}
