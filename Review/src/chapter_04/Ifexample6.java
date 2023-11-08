package chapter_04;
import java.util.Scanner;
public class Ifexample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = scan.nextInt();
		
		int max = num1;
		if(max<num2) {
			max = num2;
		}
		if(max<num3) {
			max = num3;
		}
		
		System.out.println("최대값 = "+max);
		
		scan.close();
	}
}
