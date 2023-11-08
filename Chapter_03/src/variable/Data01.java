package variable;

public class Data01 {

	public static void main(String[] args) {
		byte num = -128;
		byte num2 = 127;
		int num3 = 12345;
		//모든 숫자는 기본적으로 4byte에 저장하려고 하는 습성이 있다
		//4byte보다 더 큰 수를 넣으려고 하면 오류가 뜬다(out of range)
		long num4 = 123456789000L;
		//정수형의 기본 자료형은 int이다
		//4byte보다 더 큰 숫자를 넣으려면
		//숫자 뒤에 L(식별자)을 넣으면 된다
		System.out.println("num3 = " +num3 +
				"num4 = "+num4);
		
		float num5 = 3.14F;
		double num6 = 3.14;
		//실수형의 기본 자료형은 double이다
		System.out.println("num5 = "+num5);
		System.out.println("num6 = "+num6);
		
		boolean ismarried = false;
		
		
	}

}
