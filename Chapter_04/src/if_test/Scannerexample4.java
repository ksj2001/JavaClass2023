package if_test;
import java.util.*;
public class Scannerexample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 회원가입 ===");
		System.out.print("가입할 Id를 입력하세요 : ");
		int db_Id = scan.nextInt();
		System.out.print("가입할 Pw를 입력하세요 : ");
		int db_Pw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		System.out.println("=== 로그인 ===");
		System.out.print("Id 입력 : ");
		int input_Id = scan.nextInt();
		System.out.print("Pw 입력 : ");
		int input_Pw = scan.nextInt();
		if ((db_Id == input_Id)&&(db_Pw == input_Pw)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		scan.close();
	}
}
