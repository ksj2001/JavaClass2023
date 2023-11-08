package if_test;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = scan.nextInt();
		int max = num1;
		//if ((num1>num2 && num1>num3)||(num1>num2 && num1==num3)
		//		||(num1==num2 && num1>num3)||(num1==num2 && num1==num3)) {
	//			max = num1;
	//	}
	//	if ((num2>num1 && num2>num3)||(num2>num1 && num2==num3)) {
	//			max = num2;
	//		}
	//	if (num3>num1 && num3>num2) {
	//			max = num3;
	//		}
		if (max<num2) {
			max = num2;
		}
		if (max<num3) {
			max = num3;
		}
		System.out.println("최대값 = "+max);
		scan.close();
		
		
	}
}
