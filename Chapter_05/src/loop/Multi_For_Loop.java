package loop;
import java.util.*;
public class Multi_For_Loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int num = scan.nextInt();
		//for(int i=1;i<=9;i++) {
		//	System.out.println(num+" X "+i+" = "+(num*i));
		for(int i=num;i<=num;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		scan.close();
	}
}

