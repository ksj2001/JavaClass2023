package classpart09;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		int[] x = new int[5]; // 매개변수 값 지정 
		ClassEx9 c = new ClassEx9();
		c.test1(x);
		System.out.println("학생점수 = "+Arrays.toString(x));
		System.out.println("학생총점 = "+c.scoreTotal(x));
		System.out.println("학생전체평균 = "+c.scoreAverage(x));
		System.out.println("1등 점수 = "+c.searchFirst(x));
		System.out.println("꼴등 점수 = "+c.searchLast(x));
	}
}
