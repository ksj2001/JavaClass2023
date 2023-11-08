package chapter_06;
import java.util.*;
public class ArrayExample03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		System.out.print("인덱스 입력 :");
		int index = scan.nextInt();
		System.out.println("성적: "+arr[index]+"점");
		
		// 문제2) 성적을 입력받아 인덱스 출력
		System.out.print("성적 입력 :");
		int score = scan.nextInt();
		for(int i = 0; i < 5 ; i++) {
			if(arr[i]==score)
				index = i;
		}
		System.out.println("인덱스: "+index);
		
		scan.close();
	}
}
