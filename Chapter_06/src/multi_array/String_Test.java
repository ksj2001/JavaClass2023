package multi_array;
import java.util.*;
public class String_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myName = "홍길동";
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next(); // 문자를 입력할 때 쓰는 함수
		//System.out.println(name);
		/*
		 * if(name == myName) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 * 
		 * if(name.equals(myName)) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 */
		
		String a = new String(" hongpossible");
		String b = new String(" hongpossible");
		
		if(a==b) {
			System.out.println("true");
		}
		if(a.equals(b)) {
			System.out.println("A와 B는 같다");
		}
	}

}
