package chapter_06;

import java.util.Scanner;

public class ArrayExample05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		
		// 문제) 학번을 입력받아 성적 출력
		//      단, 없는 학번 입력 시 예외처리
		
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		int index = -1; // 인덱스 값 초기화
		
		for(int i = 0; i < 5 ; i++) {
			if(hakbuns[i]==hakbun)
				index = i; // 인덱스 값 설정
		}
		
		if(index==-1) { // 인덱스 값이 설정되지 않았다면 (없는 학번 입력)
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		
		else {
			System.out.println("성적 : "+scores[index]+"점"); // 인덱스 값으로 성적 출력
		}
		
		scan.close();
	}

}
