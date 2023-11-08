package referclass;

class MyInteger {
	int a;
	public MyInteger(int a) {
		this.a = a;
	}
}

public class ReClass {

	public static void main(String[] args) {
		int a = 10; // 기본 자료형
		Integer i = 10; // 참조 자료형 new Integer(10);
		
		float b = 10.1f;
		Float f = 10.1F;
		
		double d = 10.11;
		Double dd = 10.11;
		
		MyInteger mi = new MyInteger(50);
		System.out.println(i);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(mi.a);
	}

}
