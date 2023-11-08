package loop;

public class Loop_Example02 {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		int result = 0;
		
		while(num1<=9) {
			num2 = 1; // 초기값 num2를 while문 안에 넣어야 두 번째 while문의 num2=1로 다시 초기화돼서 1부터 9까지 조건을 만족할 수 있기 때문 
			while(num2<=9) {
				result = num1*num2;
				System.out.println(num1+" 곱하기 "+num2+"는 "+result);
				num2++; // num2 = 2;
			}
			System.out.println();
			num1++;
			System.out.println(num1);
			System.out.println(num2);
		}
		
	}
}
