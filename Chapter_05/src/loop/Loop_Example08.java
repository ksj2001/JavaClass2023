package loop;
import java.util.*;
public class Loop_Example08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int menu;
		int keyAcc = 0; // 입력받은 계좌번호
		int keyPw = 0; // 입력받은 비밀번호
		int count = 0; // 0이면 초기 로그아웃 상태
		boolean run = true;
		while(run) {
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if (keyAcc != 0 && count != 0){
					System.out.println("이미 로그인되어 있습니다.");
				}
				else {
					System.out.print("계좌번호 입력 : ");
					keyAcc = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					keyPw = scan.nextInt();
					if ((keyAcc==dbAcc1)&&(keyPw==dbPw1)) {
						keyAcc = dbAcc1;
						keyPw = dbPw1;
						System.out.println(keyAcc+"님, 환영합니다.");
						count++;
					}
					else if ((keyAcc==dbAcc2)&&(keyPw==dbPw2)) {
						keyAcc = dbAcc2;
						keyPw = dbPw2;
						System.out.println(keyAcc+"님, 환영합니다.");
						count++;
					}
					else {
						System.out.println("계좌번호 혹은 비밀번호가 일치하지 않습니다.");
					}
				}	
				break;
			case 2:
				if(keyAcc == 0 && keyPw == 0) {
					System.out.println("로그아웃 상태입니다.");
				}
				else {
					keyAcc = 0;
					keyPw = 0;
					System.out.println("로그아웃 되었습니다.");
				}
				break;
			case 0:	
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();
	}
}
