package chapter_05;

public class LoopExample2 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		int total = 0;
		int a = 1;
		while (a <= 5) {
			total += a;
			a++; // 1씩 추가시키는 로직
		}
		System.out.println(total);

		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		int sum = 0; // 문제2에 맞는 수들의 합
		int count = 0; // 문제2에 맞는 수들의 개수
		int b = 1;
		while (b <= 10) {
			if(b<3 || b>=7) { // 3미만 7이상
				System.out.print(b+" "); // 3미만 7이상만 출력
				sum += b; // 문제2에 맞는 수들의 합 구하기
				count += 1; // 문제2에 맞는 수들의 개수 구하기
				// b++; ← 여기에 쓰면 b값이 1,2,3,3,3... 처럼 반복되서 무한루프에 걸림
			}
			b++;
		}
		System.out.println();
		System.out.println(sum); // 문제3) 문제2에 맞는 수들의 합 출력
		System.out.println(count); // 문제4) 문제2에 맞는 수들의 개수 출력
	}
}
