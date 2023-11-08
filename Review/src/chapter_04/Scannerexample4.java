package chapter_04;
import java.util.*;
public class Scannerexample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = 0;
		int pw = 0;
		int inputId = 0;
		int inputPw = 0;
		
		System.out.println("=== 회원가입 ===");
		System.out.print("가입할 Id를 입력하세요 : ");
		id = scan.nextInt();
		System.out.print("가입할 Pw를 입력하세요 : ");
		pw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		
		System.out.println("=== 로그인 ===");
		System.out.print("ID 입력 : ");
		inputId = scan.nextInt();
		System.out.print("PW 입력 : ");
		inputPw = scan.nextInt();
		
		if(id==inputId && pw==inputPw) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		scan.close();
	}
}
