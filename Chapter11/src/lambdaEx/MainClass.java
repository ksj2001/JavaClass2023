package lambdaEx;

// �Լ��� �������̽���� �˷��ִ� Annotation
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
		
		//�Ű������� �ϳ��� ���� �Ű������� ��ȣ�� ���๮�� �߰�ȣ�� ��� ������ �� �ִ�.
		LambdaInterface2 lam2 = s1 -> System.out.println(s1);
		lam2.method("Good Morning!");
		
		//�Ű������� ���� ������ ��ȣ�� �ݵ�� �Է��Ѵ�.
		LambdaInterface3 lam3 = () -> (int)(Math.random()*5)+1;
		System.out.println(lam3.show());
		
		//return���� ������ ������ �ݵ�� �߰�ȣ�� �Է��Ѵ�. ������ ���� ���̴� �����ݷ����� �����Ѵ�.
		LambdaInterface4 lam4 = (x,y) -> {int result = x + y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x - y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x * y; return result;};
		System.out.println(lam4.show(15, 5));
		
		lam4 = (x,y) -> {int result = x / y; return result;};
		System.out.println(lam4.show(15, 5));
		
		// �͸� �������̽��� �ۼ�
		LambdaInterface2 lam22 = new LambdaInterface2() {
			@Override
			public void method(String s1) {
				System.out.println(s1);
			}
		};
		lam22.method("Hi");
	}

}
