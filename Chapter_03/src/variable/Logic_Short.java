package variable;

public class Logic_Short {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 1;
		System.out.println((num = num+10) > 10 
				&& (num2 = num2 + 10) > 15);
		System.out.println(num);
		//num = num+10 때문에 20이 됨
		System.out.println(num2);
		//앞의 것이 false라서 뒤의 것(num2 값)은 더해지지 않음
		
		int su = 100;
		System.out.println(su > 50 ? 10 : 20);
		// System.out.println( <조건> ? 식1 : 식2);
		// 조건이 true면 식1, false이면 식2 실행
	}

}
