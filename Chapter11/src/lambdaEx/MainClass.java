package lambdaEx;

// 함수형 인터페이스라고 알려주는 Annotation
@FunctionalInterface
interface LambdaInterface1 {
	void show(String s1, String s2, String s3);
	//void show2(String s4);
	
}

@FunctionalInterface
interface LambdaInterface2 {
	void method(String s1);
}

@FunctionalInterface
interface LambdaInterface3 {
	int show();
}

@FunctionalInterface
interface LambdaInterface4 {
	int show(int x, int y);
}
public class MainClass {

	public static void main(String[] args) {
		LambdaInterface1 lam1 = (s1,s2,s3) -> {System.out.println(s1+" "+s2+" "+s3);};
		lam1.show("JAVA", "coding", "fun");
		
		lam1.show("Apple", "Bee", "Cat");
		
		//매개변수가 하나일 때는 매개변수의 괄호와 실행문의 중괄호를 모두 생략할 수 있다.
		LambdaInterface2 lam2 = s1 -> System.out.println(s1);
		lam2.method("Good Morning!");
		
		//매개변수가 없을 때에는 괄호를 반드시 입력한다.
		LambdaInterface3 lam3 = () -> (int)(Math.random()*5)+1;
		System.out.println(lam3.show());
		
		//return값이 존재할 때에는 반드시 중괄호를 입력한다. 구문과 구문 사이는 세미콜론으로 구분한다.
		LambdaInterface4 lam4 = (x,y) -> {int result = x + y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x - y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x * y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x / y; return result;};
		System.out.println(lam4.show(15, 5));
		
		// 익명 인터페이스로 작성
		LambdaInterface2 lam22 = new LambdaInterface2() {
			@Override
			public void method(String s1) {
				System.out.println(s1);
			}
		};
		lam22.method("Hi");
	}

}
