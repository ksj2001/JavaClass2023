package if_test;

public class Ifexample {

	public static void main(String[] args) {
		int age = 30;
		int charge = 0;
		String name;
		if (age<8) {
			name = "���� �� �Ƶ�";
			charge = 1000;
		}
		else if (age<14) {
			name = "�ʵ��л�";
			charge = 2000;
		}
		else if (age<14) {
			name = "��,����л�";
			charge = 2500;
		}
		else {
			name = "�Ϲ���";
			charge = 3000;
		}
		System.out.println(name+"�Դϴ�.");
		System.out.println("������ "+charge+"�� �Դϴ�.");
	}
}
