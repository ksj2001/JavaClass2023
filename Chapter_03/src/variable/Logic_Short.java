package variable;

public class Logic_Short {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 1;
		System.out.println((num = num+10) > 10 
				&& (num2 = num2 + 10) > 15);
		System.out.println(num);
		//num = num+10 ������ 20�� ��
		System.out.println(num2);
		//���� ���� false�� ���� ��(num2 ��)�� �������� ����
		
		int su = 100;
		System.out.println(su > 50 ? 10 : 20);
		// System.out.println( <����> ? ��1 : ��2);
		// ������ true�� ��1, false�̸� ��2 ����
	}

}
