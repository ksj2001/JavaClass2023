package loop;
import java.util.*;
public class Loop_Example04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num1;
		int num2;
		int ans;
		int count = 0;
		int score = 0;
		while(count<5) {
			num1 = ran.nextInt(8)+2;
			num2 = ran.nextInt(9)+1;
			System.out.print(num1+" X "+num2+" = ");
			ans = scan.nextInt();
			if(num1*num2==ans) {
				score += 20;
			}
			count++;
		}
		System.out.println("¼ºÀû =  "+score+"Á¡");
		scan.close();
	}
}
