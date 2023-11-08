package if_test;
import java.util.*;
public class Ifexample6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("정수1 입력 : ");
		num1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = scan.nextInt();
		System.out.print("정수3 입력 : ");
		num3 = scan.nextInt();
		
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
