package chapter_06;
import java.util.*;
public class ArrayExample04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		
		// 문제3) 학번을 입력받아 성적 출력
		
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		int index = 0; // 인덱스 값 초기화
		for(int i = 0; i < 5 ; i++) {
			if(hakbuns[i]==hakbun)
				index = i; // 인덱스 값 설정
		}
		System.out.println("성적 : "+scores[index]+"점"); // 인덱스 값으로 성적 출력
		
		scan.close();
	}

}
