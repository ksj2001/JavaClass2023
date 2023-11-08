package chapter_06;

public class ArrayExample06 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제) 1등학생의 학번과 성적 출력
		int max = 0;
		for(int i=0 ; i<5 ; i++) {
			if(scores[i]>max) 
				max = scores[i];
		}
		
		int index = -1; // 인덱스 값 초기화
		for(int i = 0; i < 5 ; i++) {
			if(scores[i]==max) // 최댓값인 점수(1등학생의 성적) 찾기
				index = i; // 1등학생 성적의 인덱스 값 설정
		}
		
		System.out.println(hakbuns[index]+"번("+scores[index]+"점)");
	}
}
