package interface_ex;

public interface Calc {
	// �������̽����� �߻� �޼���� ����� �����Ѵ�.
	// �߻� �޼���� ����� Ű���带 �������� �ʾƵ� �������� �� �� �ڵ����� abstract�� final�� �����ȴ�.
	// �������̽��� ������ �� ������ �ٸ� Ŭ�������� ���� ������ �Ѵ�.
	public static final float pi = 3.14f;
	int error = -99999;

	public abstract int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);

	// ����Ʈ �޼��� : �⺻ ������ ������ �޼���� , �����ڵ忡�� ������ �� �� ����
	default void description() { 
		System.out.println("���� ���⸦ ���� �մϴ�.");
		//myMethod();
	}

	/*
	// ���� �޼��� : �ν��Ͻ� ������ ������� �������̽� Ÿ������ ����� �� ����
	public static int total(int[] arr) { 
		int total = 0;
		for(int i=0;i<=arr.length;i++) {
			total += i;
		} 
		//myStaticMethod();
		return total;
	}
	
	// private �޼��� : �������̽� ���ο����� ��� ����, ������ Ŭ�������� ����ϰų� ������ �� �� ���� 
	// private �޼���� default �޼��忡�� ��� ����
	private void myMethod() { 
		System.out.println("private �޼��� �Դϴ�.");
	}
	// private static �޼���� static �޼��忡�� ��� ����
	private static void myStaticMethod() { 
		System.out.println("myStaticMethod �޼��� �Դϴ�.");
	}
	*/
}
