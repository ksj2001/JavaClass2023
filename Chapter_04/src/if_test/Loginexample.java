package if_test;
import java.util.*;
public class Loginexample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID: ");
		int input_id = scan.nextInt();
		System.out.print("PW: ");
		int input_pw = scan.nextInt();
		int db_id = 1234;
		int db_pw = 1111;
		if ((input_id == db_id)&&(input_pw == db_pw)) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		scan.close();
	}
}
