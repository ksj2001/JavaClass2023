package megamart;
import java.util.*;
public class User {
	Scanner scan = new Scanner(System.in);
	// 멤버 변수
	String[]id = {"qwer","javaking","abcd","kjb","ckr"};
	String[]pw = {"1111","2222","3333","5555","6666"};
	String inputId = null;
	String inputPw = null;
	int log = -1; // 로그인 확인용 키값
	//함수
	public void logIn() { // 로그인 함수
		if(log != -1) { // 로그인 키값이 -1이 아니면 이미 로그인되었다는 뜻
			System.out.println("이미 로그인되어 있습니다.");
		}
		else {
			System.out.print("ID입력: ");
			inputId = scan.next();
			System.out.print("PW입력: ");
			inputPw = scan.next();
			for(int i=0;i<id.length;i++) {
				if(id[i].equals(inputId) && pw[i].equals(inputPw)) {
					System.out.println("["+id[i]+"]님, 환영합니다.");
					log = i;
				}
			}
			if(log==-1) {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
			}
		}
	}
	
	public void logOut() { // 로그아웃 함수
		if(log==-1) {
			System.out.println("로그인 후 이용 가능합니다.");
		}
		else {
			System.out.println("안녕히계세요.");
			log = -1;
		}
	}
}
