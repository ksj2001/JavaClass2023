package chapter_06;
import java.util.*;
public class ArrayExample11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int hakbun1 = 0; // 입력할 학번 1
		int hakbun2 = 0; // 입력할 학번 2
		int index1 = -1; // 학번1의 인덱스
		int index2 = -1; // 학번2의 인덱스
		int temp = 0; // 임시값
		
		// 문제) 학번 2개를 입력받아 성적 교체하기
		System.out.print("학번1 입력 : ");
		hakbun1 = scan.nextInt();
		System.out.print("학번2 입력 : ");
		hakbun2 = scan.nextInt();
		
		// 입력한 학번을 통해 인덱스값 얻어내기
		for(int i=0 ; i<5 ; i++) { 
			if(hakbuns[i]==hakbun1) {
				index1 = i;  // 일치하는 학번의 인덱스를 인덱스1로 설정
			}
		}
		for(int i=0 ; i<5 ; i++) {
			if(hakbuns[i]==hakbun2) {
				index2 = i; // 일치하는 학번의 인덱스를 인덱스2로 설정
			}
		}
		
		// 얻어낸 인덱스값으로 성적 교체하기
		temp = scores[index1];
		scores[index1] = scores[index2];
		scores[index2] = temp;
		
		// 교체된 성적 출력
		for(int i=0 ; i<5 ; i++) {
			System.out.print(scores[i]+" ");
		}
		
		scan.close();
	}
}
