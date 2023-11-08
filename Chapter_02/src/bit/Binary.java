package bit;

public class Binary {

	public static void main(String[] args) {

		int num = 10; // 10진수
		int bnum = 0B1010; // 2진수
		int onum = 012; // 8진수
		int xnum = 0xA; // 16진수
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(onum);
		System.out.println(xnum);
		int su = 0B00000000000000000000000000001010;
		int su2 = 0B11111111111111111111111111110101;
		//1의 보수
		int su3 = 0B11111111111111111111111111110110;
		//2의 보수 *** 이게 왜 음수? ***
		System.out.println(su);
		System.out.println(su3);
		System.out.println(su+su3);
		//음수일 때 맨 앞의 수는 1, 양수일 때는 0
		int su4 = 0B1011;
		System.out.println(su4);
		// *** 이건 앞에 1이 있는데도 왜 음수가 아닌지 ***
		int su5 = 0B10000000000000000000000000000000;
		System.out.println(su5);
		// *** int가 4바이트(32비트)여서?? ***
		
	}

}
