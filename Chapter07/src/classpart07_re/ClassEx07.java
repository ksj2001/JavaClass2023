package classpart07_re;
import java.util.*;
public class ClassEx07 {
	Scanner scan = new Scanner(System.in);
	// 멤버변수
	// 문제 각 멤버변수에 적절한 접근제어자를 입력하여 코딩을 리뉴얼 하세요
	
	private String[]arAcc = {"1111","2222","3333","4444","5555"};
	private String[]arPw = {"1234","2345","3456","4567","5678"};
	public int[] arMoney = {87000,34000,17500,98000,12500};
	public int count = 5;
	public int menu = -1;
	public boolean run = true;
	private String signUpAcc = ""; // 회원가입으로 생성하려는 ID
	private String signUpPw = ""; // 회원가입 생성하려는 PW
	public int signUpMoney = 1000; // 회원가입으로 주어지는 기본 계좌금액
	public int cnt = 5; // 아이디, 비밀번호, 계좌 값의 개수
	private String inputAcc = ""; // 로그인 하려는 ID
	private String inputPw = ""; // 로그인 하려는 PW
	public int inputMoney = 0; // 입금할 금액
	public String transferAcc = ""; // 이체받을 계좌번호
	public int transferLog = -1; // 이체받을 계좌번호의 위치
	public int transferMoney = 0; // 이체할 금액
	public int overlap = 0; // 중복 확인 키값. -1은 중복된다는 것을 나타냄

	public String[] getArAcc() {
		return arAcc;
	}
	public void setArAcc(String[] arAcc) {
		this.arAcc = arAcc;
	}
	public String[] getArPw() {
		return arPw;
	}
	public void setArPw(String[] arPw) {
		this.arPw = arPw;
	}
	public String getSignUpAcc() {
		return signUpAcc;
	}
	public void setSignUpAcc(String signUpAcc) {
		this.signUpAcc = signUpAcc;
	}
	public String getSignUpPw() {
		return signUpPw;
	}
	public void setSignUpPw(String signUpPw) {
		this.signUpPw = signUpPw;
	}
	public String getInputAcc() {
		return inputAcc;
	}
	public void setInputAcc(String inputAcc) {
		this.inputAcc = inputAcc;
	}
	public String getInputPw() {
		return inputPw;
	}
	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}
	//--------------------------------------------------------------------------------------------
	// 3333 로그인 중
	int loginCheck = 2;
	String currentStatus = arAcc[loginCheck]+" 로그인";

	//생성자
	public void menu() { // 메뉴 함수
		while(run) {
			System.out.println("-------------------------");
			System.out.println("계좌번호   비밀번호   계좌잔액");
			System.out.println("-------------------------");
			for(int i=0;i<cnt;i++) {
				System.out.println(arAcc[i]+"    "+arPw[i]+"    "+arMoney[i]);
			}
			System.out.println("-------------------------");
			System.out.println("상태 : "+currentStatus);
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
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				signUp();
				break;
			case 2:
				delete();
				break;
			case 3:
				logIn();
				break;
			case 4:
				logOut();
				break;
			case 5:
				deposit();
				break;
			case 6:
				transfer();
				break;
			case 7:
				check();
				break;
			case 0:
				end();
				break;
			}	
		}
	}
	//메서드
	public void signUp() {
		overlap = 0; // 중복값 키 초기화
		System.out.print("계좌번호를 입력하세요 : ");
		signUpAcc = scan.next();
		for(int i=0;i<arAcc.length;i++) {
			if(signUpAcc.equals(arAcc[i])) { // 계좌번호 배열 중에 생성하려는 ID와 같은 것이 있을 경우
				System.out.println("중복되는 계좌번호 입니다.");
				overlap = -1;
			}	
		}
		if(overlap!=-1) { // 중복되지 않았을 경우
			System.out.print("비밀번호를 입력하세요 : ");
			signUpPw = scan.next();
			String[] newArAcc = new String[arAcc.length + 1]; // 계좌번호 배열 길이 늘려주기
			for (int i = 0; i < arAcc.length; i++) {
				newArAcc[i] = arAcc[i];
				arAcc[i] = newArAcc[i];
			}
			String[] newArPw = new String[arPw.length + 1]; // 비밀번호 배열 길이 늘려주기
			for (int i = 0; i < arPw.length; i++) {
				newArPw[i] = arPw[i];
				arPw[i] = newArPw[i];
			}
			int[] newArMoney = new int[arMoney.length + 1]; // 계좌금액 배열 길이 늘려주기
			for (int i = 0; i < arMoney.length; i++) {
				newArMoney[i] = arMoney[i];
				arMoney[i] = newArMoney[i];
			}
			//배열을 늘려주는 것에서부터 막힘
			arAcc[cnt] = signUpAcc;
			arPw[cnt] = signUpPw;
			arMoney[cnt] = signUpMoney;
			cnt++;
		}	
	}
	public void delete() {
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("탈퇴되었습니다. 안녕히가십시오.");
			for(int i=loginCheck;i<cnt-1;i++) {
				arAcc[i] = arAcc[i+1];
				arPw[i] = arPw[i+1];
				arMoney[i] = arMoney[i+1];
			}
			cnt--;
			loginCheck = -1;
			System.out.println("샘플출력"+cnt);
			currentStatus = "로그아웃";
		}
	}
	public void logIn() {
		if(loginCheck==-1) {
			System.out.print("ID입력 : ");
			inputAcc = scan.next();
			System.out.print("PW입력 : ");
			inputPw = scan.next();
			for(int i=0;i<arAcc.length;i++) {
				if(arAcc[i].equals(inputAcc)&&arPw[i].equals(inputPw)) {
					System.out.println(arAcc[i]+"님, 환영합니다.");
					loginCheck = i;
					currentStatus = arAcc[loginCheck]+" 로그인";
				}
			}
			if(loginCheck==-1) {
				System.out.println("ID와 PW를 확인해주세요.");
			}
		}
		else {
			System.out.println("이미 로그인 된 상태입니다.");
		}
	}
	
	public void logOut() {
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("로그아웃 되었습니다.");
			loginCheck = -1;
			currentStatus = "로그아웃";
		}
	}
	
	public void deposit() { // 입금하기 함수
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.print("입금할 금액을 입력하세요 : ");
			inputMoney = scan.nextInt();
			arMoney[loginCheck] += inputMoney;		
		}
	}
	public void transfer() { // 이체하기 함수
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.print("이체할 계좌번호를 입력하세요 : ");
			transferAcc = scan.next();
			for(int i=0;i<cnt;i++) {
				if(transferAcc.equals(arAcc[i])) {
					transferLog = i;
				}
			}
			if(transferLog == -1) {
				System.out.println("유효하지 않은 계좌번호입니다.");
			}
			else {
				System.out.print("이체할 금액을 입력하세요 : ");
				transferMoney = scan.nextInt();
				if(transferMoney>arMoney[loginCheck]) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					System.out.println(loginCheck+""+transferLog);
					arMoney[loginCheck] -= transferMoney;
					arMoney[transferLog] += transferMoney;
				}	
			}		
		}
	}
	public void check() { // 잔액조회 함수
		if(loginCheck==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("계좌번호: "+arAcc[loginCheck]);
			System.out.println("현재 잔액: "+arMoney[loginCheck]);
		}
	}
	public void end() { // 종료하기 함수
		System.out.println("프로그램 종료");
		run = false;
	}
}
