package variable;

public class Printf {

	public static void main(String[] args) {
		//���Ĺ���
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n",10);
		
		int num1 = 20;
		System.out.println("������ ����� "+num1+"�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", num1);
		
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d�� \n",6,2,10);
		
		//����
		int num2 = 30;
		System.out.printf("num2(10����) : %d\n", num2);
		System.out.printf("num2(8����) : %o\n", num2);
		System.out.printf("num2(16����) : %x\n", num2);
		
		//����
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n",'a','A');
		
		//���ڿ�
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n","java","JAVA");
		
		//�Ǽ�
		float f = 1.23f; // float ��� �� ���� �ڿ� f �ʼ�
		System.out.printf("f = %f\n", f);
		
		double d = 1.23456d; // double ��� �� ���� ���� d ���� ����
		System.out.printf("d = %f\n", d);
	}
}
