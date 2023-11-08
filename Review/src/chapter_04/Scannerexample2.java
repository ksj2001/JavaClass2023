package chapter_04;
import java.util.*;
public class Scannerexample2 {
	public static void main(String[] args) {
		System.out.println("가위 바위 보! (가위[0],바위[1],보[2])");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		int com = 1;
		
		if(me<0 || me>2) {
			System.out.println("입력값 오류 (0~2 사이의 숫자만 입력 가능)");
		}
		else if(me==com) {
			System.out.println("상대는 바위를 냈다!"); // 상대: com
			System.out.println("비겼다.");
		}
		else if(me>com) {
			System.out.println("상대는 바위를 냈다!");
			System.out.println("내가 이겼다."); // 나: me
		}
		else {
			System.out.println("상대는 바위를 냈다!");
			System.out.println("내가 졌다.");
		}
		scan.close();
	}
}
