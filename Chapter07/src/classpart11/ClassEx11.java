package classpart11;

public class ClassEx11 {
	String name;
	static int atm = 0; // �ν��Ͻ��� ������ �ٸ� �� static�̶�� ���۷����� ����ִ� ���� �����Ѵ�
	 // int atm = 0; �ν��Ͻ��� ������ �޶� atm�� �ʱⰪ�� �� 0���� ���
	public ClassEx11(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		atm += money;
		System.out.println("atm = "+atm);
	}
	public void transMoney(int money) {
		atm -= money;
		System.out.println("atm = "+atm);
	}
	public void getInfo() {
		System.out.println(this.name+" = "+atm);
	}
}
