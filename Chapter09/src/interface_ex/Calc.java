package interface_ex;

public interface Calc {
	// 인터페이스에는 추상 메서드와 상수만 존재한다.
	// 추상 메서드와 상수는 키워드를 지정하지 않아도 컴파일이 될 때 자동으로 abstract과 final이 생성된다.
	// 인터페이스는 구현할 수 없으며 다른 클래스들의 명세서 역할을 한다.
	public static final float pi = 3.14f;
	int error = -99999;

	public abstract int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);

	// 디폴트 메서드 : 기본 구현을 가지는 메서드로 , 구현코드에서 재정의 할 수 있음
	default void description() { 
		System.out.println("점수 계산기를 구현 합니다.");
		//myMethod();
	}

	/*
	// 정적 메서드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있음
	public static int total(int[] arr) { 
		int total = 0;
		for(int i=0;i<=arr.length;i++) {
			total += i;
		} 
		//myStaticMethod();
		return total;
	}
	
	// private 메서드 : 인터페이스 내부에서만 사용 가능, 구현한 클래스에서 사용하거나 재정의 할 수 없음 
	// private 메서드는 default 메서드에서 사용 가능
	private void myMethod() { 
		System.out.println("private 메서드 입니다.");
	}
	// private static 메서드는 static 메서드에서 사용 가능
	private static void myStaticMethod() { 
		System.out.println("myStaticMethod 메서드 입니다.");
	}
	*/
}
