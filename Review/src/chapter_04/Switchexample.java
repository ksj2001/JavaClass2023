package chapter_04;
import java.util.*;
public class Switchexample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = scan.nextInt();
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31일");
			break;
			
			case 2:
				System.out.println("28일");
			break;
			
			case 4: case 6: case 9: case 11:
				System.out.println("30일");
			break;
			
			default:
				System.out.println("범위 오류 (1~12까지만 입력 가능)");
			break;
		}
		scan.close();
	}
}
