package array;
import java.util.*;
public class ArrayExample03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {87,11,45,98,23};
		int index;
		int score;
		System.out.print("인덱스 입력 : ");
		index = scan.nextInt();
		System.out.println("성적 : "+arr[index]+"점");
		System.out.print("성적 입력 : ");
		score = scan.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==score) {
				System.out.println("인덱스 : "+i);
			}
		}
	}
}
