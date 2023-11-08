package bank;
import java.util.*;
public class SelectMenu {
	//멤버 변수
	Scanner scan = new Scanner(System.in);
	User user = new User();
	DepoTrans depotrans = new DepoTrans();
	String currentStatus = "로그아웃";
	boolean run = true;
	int menu = -1;
	
	//함수
	public void menu() {
		while(run) {
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.arAcc[i]!="") {
					System.out.println(user.arAcc[i]+" : "+user.arPw[i]+" : "+user.arMoney[i]+"원");
				}
			}
			status();
			System.out.println("# 로그인 상태 : "+currentStatus);
			System.out.println("=== 우리은행 ===");
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.로그인");
			System.out.println("4.로그아웃");
			System.out.println("5.입금하기");
			System.out.println("6.이체하기");
			System.out.println("7.종료");
			System.out.print("메뉴를 선택해주세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				user.signUp();
				break;
			case 2:
				user.delete();
				break;
			case 3:
				user.logIn();
				break;
			case 4:
				user.logOut();
				break;
			case 5:
				depotrans.deposit();
				break;
			case 6:
				depotrans.transfer();
				break;
			case 7:
				end();
				break;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	public void status() { // 로그인상태 함수
		if(user.log==-1) {
			currentStatus = "로그아웃";
		}
		else {
			for(int i=0;i<user.arAcc.length;i++) {
				if(user.log==i) {
					currentStatus = user.arAcc[i]+"님, 로그인 중...";
				}
			}
		}
	}
	
	public void end() { // 프로그램 종료 함수
		System.out.println("쇼핑몰 종료");
		run = false;
	}
}
