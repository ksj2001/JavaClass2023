package variable;

public class Operator {

	public static void main(String[] args) {
		int num = 10;
		int mathnum = ++num;
		System.out.println(mathnum);
		System.out.println(num);
		System.out.println();
		int mathnum2 = num++;
		System.out.println(mathnum2);
		System.out.println(num);
		//i = ++num : num값에 +1 이후 i에 num값을 대입
		//i = num++ : i에 num값을 대입 이후 num값에 +1
		
		System.out.println((5>3) && (3>10)); // 둘 중 하나만 틀려도 false
		System.out.println((5>3) || (3>10)); // 둘 중 하나만 맞아도 true
		System.out.println(!(5>3));
		// 조건식이 true면 false, false이면 true 출력
	}

}
