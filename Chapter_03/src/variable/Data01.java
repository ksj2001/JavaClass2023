package variable;

public class Data01 {

	public static void main(String[] args) {
		byte num = -128;
		byte num2 = 127;
		int num3 = 12345;
		//��� ���ڴ� �⺻������ 4byte�� �����Ϸ��� �ϴ� ������ �ִ�
		//4byte���� �� ū ���� �������� �ϸ� ������ ���(out of range)
		long num4 = 123456789000L;
		//�������� �⺻ �ڷ����� int�̴�
		//4byte���� �� ū ���ڸ� ��������
		//���� �ڿ� L(�ĺ���)�� ������ �ȴ�
		System.out.println("num3 = " +num3 +
				"num4 = "+num4);
		
		float num5 = 3.14F;
		double num6 = 3.14;
		//�Ǽ����� �⺻ �ڷ����� double�̴�
		System.out.println("num5 = "+num5);
		System.out.println("num6 = "+num6);
		
		boolean ismarried = false;
		
		
	}

}
