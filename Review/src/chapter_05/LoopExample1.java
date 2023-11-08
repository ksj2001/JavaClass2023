package chapter_05;

public class LoopExample1 {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		for (int a = 1; a <= 10; a++) {
			if (a >= 5 && a <= 9) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		for (int b = 10; b >= 1; b--) {
			if (b >= 3 && b <= 6) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		// 문제3) 1~10까지 반복해 짝수만 출력
		for (int c = 1; c <= 10; c++) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
	}
}
