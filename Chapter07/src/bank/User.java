package bank;

import java.util.*;

public class User {
	
	//멤버변수
	Scanner scan = new Scanner(System.in);
	String[] arAcc = {"1111","2222","3333","",""};
	String[] arPw = {"1234","2345","3456" ,"",""};
	static int[] arMoney = {87000,34000,17500,0,0};
	String signUpAcc = ""; // 회원가입으로 생성하려는 ID
	String signUpPw = ""; // 회원가입으로 생성하려는 PW
	String inputAcc = ""; // 로그인 하려는 ID
	String inputPw = ""; // 로그인 하려는 PW
	int cnt = 3; // 현재 데이터베이스에 존재하는 계좌의 개수
	static int log = -1; // 로그인 확인용 키값 (로그값을 공유시키기 위해 static 사용)
	int overlap = 0; // 중복 확인 키값. -1은 중복된다는 것을 나타냄
	
	//함수
	public void signUp() { // 회원가입 함수
		if(log!=-1) {
			System.out.println("로그아웃 후 이용해 주십시오.");
		}
		else {
			if(cnt>5) {
				System.out.println("더 이상 회원가입이 불가능합니다. (최대 5명까지 가입 가능)");
			}
			else {
				System.out.print("가입할 계좌번호를 입력하세요 : ");
				signUpAcc = scan.next();
				for(int i=0;i<arAcc.length;i++) {
					if(signUpAcc.equals(arAcc[i])) {
						overlap = -1;
					}
				}
				if(overlap==-1) {
					System.out.println("중복되는 계좌번호입니다.");
				}
				else {
					System.out.print("패스워드를 입력하세요 : ");
					signUpPw = scan.next();
					arAcc[cnt] = signUpAcc;
					arPw[cnt] = signUpPw;
					arMoney[cnt] = 1000;
					cnt++;
					System.out.println("회원가입을 축하드립니다.");
				}
			}
		}
	}
	
	public void delete() { // 회원탈퇴 함수
		if(log==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			if(cnt<1) {
				System.out.println("더 이상 회원탈퇴가 불가능합니다. (현재 가입 중인 회원이 없음)");
			}
			else {
				for(int i=log;i<cnt-1;i++) {
					arAcc[i] = arAcc[i+1];
					arPw[i] = arPw[i+1];
					arMoney[i] = arMoney[i+1];
				}
				cnt--;
				log = -1;
				System.out.println("탈퇴되었습니다. 안녕히가십시오.");
			}
		}
	}
	
	public int logIn() { // 로그인 함수
		if(log==-1) {
			System.out.print("계좌번호를 입력하세요 : ");
			inputAcc = scan.next();
			System.out.print("비밀번호를 입력하세요 : ");
			inputPw = scan.next();
			for(int i=0;i<arAcc.length;i++) {
				if(inputAcc.equals(arAcc[i]) && inputPw.equals(arPw[i])) {
					log = i;
				}
			}
			if(log==-1) {
				System.out.println("계좌번호와 패스워드를 다시 한 번 확인해주세요.");
			}
			else {
				System.out.println("로그인 성공!");
			}
		}
		else {
			System.out.println("이미 로그인 된 상태입니다.");
		}
		System.out.println(log);
		return log;
	}
	
	public void logOut() { // 로그아웃 함수
		if(log==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("로그아웃 되었습니다.");
			log = -1;
		}
	}
}
