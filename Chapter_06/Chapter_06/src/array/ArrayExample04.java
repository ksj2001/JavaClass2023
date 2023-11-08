package array;
import java.util.*;
public class ArrayExample04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun;
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(hakbun==hakbuns[i]) {
				System.out.println("성적 : "+scores[i]+"점");
			}
		}
	}
}
